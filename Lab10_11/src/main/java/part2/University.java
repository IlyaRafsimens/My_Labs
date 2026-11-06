package part2;

public class University extends Institution {
    private int departmentsCount; // Дополнительное поле

    public University(String name, String address, int students, int departmentsCount) {
        super(name, address, students);
        this.departmentsCount = departmentsCount;
    }

    @Override
    public String getType() {
        return "Университет";
    }
    public void teach(String subject, String professor) {
        System.out.println(name + " [Университет]: Профессор " + professor + " читает курс по предмету " + subject);
    }
}