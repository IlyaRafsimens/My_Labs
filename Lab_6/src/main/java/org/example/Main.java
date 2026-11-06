package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");

        Train train = new Train("Москва — Санкт-Петербург", "072А", "14:15");

        System.out.println("\n[1] Исходное расписание поезда:");
        train.displayInfo();

        System.out.println("\n[2] Задержка поезда:");
        train.isDelayed(30);

        System.out.println("\n[3] Обновленное расписание:");
        train.displayInfo();

        System.out.println("\n[4] Проверка через геттер getDepartureTime():");
        System.out.println("Актуальное время выезда: " + train.getDepartureTime());
    }
}