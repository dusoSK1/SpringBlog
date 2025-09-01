package com.itnetwork.springblog.models.services;

import com.itnetwork.springblog.models.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    void create(UserDTO user, boolean isAdmin);
}
