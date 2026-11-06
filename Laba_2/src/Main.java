import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employee {
    String fullname;
    double salary;

    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    static void generateReport(Employee[] employees) {
        System.out.printf("%-15s %10s%n", "ФИО", "ЗП");

        for (Employee e : employees) {
            System.out.printf("%-15s %10.2f%n", e.fullname, e.salary);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите задание (1-4): ");
        int task = scanner.nextInt();
        scanner.nextLine();

        switch (task) {
            case 1:
                System.out.print("Введите строку: ");
                 String s1 = scanner.nextLine();
                if (s1.length() > 4) {
                    System.out.println("Символ по индексу 4: " + s1.charAt(4));
                } else {
                    System.out.println("Ошибка: длина строки меньше 5 символов");
                }
                break;

            case 2:
                System.out.print("Введите предложение: ");
                String s2 = scanner.nextLine();
                String[] words = s2.split(" ");
                String longest = "";
                for (String w : words) {
                    if (w.length() > longest.length()) {
                        longest = w;
                    }
                }
                System.out.println("Самое длинное слово: " + longest);
                break;

            case 3:
                Employee[] emps = {
                        new Employee("Иванов", 1250.50),
                        new Employee("Петров", 850.00),
                        new Employee("Сидоров", 2300.75)
                };
                Report.generateReport(emps);
                break;

            case 4:
                String text = "a1a a22a a333a a4444a a555a";
                System.out.println("Исходная строка: " + text);
                Pattern p = Pattern.compile("a[13579]{3}+a");
                Matcher m = p.matcher(text);
                while (m.find()) {
                    System.out.println(m.group());
                }
                break;


            default:
                System.out.println("Неверный номер задания");
                break;
        }
        scanner.close();
    }
}