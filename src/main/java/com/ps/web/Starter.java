package com.ps.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

//this component is part of infrastructure

@SpringBootApplication
@ComponentScan({"com.ps.web", "com.ps.apps","com.ps.shared"})
public class Starter {

    public static void main(String ... args){
        SpringApplication.run(Starter.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("------------------------------------------------");
            System.out.println("Let's inspect the beans provided by Spring Boot:");
            System.out.println("------------------------------------------------");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String beanName : beanNames){
                System.out.println("-> " + beanName);
            }

        };
    }
}
