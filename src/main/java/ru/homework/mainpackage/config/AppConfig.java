package ru.homework.mainpackage.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Configuration
@ConfigurationProperties(prefix = "application")
@Getter
@Setter
public class AppConfig {
    private Locale locale;
    private String csvFileName;
}
