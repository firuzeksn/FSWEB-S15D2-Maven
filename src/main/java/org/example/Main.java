package org.example;

import org.example.entity.*;

public class Main {
    public static void main(String[] args) {
        // Önemli: Status ve Priority sırasına dikkat edin
        Task task = new Task("Project", "Desc", "Ann", Status.IN_QUEUE, Priority.LOW);

        System.out.println("Benzersiz Kelime Sayısı: " + StringSet.findUniqueWords().size());
    }
}