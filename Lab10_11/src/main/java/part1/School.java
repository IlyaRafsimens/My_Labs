package part1;

import java.util.List;

public class School implements Educable, Graduable {
    private String name;
    private int students;
    private List<Integer> grades; // классы (например, с 1 по 11)
    private int graduatesCount = 0;

    public School(String name, int students, List<Integer> grades) {
        this.name = name;
        this.students = students;
        this.grades = grades;
    }

    @Override
    public void educate() {
        System.out.println("Школа «" + name + "» проводит уроки для классов: " + grades);
    }

    @Override
    public int getStudents() {
        return students;
    }

    @Override
    public void graduate() {
        int graduating = Math.min(students, 30); // пример логики выпуска
        graduatesCount += graduating;
        students -= graduating;
        System.out.println("Школа «" + name + "» выпустила " + graduating + " одиннадцатиклассников.");
    }

    @Override
    public int getGraduates() {
        return graduatesCount;
    }

    public String getName() {
        return name;
    }
}