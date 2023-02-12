package com.example.demoweb.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Post {

    private String text;

    private Integer likes;
    public Post(String text, Integer likes){
        this.text = text;
        this.likes = likes;
    }


    public String getText() {
        return text;
    }
    public Integer Likes() {
        return likes;
    }

}
