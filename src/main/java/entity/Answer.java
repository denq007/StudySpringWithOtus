package entity;

import lombok.Data;

import java.util.List;
@Data
public class Answer {
    List<String> answers;
    int rightAnswer;
}
