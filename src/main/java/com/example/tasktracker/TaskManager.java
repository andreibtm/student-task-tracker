package com.example.tasktracker;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void displayAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("You do not have any tasks.");
            System.out.println();
            return;
        }

        for (Task task : tasks) {
            task.display();
            System.out.println();
        }
    }

    public int getTaskCount() {
        return tasks.size();
    }
}