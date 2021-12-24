package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {

    public static void main(String[] args) {
        System.out.println(MySpringBootApplication.class);
        SpringApplication.run(MySpringBootApplication.class);
    }
}
