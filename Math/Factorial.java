package Math;

import java.util.Scanner;

public class Factorial {
    // find out factorial of 5;
    //1x2x3x4x5x==?

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        long value;
        System.out.println("Enter the number you want to factorial of : ");
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();
        if (value>15) {
            System.out.println("Invalid value. Please insert valid value whivh is less than 16 : ");

        }
        long number = factorial.factorial(value);
        System.out.println("factorial of " + value + " is " + number);

    }

    public long factorial(long x) {
        long number = 1;
        for (long i = 1; i <= x; i++) {
            number = number * i;

        }
        return number;

    }
}
