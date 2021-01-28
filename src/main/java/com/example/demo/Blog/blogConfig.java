package com.example.demo.Blog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class blogConfig {

    @Bean
    CommandLineRunner commandLineRunner(blogRepository repo) {
        return args -> {
            blog phychemistry = new blog(
                    "Chemistry blog title",
                    "This is Physical chemistry blog body.",
                    "Physical"
            );
            blog orgchemistry = new blog(
                    "Another chemistry blog title",
                    "This is organic blog body",
                    "Organic"
            );
            blog chemistry = new blog(
                    "Chemistry blog title",
                    "This is Chemistry blog body",
                    "Chemistry"
            );
            repo.saveAll(List.of(phychemistry, orgchemistry, chemistry));
        };
    }

}
