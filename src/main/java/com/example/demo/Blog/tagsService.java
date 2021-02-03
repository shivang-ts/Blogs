package com.example.demo.Blog;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tagsService {

    private final tagsRepository Tagsrepository;

    @Autowired
    public tagsService(tagsRepository Tagsrepository) {
        this.Tagsrepository = Tagsrepository;
    }

    public void addnewTag(tags newtag) {
        this.Tagsrepository.save(newtag);
    }

    public tags getChildTags(String tag) {
        return Tagsrepository.findChildTags(tag);
    }

}