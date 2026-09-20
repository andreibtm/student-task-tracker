package com.example.tasktracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        boolean running = true;

        while (running) {
            System.out.println("=== Student Task Tracker ===");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the task title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter the course: ");
                    String course = scanner.nextLine();

                    System.out.print("Enter the priority from 1 to 3: ");

                    int priority;

                    try {
                        priority = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException exception) {
                        System.out.println("Priority must be a number.");
                        System.out.println();
                        break;
                    }

                    if (priority < 1 || priority > 3) {
                        System.out.println("Priority must be between 1 and 3.");
                        System.out.println();
                        break;
                    }

                    Task task = new Task(title, course, priority);
                    taskManager.addTask(task);

                    System.out.println("Task added.");
                    System.out.println();
                    break;

                case "2":
                    System.out.println();
                    System.out.println("Your tasks:");
                    taskManager.displayAllTasks();
                    break;

                case "3":
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("That is not a valid option.");
                    System.out.println();
            }
        }

        scanner.close();
    }
}