import java.util.Scanner;

public class fibonacci {
    static int a;
    static int b;

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        a = 0;
        b = 1;

        int result = fibonacci(n);
        System.out.println(result);

        scanner.close();
    }
}