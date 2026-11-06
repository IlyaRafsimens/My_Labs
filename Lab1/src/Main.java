import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Меню (вариант 21) ===");
        System.out.println("1 - Задание 1, №21: Фаренгейт -> Цельсий");
        System.out.println("2 - Задание 2, №21: Конвертер валют");
        System.out.println("3 - Задание 3, №21: Сумма чётных чисел от A до B");
        System.out.print("Выберите задание: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1: {

                System.out.print("Введите температуру в Фаренгейтах: ");
                double f = sc.nextDouble();

                double c = (f - 32) * 5 / 9;

                System.out.printf(".2f°F = %.2f°C%n", f, c);
                break;
            }

            case 2: {
                System.out.println("Валюты: 1 - USD, 2 - EUR, 3 - RUB");
                System.out.print("Из какой валюты перевести? ");
                int fromCur = sc.nextInt();

                System.out.print("В какую валюту перевести? ");
                int toCur = sc.nextInt();

                System.out.print("Введите сумму: ");
                double amount = sc.nextDouble();

                double[] rates = {0, 90.0, 100.0, 1.0};
                String[] names = {"", "USD", "EUR", "RUB"};

                if (fromCur >= 1 && fromCur <= 3 && toCur >= 1 && toCur <= 3) {
                    double rub = amount * rates[fromCur];
                    double result = rub / rates[toCur];
                    System.out.printf("%.2f %s = %.2f %s%n",
                            amount, names[fromCur], result, names[toCur]);
                } else {
                    System.out.println("Неверный код валюты");
                }
                break;
            }

            case 3: {

                System.out.print("Введите A: ");
                int a = sc.nextInt();

                System.out.print("Введите B: ");
                int b = sc.nextInt();

                if (a > b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }

                int sum = 0;
//                for (int i = a; i <= b; i++) {
//                    if (i % 2 == 0) {
//                        sum += i;
//                    }
//                }

                int i = a;
                while (i <= b)
                {
                    if (i % 2 == 0)
                    {
                        sum += i;
                    }
                    i++;
                }


                System.out.println("Сумма чётных чисел в диапазоне от " + a +
                        " до " + b + " = " + sum);
                break;
            }

            default:
                System.out.println("Неверный пункт меню");
        }

        sc.close();
    }
}