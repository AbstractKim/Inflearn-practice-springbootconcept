package com.github.abstarctkim;

import com.github.abstractkim.Peter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Bean
    public Peter peter(){
        Peter peter = new Peter();
        peter.setName("B");
        peter.setAge(20);
        return peter;
    }
}
