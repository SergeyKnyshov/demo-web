package com.example.demoweb.service;

import ch.qos.logback.core.BasicStatusManager;
import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>() {{
        add(new Post(0l,"Даб даб я", new Date()));
        add(new Post(1l,"Тот самый", new Date()));
        add(new Post(2l,"Мистер Бомбастик", new Date()));
    }};

    public void create(String text) {
        posts.add(new Post( 0l,text, new Date()));
    }

    public List<Post> listAllPosts() {

        return posts;
    }
}
