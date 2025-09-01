package com.itnetwork.springblog.models.dto;

import com.itnetwork.springblog.data.entities.ArticleEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ArticleDTO {
    @NotBlank(message = "Fill in the title")
    @Size(max = 100, message = "Title is too long")
    private String title;

    @NotBlank(message = "Fill in the description")
    private String description;

    @NotBlank(message = "Fill in the content")
    private String content;

    private long articleId;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId){
        this.articleId = articleId;
    }







}
