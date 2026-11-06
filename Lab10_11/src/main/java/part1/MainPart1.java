package part1;

import java.util.ArrayList;
import java.util.List;

public class MainPart1 {
    public static void main(String[] args) {
        System.out.println("ЧАСТЬ 1: ИНТЕРФЕЙСЫ И РЕАЛИЗАЦИИ");
        Educable.printCategory();

        School s1 = new School("Гимназия №1", 500, List.of(1, 2, 3, 4, 5, 9, 10, 11));
        School s2 = new School("Лицей №2", 350, List.of(8, 9, 10, 11));
        School s3 = new School("СОШ №10", 800, List.of(1, 5, 9, 11));

        University u1 = new University("ВГУ", 12000, List.of("ПММ", "ФКН", "Физфак"));
        University u2 = new University("ВГТУ", 8000, List.of("Машиностроение", "Строительный"));
        List<Graduable> institutions = new ArrayList<>(List.of(s1, s2, s3, u1, u2));

        System.out.println("\n Процесс обучения и выпуска");
        for (Graduable inst : institutions) {

            if (inst instanceof Educable educableInst) {
                educableInst.educate();
                System.out.println("Студентов до выпуска: " + educableInst.getStudents());
            }
            inst.graduate();
            System.out.println("Всего выпускников: " + inst.getGraduates());
        }
    }
}