package com.example.tasktracker;

public class Main {

    public static void main(String[] args) {
        Task firstTask = new Task(
                "Complete Java exercise",
                "Programming III",
                1
        );

        Task secondTask = new Task(
                "Review probability notes",
                "Probability and Statistics",
                2
        );

        firstTask.display();

        System.out.println();

        secondTask.display();
    }
}