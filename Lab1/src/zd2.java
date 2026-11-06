import java.util.Scanner;

public class zd2 {                       // <-- имя = имя файла
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        sc.close();
    }
}