package org.example;

public class University extends EducationalInstitution {
    private int faculties;

    public University(String name, String address, int students, int faculties) {
        super(name, address, students);
        this.faculties = faculties;
    }

    public int getFaculties()        { return faculties; }
    public void setFaculties(int f)  { this.faculties = f; }

    @Override
    public String getType() {
        return "Университет";
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Факультетов: " + faculties);
    }

    public void holdLecture() {
        System.out.println("Университет «" + getName() + "» проводит лекцию на " + faculties + " факультетах.");
    }
}