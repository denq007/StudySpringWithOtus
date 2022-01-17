package ru.homework.mainpackage.service;

import ru.homework.mainpackage.entity.Answer;

public class AnswerServiceImpl implements AnswerService{

    @Override
    public Answer createAnswerFromFile(String str) {
        return new Answer(str);
    }
}
