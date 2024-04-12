import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        int pow = scanner.nextInt();
        double result = power(num, pow);
        System.out.println(result);
    }

    public static double power(double num, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return num * power(num, pow - 1);
        }
    }
}
