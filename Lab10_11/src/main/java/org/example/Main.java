import java.util.ArrayList;
import java.util.List;

interface Educable {
    void educate();
    int getStudents();

    static void printCategory() {
        System.out.println("[Категория]: Образовательная организация");
    }
}

interface Graduable {
    void graduate();
    int getGraduates();
}

class SchoolP1 implements Educable, Graduable {
    private String name;
    private int students;
    private List<Integer> grades;
    private int graduatesCount = 0;

    public SchoolP1(String name, int students, List<Integer> grades) {
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
        int graduating = Math.min(students, 30);
        graduatesCount += graduating;
        students -= graduating;
        System.out.println("Школа «" + name + "» выпустила " + graduating + " учащихся.");
    }

    @Override
    public int getGraduates() {
        return graduatesCount;
    }
}

class UniversityP1 implements Educable, Graduable {
    private String name;
    private int students;
    private List<String> faculties;
    private int graduatesCount = 0;

    public UniversityP1(String name, int students, List<String> faculties) {
        this.name = name;
        this.students = students;
        this.faculties = faculties;
    }

    @Override
    public void educate() {
        System.out.println("Университет «" + name + "» ведет занятия на факультетах: " + faculties);
    }

    @Override
    public int getStudents() {
        return students;
    }

    @Override
    public void graduate() {
        int graduating = Math.min(students, 120);
        graduatesCount += graduating;
        students -= graduating;
        System.out.println("Университет «" + name + "» вручил дипломы " + graduating + " бакалаврам.");
    }

    @Override
    public int getGraduates() {
        return graduatesCount;
    }
}

class Institution {
    protected String name;
    protected String address;
    protected int students;

    public Institution(String name, String address, int students) {
        this.name = name;
        this.address = address;
        this.students = students;
    }

    public void teach() {
        System.out.println(name + ": Учу");
    }

    public void teach(String subject) {
        System.out.println(name + ": Учу предмету " + subject);
    }

    public void teach(int hours) {
        System.out.println(name + ": Учу " + hours + " часов");
    }

    public String getType() {
        return "Учебное заведение";
    }

    public void printInfo() {
        System.out.println(name + " | Адрес: " + address + " | Студентов: " + students);
    }
}

class SchoolP2 extends Institution {
    private int accreditationLevel;

    public SchoolP2(String name, String address, int students, int accreditationLevel) {
        super(name, address, students);
        this.accreditationLevel = accreditationLevel;
    }

    @Override
    public String getType() {
        return "Школа";
    }

    public void teach(String subject, int gradeLevel) {
        System.out.println(name + ": Учу предмету " + subject + " учеников " + gradeLevel + "-го класса");
    }
}

class UniversityP2 extends Institution {
    private int facultiesCount;

    public UniversityP2(String name, String address, int students, int facultiesCount) {
        super(name, address, students);
        this.facultiesCount = facultiesCount;
    }

    @Override
    public String getType() {
        return "Университет";
    }

    public void teach(String subject, String professor) {
        System.out.println(name + ": Профессор " + professor + " читает лекцию по предмету " + subject);
    }
}

public class Main {
    public static void main(String[] args) {
        Educable.printCategory();

        SchoolP1 sch1 = new SchoolP1("Гимназия №1", 500, List.of(1, 2, 3, 9, 11));
        SchoolP1 sch2 = new SchoolP1("Лицей №2", 300, List.of(8, 9, 10, 11));
        SchoolP1 sch3 = new SchoolP1("СОШ №10", 750, List.of(1, 5, 9, 11));

        UniversityP1 uni1 = new UniversityP1("ВГУ", 12000, List.of("ПММ", "ФКН", "Физфак"));
        UniversityP1 uni2 = new UniversityP1("ВГТУ", 8500, List.of("Строительный", "ИТ"));

        List<Graduable> institutionsList = new ArrayList<>(List.of(sch1, sch2, sch3, uni1, uni2));

        for (Graduable item : institutionsList) {
            if (item instanceof Educable educable) {
                educable.educate();
                System.out.println("Студентов до выпуска: " + educable.getStudents());
            }
            item.graduate();
            System.out.println("Выпускников: " + item.getGraduates());
            System.out.println("----------------------------------------------");
        }

        Institution base = new Institution("Центр ДПО", "ул. Мира, 1", 120);
        SchoolP2 school = new SchoolP2("Лицей №7", "ул. Ленина, 45", 600, 3);
        UniversityP2 univ = new UniversityP2("ВГУ", "Университетская пл., 1", 15000, 18);

        base.teach();
        base.teach("Информатика");
        base.teach(4);

        school.teach("Геометрия", 7);
        univ.teach("Алгоритмы", "Иванов И.И.");

        Institution[] array = { base, school, univ };

        for (Institution inst : array) {
            inst.printInfo();
            System.out.println("→ Тип объекта: " + inst.getType());
            System.out.println();
        }
    }
}