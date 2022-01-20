package ru.homework.mainpackage.util;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import ru.homework.mainpackage.config.AppConfig;

@Component
@Data
public class LocalUtil {
    private static final Logger logger = LoggerFactory.getLogger(LocalUtil.class);
    private final MessageSource messageSource;
    private final AppConfig appConfig;
    private final String path;
    private final String hello;
    private final String enterName;
    private final String questionNumber;
    private final String win;
    private final String lose;
    private final String chooseAnswer;

    public LocalUtil(MessageSource messageSource, AppConfig appConfig) {
        this.appConfig = appConfig;
        this.messageSource = messageSource;
        this.path = messageSource.getMessage("quizConfig.path", new String[]{}, appConfig.getLocale());
        this.hello = messageSource.getMessage("quizConfig.hello", null, appConfig.getLocale());
        this.enterName = messageSource.getMessage("quizConfig.enterName", null, appConfig.getLocale());
        this.questionNumber = messageSource.getMessage("quizConfig.questionNumber", null, appConfig.getLocale());
        this.win = messageSource.getMessage("quizConfig.win", null, appConfig.getLocale());
        this.lose = messageSource.getMessage("quizConfig.lose", null, appConfig.getLocale());
        this.chooseAnswer = messageSource.getMessage("quizConfig.enterChooseAnswer", null, appConfig.getLocale());
    }
}
