package com.rock.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearnSpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(LearnSpringbootApplication.class, args);
        applicationContext.getBean("person");
    }

    @Bean(name = "person")
    public Person getPerson(){
        return new Person();
    }

}
