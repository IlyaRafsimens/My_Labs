package org.example;

public class EducationalInstitution {

    private String name;
    private String address;
    private int students;


    public EducationalInstitution(String name, String address, int students) {
        this.name = name;
        this.address = address;
        this.students = students;
    }
    public String getName()    { return name; }
    public String getAddress() { return address; }
    public int getStudents()   { return students; }
    public void setName(String name)       { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setStudents(int students)  { this.students = students; }

    public String getType() {
        return "Учебное заведение";
    }
    public void displayInfo() {
        System.out.println("Тип: " + getType());
        System.out.println("Название: " + name);
        System.out.println("Адрес: " + address);
        System.out.println("Студентов: " + students);
    }
}