import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = gcd(a, b);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
