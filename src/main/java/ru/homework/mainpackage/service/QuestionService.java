package ru.homework.mainpackage.service;

import ru.homework.mainpackage.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> createQuestionsFromFile(List<List<String>> strs);
    boolean checkAnswer(int numberOfAnswer,int rightAnswer);
}
