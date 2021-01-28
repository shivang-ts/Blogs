package com.example.demo.Blog;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class blogService {

	//private static long id;
	private static blogRepository Blogrepository;

	@Autowired
	public blogService(blogRepository Blogrepository) {
		this.Blogrepository = Blogrepository;
	}

	public static List<blog> getBlogs() {
		return Blogrepository.findAll();
	}

	public static void addnewBlog(blog newblog) {
		Blogrepository.save(newblog);
	}

	public List<blog> getBlogbyTag(String tag) {
		List<blog> blogresult = Blogrepository.findblogBytag(tag);
		return blogresult;
	}





	/*public static List<blog> getBlogById(long id) {
		blogService.id = id;
		//int nTags = 3;
		//String[] tagsarr = {"Science","Chemistry","Physical chemistry"};
		return Blogrepository.findAllById(id);
	}*/
}
