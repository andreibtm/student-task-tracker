package com.example.tasktracker;

public class Main {

    public static void main(String[] args) {
        Task firstTask = new Task("Learn Java methods", "Programming III", 1);
        Task secondTask = new Task("Read course notes", "Programming III", 2);

        firstTask.complete();

        firstTask.display();

        System.out.println();

        secondTask.display();
    }
}