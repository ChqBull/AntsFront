package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class AntsfrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntsfrontApplication.class, args);
    }

}
