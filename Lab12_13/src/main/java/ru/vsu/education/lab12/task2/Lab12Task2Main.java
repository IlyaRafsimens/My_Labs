package ru.vsu.education.lab12.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Lab12Task2Main {

    public static void printStudents(List<Student> students, int course) {
        System.out.println("--- Список студентов на " + course + " курсе ---");
        boolean found = false;
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("На данном курсе студентов нет.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("ЛАБОРАТОРНАЯ РАБОТА 12. ЗАДАНИЕ 2\n");

        List<Student> students = new ArrayList<>();
        // Оценки заданы так, чтобы баллы считались точно
        students.add(new Student(1, "Иванов Иван", "ПИ-21", 2, List.of(2, 3, 2, 2))); // ср = 2.25 (< 3)
        students.add(new Student(2, "Петров Петр", "ПИ-21", 2, List.of(4, 5, 5, 4))); // ср = 4.50
        students.add(new Student(3, "Сидорова Анна", "ПИ-11", 1, List.of(3, 4, 3, 3))); // ср = 3.25
        students.add(new Student(4, "Алексеев Денис", "ПИ-11", 1, List.of(2, 2, 3, 2))); // ср = 2.25 (< 3)
        students.add(new Student(5, "Белов Сергей", "ПИ-21", 2, List.of(5, 4, 5, 4))); // ср = 4.50
        students.add(new Student(6, "Кузнецова Ольга", "ПИ-31", 3, List.of(5, 5, 5, 5))); // ср = 5.00

        System.out.println("1. Исходный список студентов:");
        students.forEach(System.out::println);
        System.out.println();

        System.out.println("Удаление студентов со средним баллом < 3:");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getAverageGrade() < 3.0) {
                System.out.printf("-> Отчислен: %s (балл: %.2f)%n", s.getName(), s.getAverageGrade());
                iterator.remove();
            }
        }
        System.out.println();

        System.out.println("2. Перевод на следующий курс (балл >= 3):");
        for (Student s : students) {
            s.setCourse(s.getCourse() + 1);
        }
        students.forEach(System.out::println);
        System.out.println();

        printStudents(students, 3);
        students.sort(
                Comparator.comparingDouble(Student::getAverageGrade).reversed()
                        .thenComparing(Comparator.comparing(Student::getName).reversed())
        );

        System.out.println("4. Упорядоченный список студентов :");
        System.out.printf("%-4s | %-16s | %-12s%n", "ID", "Имя", "Средний балл");
        System.out.println("---------------------------------------");
        for (Student s : students) {
            System.out.printf("%-4d | %-16s | %-12.2f%n", s.getId(), s.getName(), s.getAverageGrade());
        }
    }
}