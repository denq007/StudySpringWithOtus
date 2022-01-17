package ru.homework.mainpackage.entity;

import lombok.Data;

import java.util.List;

@Data
public class Question {
    private String question;
    private List<Answer> answer;
    private int rightAnswer;
}
