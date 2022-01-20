package ru.homework.mainpackage.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Answer {
    private final String answer;

    @Override
    public String toString() {
        return answer;
    }
}


