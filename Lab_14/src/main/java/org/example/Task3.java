package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Task3 {

    private static final String F = "f3.txt";
    private static final String G = "g3.txt";
    private static final String H = "h3.txt";

    public static void run() {
        System.out.println("\n=== Задание 3. Распределение случайных чисел ===");
        Random rnd = new Random();

        try (PrintWriter pw = new PrintWriter(new FileWriter(F))) {
            for (int i = 0; i < 20; i++) {
                pw.println(rnd.nextInt(200) - 50); // диапазон -50..149
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи f: " + e.getMessage());
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(F));
             PrintWriter pg = new PrintWriter(new FileWriter(G));
             PrintWriter ph = new PrintWriter(new FileWriter(H))) {

            String line;
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                if (num % 2 != 0 && num < 100) {
                    pg.println(num);
                } else {
                    ph.println(num);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
            return;
        }

        System.out.println("Файлы " + G + " и " + H + " сформированы.");
        printFile(F, "Исходный f:");
        printFile(G, "Содержимое g (нечётные < 100):");
        printFile(H, "Содержимое h (остальные):");
    }

    private static void printFile(String name, String title) {
        System.out.println("--- " + title + " ---");
        try (BufferedReader br = new BufferedReader(new FileReader(new File(name)))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(line + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Ошибка чтения " + name + ": " + e.getMessage());
        }
    }
}