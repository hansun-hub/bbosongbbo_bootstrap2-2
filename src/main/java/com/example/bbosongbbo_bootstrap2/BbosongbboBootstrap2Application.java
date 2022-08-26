package com.example.bbosongbbo_bootstrap2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableJpaAuditing
@SpringBootApplication
public class BbosongbboBootstrap2Application {

    public static void main(String[] args) {

        SpringApplication.run(BbosongbboBootstrap2Application.class, args);
    }

}
