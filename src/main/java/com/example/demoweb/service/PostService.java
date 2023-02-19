package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){

        List<Post> list = new ArrayList<>();

        Post firstPost = new Post("Даб даб я", 1212121212121L,0);
        Post secondPost = new Post("Тот самый",1212121212121L,0);
        Post thirdPost = new Post("Мистер Бомбастик",1212121212121L,0);

        list.add(firstPost);
        list.add(secondPost);
        list.add(thirdPost);
        return list;
    }
}
