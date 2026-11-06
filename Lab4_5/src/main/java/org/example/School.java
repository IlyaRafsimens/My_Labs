package org.example;

public class School {
    private String name;
    private int students;
    private int teachers;

    public School(String name, int students, int teachers) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public int getStudents() {
        return students;
    }

    public int getTeachers() {
        return teachers;
    }

    @Override
    public String toString() {
        return "Школа: \"" + name + "\" (Учеников: " + students + ", Учителей: " + teachers + ")";
    }
}
