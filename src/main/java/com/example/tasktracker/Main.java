package com.example.tasktracker;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();

        Task firstTask = new Task(
                "Learn Java collections",
                "Programming III",
                1
        );

        Task secondTask = new Task(
                "Review probability notes",
                "Probability and Statistics",
                2
        );

        Task thirdTask = new Task(
                "Install Linux tools",
                "Operating Systems",
                3
        );

        Task fourthTask = new Task(
                "Learn Java loops",
                "Programming III",
                1
        );

        tasks.add(firstTask);
        tasks.add(secondTask);
        tasks.add(thirdTask);
        tasks.add(fourthTask);

        secondTask.complete();

        for (Task task : tasks) {
            task.display();
            System.out.println();
        }
    }
}