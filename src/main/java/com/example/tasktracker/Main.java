package com.example.tasktracker;

public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Task firstTask = new Task(
                "Learn Java classes",
                "Programming III",
                1
        );

        Task secondTask = new Task(
                "Review probability notes",
                "Probability and Statistics",
                2
        );

        secondTask.complete();

        taskManager.addTask(firstTask);
        taskManager.addTask(secondTask);

        taskManager.displayAllTasks();

        System.out.println(
                "Total tasks: " + taskManager.getTaskCount()
        );
    }
}