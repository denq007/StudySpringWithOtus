package ru.homework.mainpackage.service;

import org.springframework.stereotype.Service;
import ru.homework.mainpackage.entity.Answer;
@Service
public class AnswerServiceImpl implements AnswerService{

    @Override
    public Answer createAnswerFromFile(String str) {
        return new Answer(str);
    }
}
