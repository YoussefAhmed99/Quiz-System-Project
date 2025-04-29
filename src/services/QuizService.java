package services;

import models.Quiz;
import utils.CsvHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizService {

    public void viewQuizzes() {
        List<List<String>> quizzesData = new ArrayList<>();
        List<String> quizzesList = new ArrayList<>();
        quizzesData = CsvHandler.read("./resources/quizzes.csv");

        for (List<String> quiz : quizzesData.subList(1, quizzesData.size())) {
            String id = quiz.get(0);
            String name = quiz.get(1);
            String creator = quiz.get(3);
            String numOfQuestions = String.valueOf(quiz.get(2).split(",").length);
            quizzesList.add(String.format("%-5s %-30s %-20s %-15s", id, name, creator, numOfQuestions));
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-5s %-30s %-20s %-15s\n", "ID", "Name", "Creator", "# Questions");
        System.out.println("--------------------------------------------------------------");

        for (String quiz : quizzesList) {
            System.out.println(quiz);
        }

        System.out.println("--------------------------------------------------------------");

    }
}
