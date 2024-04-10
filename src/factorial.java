import java.util.Scanner;


public class factorial {
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Error");
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorialResult = factorial(number);
        if (factorialResult != -1) {
            System.out.println(factorialResult);
        }
        scanner.close();
    }
}