package com.example.demoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Post {
    private Date creationDate;

    private String text;

    private Integer likes;
    @Id
    @GeneratedValue
    private Long id;
    public Post(){

    }
    public Post(Long id, String text, Date creationDate){
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
    }

    public Long getId(){return id;}
    public void setId(Long id){
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text=text;
    }
    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate(){ return creationDate;}
    public void setCreationDate(Date creationDate){
        this.creationDate = creationDate;
    }


}
