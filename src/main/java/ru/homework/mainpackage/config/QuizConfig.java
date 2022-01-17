package ru.homework.mainpackage.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "application")
@Getter
@Setter
public class QuizConfig {
   private String greeting;
   private List<String> speech;
}
