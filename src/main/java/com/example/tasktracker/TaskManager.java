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
        for (Task task : tasks) {
            task.display();
            System.out.println();
        }
    }

    public int getTaskCount() {
        return tasks.size();
    }
}