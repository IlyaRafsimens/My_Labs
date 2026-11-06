package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class Task1 {

    private static final String FILE_NAME = "animal.txt";

    public static void run() {
        System.out.println("\n=== Задание 1. Информация о животном ===");
        File file = new File(FILE_NAME);

        try (Writer writer = new FileWriter(file)) {
            writer.write("Моё любимое животное: кот\n");
            writer.write("Порода: британская короткошёрстная\n");
            writer.write("Кличка: Барсик\n");
            writer.write("Возраст: 3 года\n");
            writer.write("Вес: 5.2 кг\n");
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        System.out.println("--- Данные о файле ---");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Последняя модификация: " + file.lastModified());
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Существует: " + file.exists());
        System.out.println("Можно читать: " + file.canRead());
        System.out.println("Можно писать: " + file.canWrite());
        System.out.println("Это каталог: " + file.isDirectory());
        System.out.println("Это файл: " + file.isFile());

        System.out.println("--- Содержимое файла ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
    }
}