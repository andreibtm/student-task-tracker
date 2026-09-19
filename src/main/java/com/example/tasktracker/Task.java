package com.example.tasktracker;

public class Task {

    private String title;
    private String course;
    private int priority;
    private boolean completed;

    public Task(String title, String course, int priority) {
        this.title = title;
        this.course = course;
        this.priority = priority;
        this.completed = false;
    }

    public void complete() {
        completed = true;
    }

    public void display() {
        System.out.println("Task: " + title);
        System.out.println("Course: " + course);
        System.out.println("Priority: " + priority);
        System.out.println("Completed: " + completed);
    }
}