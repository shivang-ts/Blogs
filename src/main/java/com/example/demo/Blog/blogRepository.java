package com.example.demo.Blog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface blogRepository
        extends JpaRepository<blog, Long> {

    @Query("SELECT b FROM blog b WHERE b.tag = ?1" )
    List<blog> findblogBytag(String tag);

    @Query("SELECT b FROM blog b WHERE b.tag IN ?1")
    List<blog> findblogsBy(String[] tag);
}

