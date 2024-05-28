package com.skillbox.cryptobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CryptoBotApplication {

    public static void main(String[] args) {
        //Ogar Mike
        SpringApplication.run(CryptoBotApplication.class, args);
    }

}
