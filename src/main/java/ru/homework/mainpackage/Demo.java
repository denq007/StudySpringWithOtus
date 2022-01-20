package ru.homework.mainpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.homework.mainpackage.config.AppConfig;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class Demo {

    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }

}

