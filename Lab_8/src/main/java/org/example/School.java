package org.example;

public class School extends EducationalInstitution {

    private int grades;

    public School(String name, String address, int students, int grades) {
        super(name, address, students);
        this.grades = grades;
    }

    public int getGrades()        { return grades; }
    public void setGrades(int g)  { this.grades = g; }

    @Override
    public String getType() {
        return "Школа";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Классов: " + grades);
    }

    public void holdLesson() {
        System.out.println("Школа «" + getName() + "» проводит урок для " + grades + " классов.");
    }
}