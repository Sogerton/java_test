import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        System.out.print("Введите число 1 - ");
        double a = new Scanner(System.in).nextDouble();

        System.out.print("Введите действие (+-*/%) - ");
        char d = new Scanner(System.in).nextLine().charAt(0);

        System.out.print("Введите число 2 - ");
        double b = new Scanner(System.in).nextDouble();

        switch (d) {
            case '+': System.out.print("Результат сложения = " + (a + b));break;
            case '-': System.out.print("Результат вычитания = " + (a - b));break;
            case '*': System.out.print("Результат умножения = " + (a * b));break;
            case '/': System.out.print("Результат деления = " + (a / b));break;
            case '%': System.out.print("Результат остатка от деления = " + (a % b));break;
        }

    }
}
