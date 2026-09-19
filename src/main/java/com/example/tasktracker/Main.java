package com.example.tasktracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        System.out.print("Enter the task title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the course: ");
        String course = scanner.nextLine();

        System.out.print("Enter the priority as a number: ");
        String priorityText = scanner.nextLine();
        int priority = Integer.parseInt(priorityText);

        Task task = new Task(title, course, priority);

        taskManager.addTask(task);

        System.out.println();
        System.out.println("Task created:");
        taskManager.displayAllTasks();

        System.out.println(
                "Total tasks: " + taskManager.getTaskCount()
        );

        scanner.close();
    }
}