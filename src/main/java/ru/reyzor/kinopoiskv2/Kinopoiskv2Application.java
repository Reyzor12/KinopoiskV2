package ru.reyzor.kinopoiskv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "ru.reyzor.kinopoiskv2")
@EnableJpaRepositories(basePackages = "ru.reyzor.kinopoiskv2.db.repository")
@EntityScan(basePackages = "ru.reyzor.kinopoiskv2.db.entity")
public class Kinopoiskv2Application {

    public static void main(String[] args) {
        SpringApplication.run(Kinopoiskv2Application.class, args);
    }
}
