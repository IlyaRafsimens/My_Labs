package com.example;
import org.example.Insurance;
import org.example.InsuranceType;
import org.example.School;
import org.example.Store;

public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАНИЕ 1:");
        School[] schools = {
                new School("Лицей №1", 1200, 75),
                new School("Гимназия №5", 850, 60),
                new School("СОШ №10", 1450, 80),
                new School("СОШ №42", 920, 95),
                new School("Инженерная школа", 1100, 70)
        };

        School maxStudentsSchool = schools[0];
        School maxTeachersSchool = schools[0];

        for (int i = 1; i < schools.length; i++) {
            if (schools[i].getStudents() > maxStudentsSchool.getStudents()) {
                maxStudentsSchool = schools[i];
            }
            if (schools[i].getTeachers() > maxTeachersSchool.getTeachers()) {
                maxTeachersSchool = schools[i];
            }
        }

        System.out.println("Список школ:");
        for (int i = 0; i < schools.length; i++) {
            System.out.println("  " + schools[i]);
        }

        System.out.println("\nШкола с макс. учеников: " + maxStudentsSchool);
        System.out.println("Школа с макс. учителей: " + maxTeachersSchool);

        System.out.println("\nЗАДАНИЕ 2:");
        Insurance[] policies = {
                new Insurance("HL-00123", InsuranceType.HEALTH),
                new Insurance("CR-99211", InsuranceType.CAR),
                new Insurance("PR-44102", InsuranceType.PROPERTY),
                new Insurance("HL-88231", InsuranceType.HEALTH),
                new Insurance("LF-11294", InsuranceType.LIFE),
                new Insurance("HL-77341", InsuranceType.HEALTH)
        };

        System.out.println("Все страховки типа HEALTH:");
        for (int i = 0; i < policies.length; i++) {
            if (policies[i].getType() == InsuranceType.HEALTH) {
                System.out.println("  " + policies[i]);
            }
        }
        System.out.println("\nЗАДАНИЕ 3:");
        Store myStore = new Store("АЛМИ", "ул. Притыцкого, д.143", 45);
        System.out.println("Магазин: " + myStore.name);
        System.out.println("Адрес: " + myStore.address);
        System.out.println("Сотрудников: " + myStore.employeeCount);
        System.out.println("Большой ли магазин (>50)? " + myStore.isLarge());
        System.out.println(myStore);
    }
}
