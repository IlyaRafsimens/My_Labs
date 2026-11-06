package ru.vsu.education.lab12.task2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(int id, String name, String group, int course, List<Integer> grades) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades);
    }


    public double getAverageGrade() {
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = new ArrayList<>(grades);
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    @Override
    public String toString() {
        return String.format("ID: %-2d | %-15s | Группа: %-6s | Курс: %d | Оценки: %-12s | Ср.балл: %.2f",
                id, name, group, course, grades, getAverageGrade());
    }
}