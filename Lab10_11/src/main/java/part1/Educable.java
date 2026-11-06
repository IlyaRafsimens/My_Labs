package part1;

public interface Educable {
    void educate();
    int getStudents();
    static void printCategory() {
        System.out.println("[Категория]: Образовательная организация");
    }
}