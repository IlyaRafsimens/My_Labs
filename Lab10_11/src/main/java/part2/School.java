package part2;

public class School extends Institution {
    private int accreditationLevel; // Дополнительное поле

    public School(String name, String address, int students, int accreditationLevel) {
        super(name, address, students);
        this.accreditationLevel = accreditationLevel;
    }

    @Override
    public String getType() {
        return "Школа";
    }
    public void teach(String subject, int gradeLevel) {
        System.out.println(name + " [Школа]: Учу предмету " + subject + " учащихся " + gradeLevel + " класса.");
    }
}