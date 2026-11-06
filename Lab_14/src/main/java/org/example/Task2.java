package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {

    private static final String FILE_NAME = "f2.txt";

    public static void run() {
        System.out.println("\n=== Задание 2. 10 чисел: чётные и > 10 ===");
        File f = new File(FILE_NAME);

        Scanner sc = new Scanner(System.in);   // НЕ закрываем

        try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                int num = sc.nextInt();
                pw.println(num);
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int count = 0;
        System.out.println("Числа из файла:");
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                System.out.print(num + " ");
                if (num % 2 == 0 && num > 10) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
        System.out.println("\nКоличество чётных чисел, больших 10: " + count);
    }
}