import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int i = new Scanner(System.in).nextInt();
        double j = new Scanner(System.in).nextDouble();
        System.out.println(i+j);
        double d = (double)i;
        System.out.println(d);
        long l = (long)i;
        System.out.println(l);
        l = (long)(i+j);
        System.out.println(l);

        }

    }
