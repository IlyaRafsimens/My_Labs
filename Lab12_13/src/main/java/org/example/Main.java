package org.example;

import ru.vsu.education.lab12.task1.Lab12Task1Main;
import ru.vsu.education.lab12.task2.Lab12Task2Main;
import ru.vsu.education.lab133.Lab13Main;
import ru.vsu.education.lab133.Pet;
import ru.vsu.education.lab133.VeterinaryClinic;
import ru.vsu.education.lab13.exceptions.InvalidPetDataException;
import ru.vsu.education.lab13.exceptions.PetNotFoundException;
import ru.vsu.education.lab13.exceptions.VetException;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("\n=======================================================");
            System.out.println("   ГЛАВНОЕ МЕНЮ ЛАБОРАТОРНЫХ РАБОТ (ВАРИАНТ 21)");
            System.out.println("=======================================================");
            System.out.println("1 - Запустить Лаб. 12 (Задание 1: Спортивный инвентарь / Map)");
            System.out.println("2 - Запустить Лаб. 12 (Задание 2: Студенты / List, Iterator)");
            System.out.println("3 - Запустить Лаб. 13 (Обработка исключений / Питомец, Клиника)");
            System.out.println("4 - Запустить всё подряд (демонстрационный режим)");
            System.out.println("0 - Выход из программы");
            System.out.print("Выберите пункт меню: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Lab12Task1Main.main(args);
                    break;
                case "2":
                    Lab12Task2Main.main(args);
                    break;
                case "3":
                    runLab13Demo();
                    break;
                case "4":
                    System.out.println("\n--- ЗАПУСК ЛАБОРАТОРНОЙ РАБОТЫ 12.1 ---");
                    Lab12Task1Main.main(args);
                    System.out.println("\n--- ЗАПУСК ЛАБОРАТОРНОЙ РАБОТЫ 12.2 ---");
                    Lab12Task2Main.main(args);
                    System.out.println("\n--- ЗАПУСК ЛАБОРАТОРНОЙ РАБОТЫ 13 ---");
                    runLab13Demo();
                    break;
                case "0":
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
            }
        }
    }

    private static void runLab13Demo() {
        try {
            Lab13Main.main(new String[]{});
        } catch (InvalidPetDataException e) {
            System.out.println("[Ошибка валидации данных]: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[Непредвиденная ошибка]: " + e.getMessage());
        }
    }
}