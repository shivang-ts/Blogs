package com.example.demo.Blog;
import java.util.*;

import javax.persistence.*;

@Entity //For hibernate
@Table

public class blog {

    @Id // Generates primary keys
    @SequenceGenerator(
        name = "blog_sequence",
        sequenceName = "blog_sequence",
        allocationSize = 1
        )
    
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "blog_sequence"
        )

    private Long id;
    private String title;
    private String body;
    private String tag;
    //tag = new String["science","chemistry","physical chemistry"];
    /*Use some datattype to store tags as well. Probably a list of string
    Set<String> hash_Set = new HashSet<String>(); 
    hash_Set.add("Geeks"); */
    //private Set<String> tags = new HashSet<String>();
    

    public blog() {
    
    }

    public blog(String title, 
                String body, 
                long id, 
                String tag) {
        this.title = title;
        this.body = body;
        this.id = id;
        this.tag = tag;
    }

    public blog(String title,
                String body,
                String tag) {
        this.title = title;
        this.body = body;
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    /*public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
    }*/

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override

    public String toString() {
        return "blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}

