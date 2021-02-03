package com.example.demo.Blog;
//This class has all the resources for our API

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "myawsesomapi/blogs")

public class blogController {

    private final blogService blogservice;

    @Autowired
    public blogController(blogService blogservice) {

        //this.blogservice = new blogService();
        //avoid using this and instead use dependency injection
        this.blogservice = blogservice;
    }

    @GetMapping
    public List<blog> getBlogs() {
        return blogservice.getBlogs();
    }

    @GetMapping(path = "{tag}")
    public List<blog> getBlogbyTag(@PathVariable("tag") String tag) {
        return blogservice.getBlogbyTag(tag);
    }

    @PostMapping
    public void newBlog(@RequestBody blog newblog){
        blogservice.addnewBlog(newblog);
    }
}