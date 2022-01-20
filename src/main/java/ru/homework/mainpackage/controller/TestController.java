package ru.homework.mainpackage.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.homework.mainpackage.service.QuizService;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final QuizService quizService;

    @GetMapping("/test")
    public void firstController() {
        quizService.startQuiz();
    }
}
