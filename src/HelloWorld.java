import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int i = new Scanner(System.in).nextInt();
        double j = new Scanner(System.in).nextDouble();
        System.out.print(i+j);
    }
}
