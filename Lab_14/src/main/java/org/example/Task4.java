package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task4 {

    private static final String FILE_NAME = "kpd.txt";

    public static void run() {
        System.out.println("\n=== Задание 4. Средний КПД ===");
        File file = new File(FILE_NAME);


        try (PrintWriter pw = new PrintWriter(new FileWriter(file));
             Scanner sc = new Scanner(System.in)) {

            System.out.println("Введите 10 значений КПД:");
            for (int i = 0; i < 5.; i++) {
                System.out.print("КПД " + (i + 1) + ": ");
                double v = sc.nextDouble();
                pw.println(v);
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }


        double sum = 0;
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                sum += Double.parseDouble(line.trim());
                count++;
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
            return;
        }

        if (count > 0) {
            System.out.printf("Средний КПД: %.4f%n", sum / count);
        } else {
            System.out.println("Нет данных.");
        }
    }
}