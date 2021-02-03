package com.example.demo.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface tagsRepository
        extends JpaRepository<tags, Long> {

    @Query("SELECT t FROM tags t WHERE t.main_tag = ?1" )
    tags findChildTags(String tag);
}