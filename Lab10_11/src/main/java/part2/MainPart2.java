package part2;

public class MainPart2 {
    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ 2: ПЕРЕГРУЗКА И ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДОВ");

        Institution baseInst = new Institution("Центр обучения", "ул. Мира, 1", 100);
        School school = new School("Лицей №7", "пр. Ленина, 45", 600, 3);
        University university = new University("ВГУ", "Университетская пл., 1", 15000, 18);
        System.out.println("\nСтатический полиморфизм (Перегрузка в базовом классе)");
        baseInst.teach();
        baseInst.teach("Основы безопасности");
        baseInst.teach(4);

        System.out.println("\nСобственные перегруженные версии методов у потомков");
        school.teach("Математика", 5);
        university.teach("Квантовая физика", "Д-р Иванов А.А.");
        System.out.println("\nДинамический полиморфизм (Переопределение getType())");
        Institution[] institutions = { baseInst, school, university };

        for (Institution inst : institutions) {
            inst.printInfo();
            System.out.println("Тип учреждения: " + inst.getType());
            System.out.println();
        }
        System.out.println("Сравнение видов полиморфизма");
        System.out.println("1. Статический полиморфизм (Overloading): решение о вызове teach() / teach(String) / teach(int) принимается на этапе КОМПИЛЯЦИИ по сигнатуре аргументов.");
        System.out.println("2. Динамический полиморфизм (Overriding): решение о том, вызвать getType() родителя или потомка, принимается во время ВЫПОЛНЕНИЯ (Runtime) на основе реального типа объекта в куче (Heap).");
    }
}