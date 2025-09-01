package com.itnetwork.springblog.controllers;

import com.itnetwork.springblog.models.dto.UserDTO;
import com.itnetwork.springblog.models.exceptions.DuplicateEmailException;
import com.itnetwork.springblog.models.exceptions.PasswordsDoNotEqualException;
import com.itnetwork.springblog.models.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    public String renderLogin() {
        return "/pages/account/login.html";
    }

    @GetMapping("register")
    public String renderRegister(@ModelAttribute UserDTO userDTO) { // <-- Here we added a new parameter
        return "/pages/account/register";
    }

    @PostMapping("register")
    public String register(
            @Valid @ModelAttribute UserDTO userDTO,
            BindingResult result,
            RedirectAttributes redirectAttributes
    ) {
        if (result.hasErrors())
            return renderRegister(userDTO);

        try {
            userService.create(userDTO, false);
        } catch (DuplicateEmailException e) {
            result.rejectValue("email", "error", "Email already in use.");
            return "/pages/account/register";
        } catch (PasswordsDoNotEqualException e) {
            result.rejectValue("password", "error", "The passwords do not match.");
            result.rejectValue("confirmPassword", "error", "The passwords do not match.");
            return "/pages/account/register";
        }

        redirectAttributes.addFlashAttribute("success", "User registered.");
        return "redirect:/account/login";
    }

}
