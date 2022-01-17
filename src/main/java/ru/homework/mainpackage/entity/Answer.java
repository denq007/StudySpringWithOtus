package ru.homework.mainpackage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Answer {
   private String answer;
}
