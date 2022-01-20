package ru.homework.mainpackage.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Service
public class ReaderCSVImpl implements ReaderCSV {


    public List<List<String>> loadFile(String csvFileName) {
        List<List<String>> lines = new ArrayList<>();

        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream inputStream = classloader.getResourceAsStream(csvFileName);
            InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(streamReader);
            for (String line; (line = reader.readLine()) != null; ) {
                lines.add(List.of(line.split(";")));
            }
            lines.remove(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
