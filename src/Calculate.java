import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        boolean count = true;
        while (count) {

            System.out.print("Введите число 1 - ");
            double a = new Scanner(System.in).nextDouble();

            System.out.print("Введите действие (+-*/%) - ");
            char d = new Scanner(System.in).nextLine().charAt(0);

            System.out.print("Введите число 2 - ");
            double b = new Scanner(System.in).nextDouble();

            switch (d) {
                case '+':
                    System.out.println("Результат сложения = " + (a + b));
                    break;
                case '-':
                    System.out.println("Результат вычитания = " + (a - b));
                    break;
                case '*':
                    System.out.println("Результат умножения = " + (a * b));
                    break;
                case '/':
                    System.out.println("Результат деления = " + (a / b));
                    break;
                case '%':
                    System.out.println("Результат остатка от деления = " + (a % b));
                    break;
            }
            System.out.print("Хотите продолжить? (+ -) ");
            char scan = new Scanner(System.in).nextLine().charAt(0);
            if (scan == '+') {
                count = true;
            } else if (scan == '-') {
                count = false;
            } else {
                System.out.println("ошибка ввода!");
            }
        }
    }
}
