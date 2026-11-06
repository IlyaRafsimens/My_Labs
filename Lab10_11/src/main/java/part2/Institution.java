package part2;

public class Institution {
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