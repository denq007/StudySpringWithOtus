package ru.homework.mainpackage;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.homework.mainpackage.service.ReaderCSVImpl;

@SpringBootApplication
@EnableConfigurationProperties
public class Demo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");
        ReaderCSVImpl service = context.getBean(ReaderCSVImpl.class);
        System.out.println(service.loadFile());

    }

}

