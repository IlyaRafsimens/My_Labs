package part1;

import java.util.List;

public class University implements Educable, Graduable {
    private String name;
    private int students;
    private List<String> faculties;
    private int graduatesCount = 0;

    public University(String name, int students, List<String> faculties) {
        this.name = name;
        this.students = students;
        this.faculties = faculties;
    }

    @Override
    public void educate() {
        System.out.println("Университет «" + name + "» ведет лекции на факультетах: " + faculties);
    }

    @Override
    public int getStudents() {
        return students;
    }

    @Override
    public void graduate() {
        int graduating = Math.min(students, 150);
        graduatesCount += graduating;
        students -= graduating;
        System.out.println("Университет «" + name + "» вручил дипломы " + graduating + " студентам.");
    }

    @Override
    public int getGraduates() {
        return graduatesCount;
    }

    public String getName() {
        return name;
    }
}