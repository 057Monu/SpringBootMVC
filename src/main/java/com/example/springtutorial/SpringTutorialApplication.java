package com.example.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

    public static void main(String[] args) {
  ConfigurableApplicationContext context = SpringApplication.run(SpringTutorialApplication.class, args);

        System.out.println("Welcome to Boot.....");
    }
}
