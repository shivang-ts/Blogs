package com.example.demo.Blog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class tagsConfig {

    @Bean
    CommandLineRunner tagscommandLineRunner(tagsRepository tagRepo) {
        return args -> {
            tags tagScience = new tags(
                    "Science",
                    "Physics Chemistry Biology"
            );
            tags tagChemistry = new tags(
                    "Chemistry",
                    "Organic Physical Inorganic"
            );
            tagRepo.saveAll(List.of(tagScience,tagChemistry));
        };
    }
}