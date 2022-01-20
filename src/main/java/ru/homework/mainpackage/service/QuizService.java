package ru.homework.mainpackage.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.homework.mainpackage.config.AppConfig;
import ru.homework.mainpackage.util.LocalUtil;

import java.util.Scanner;

@Service
@Data
public class QuizService {
    private final LocalUtil localUtil;
    private final ReaderCSV readerCSV;
    private final QuestionService questionService;
    private final AppConfig appConfig;

    public void startQuiz() {
        var questions = questionService.createQuestionsFromFile(readerCSV.loadFile(localUtil.getPath()));
        System.out.println(localUtil.getHello());
        System.out.println(localUtil.getEnterName());
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < questions.size(); i++) {
            System.out.println(localUtil.getQuestionNumber() + " " + (i + 1));
            System.out.println(questions.get(i).getQuestion());
            for (int j = 0; j < questions.get(i).getAnswer().size(); j++) {
                System.out.println(questions.get(i).getAnswer().get(j));
            }
            System.out.println(localUtil.getChooseAnswer());
            int answerNumber = Integer.parseInt(scanner.nextLine());
            if (questionService.checkAnswer(answerNumber, questions.get(i).getRightAnswer())) ;
            {
                ++count;
            }
        }
        System.out.println(count >= Integer.parseInt(appConfig.getMath()) ? localUtil.getWin() : localUtil.getLose());
    }


}
