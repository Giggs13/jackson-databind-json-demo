package com.giggs13.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.giggs13.jackson.model.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppEntry {

    public static void main(String[] args) {
        try (InputStream in = AppEntry.class.getResourceAsStream("/data/sample-full.json");
             BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            ObjectMapper objectMapper = new ObjectMapper();
            Student student = objectMapper.readValue(reader, Student.class);
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
