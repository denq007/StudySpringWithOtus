package ru.homework.mainpackage.service;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ReaderCSVImpl implements ReaderCSV {
    String csvFileName;

    public List<List<String>> loadFile() {
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
