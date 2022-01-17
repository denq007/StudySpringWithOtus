package ru.homework.mainpackage.service;

import ru.homework.mainpackage.entity.Answer;
import ru.homework.mainpackage.entity.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionServiceImpl implements QuestionService {
    AnswerService answerService;
//todo add mapper
    @Override
    public List<Question> createQuestionsFromFile(List<List<String>> strs) {

        List<Question> questions=new ArrayList<>();
        for (List<String> list : strs) {
            Question question = new Question();
            question.setQuestion(list.get(0));
            question.setRightAnswer(Integer.parseInt(list.get(1)));//todo about Data Format
            List<Answer> answers = new ArrayList<>();
            for (int i = 2; i < list.size(); i++) {
                answers.add(new Answer(list.get(i)));
            }
            question.setAnswer(answers);
            questions.add(question);
        }
        return questions;
    }

    @Override
    public boolean checkAnswer(int numberOfAnswer, int rightAnswer) {
        return numberOfAnswer==rightAnswer;
    }


}
