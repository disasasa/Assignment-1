import java.util.Scanner;
public class power {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextInt();
        double pow = scanner.nextInt();
        double result = power(num,pow);
        System.out.println(result);
    }
    public static double power(double num, double pow){
        return Math.pow(num,pow);
    }
}
