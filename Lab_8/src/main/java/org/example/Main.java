package org.example;

public class Main {

    public static void main(String[] args) {


        EducationalInstitution[] institutions = new EducationalInstitution[5];

        institutions[0] = new School("Школа №15", "ул. Ленина, 10", 800, 32);
        institutions[1] = new School("Гимназия №1", "пр. Мира, 5", 1200, 40);
        institutions[2] = new School("Лицей №7", "ул. Гагарина, 22", 950, 28);

        institutions[3] = new University("БГУ", "пр. Независимости, 4", 25000, 18);
        institutions[4] = new University("БНТУ", "пр. Независимости, 65", 18000, 14);

        System.out.println(" Список учебных заведений");
        for (EducationalInstitution inst : institutions) {
            inst.displayInfo();
        }

        System.out.println("Уникальные методы");
        for (EducationalInstitution inst : institutions) {
            if (inst instanceof School s) {
                s.holdLesson();
            } else if (inst instanceof University u) {
                u.holdLecture();
            }
        }
    }
}
