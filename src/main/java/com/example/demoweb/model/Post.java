package com.example.demoweb.model;

public class Post {
    private long creationDate;

    private String text;

    private Integer likes;
    public Post(String text, long creationDate, Integer likes){
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }


    public String getText() {
        return text;
    }
    public Integer getLikes() {
        return likes;
    }
    public long getCreationDate(){ return creationDate;}

}
