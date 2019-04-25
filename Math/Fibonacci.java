package Math;

public class Fibonacci {
    //write fibonacci number till 40;
    public static void fibonacci(int x) {
        int a = 0;
        int b = 1;
        int c = a+b;

        System.out.println("Fibonacci numbers till " + x + " are ; ");

        for (int i=0; i<+x; i++) {
            System.out.println(a + " ");
            a=b;
            b=c;
            c=a+b;

        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Fibonacci.fibonacci(10);
    }
}
