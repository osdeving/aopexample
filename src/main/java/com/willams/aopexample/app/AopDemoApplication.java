package com.willams.aopexample.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AopDemoApplication {

    @Autowired SortUtil sortUtils;

    public static void main(String[] args) {
        SpringApplication.run(AopDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ApplicationContext context) {
        return args -> {
            sortUtils.bubbleSort(
                    List.of(1, 2, 34, 4, 4, 5,534, 453, 34).stream().mapToInt(Integer::intValue).toArray());
        };
    }
}
