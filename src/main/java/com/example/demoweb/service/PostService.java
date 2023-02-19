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
        add(new Post("Даб даб я", new Date(), 0));
        add(new Post("Тот самый", new Date(), 0));
        add(new Post("Мистер Бомбастик", new Date(), 0));
    }};

    public void create(String text) {
        posts.add(new Post(text, new Date(), 0));
    }

    public List<Post> listAllPosts() {

        return posts;
    }
}
