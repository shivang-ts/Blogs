package com.example.demo.Blog;
import java.util.*;

import javax.persistence.*;

@Entity
@Table
public class tags {

    @Id // Generates primary keys
    @SequenceGenerator(
            name = "tag_sequence",
            sequenceName = "tag_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tag_sequence"
    )
    @Column
    public long tagId;
    @Column
    public String main_tag;
    @Column
    public String child_tags;

    public tags() {

    }

    public tags(Long tagId,
               String main_tag,
               String child_tags) {

        this.tagId = tagId;
        this.main_tag = main_tag;
        this.child_tags = child_tags;

    }

    public tags(String main_tag,
               String child_tags) {

        this.main_tag = main_tag;
        this.child_tags = child_tags;
    }

    public String getMain_tag() {
        return this.main_tag;
    }

    public void setMain_tag(String main_tag) {
        this.main_tag = main_tag;
    }

    public String getChild_tags(List<tags> childtags) {

        return this.child_tags;
    }

    public void setChild_tags(String child_tags) {
        this.child_tags = child_tags;
    }


    @Override

    public String toString() {
        return "tag{" +
                "id=" + tagId +
                ", main tag='" + main_tag + '\'' +
                ", child tags='" + child_tags +
                '}';
    }
}