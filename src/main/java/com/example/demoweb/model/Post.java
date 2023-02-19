package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private Date creationDate;

    private String text;

    private Integer likes;
    private Long id;
    public Post(Long id, String text, Date creationDate){
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;


    }

    public Long getId(){return id;}
    public String getText() {
        return text;
    }
    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate(){ return creationDate;}

}
