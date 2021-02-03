package com.example.demo.Blog;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.HTML;

@Service
public class blogService {

	private final blogRepository Blogrepository;
	private final tagsService TagsService;

	@Autowired
	public blogService(blogRepository Blogrepository, tagsService TagsService) {
		this.Blogrepository = Blogrepository;
		this.TagsService = TagsService;
	}

	public List<blog> getBlogs() {
		return Blogrepository.findAll();
	}

	public void addnewBlog(blog newblog) {
		this.Blogrepository.save(newblog);
	}

	public List<blog> getBlogbyTag(String tag) {

		tags tagsList = this.TagsService.getChildTags(tag);
		String[] tagName = (tagsList.main_tag + " " + tagsList.child_tags).split(" ");
		List<blog> blogList = this.Blogrepository.findblogsBy(tagName);

		return blogList;
	}

}