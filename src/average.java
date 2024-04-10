import java.util.Scanner;

public class average{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = scanner.nextInt();

        double sum = 0;

        System.out.println();

        for (int i = 0; i < totalCount; i++) {
            double number = scanner.nextDouble();
            sum += number;
        }

        double average = sum / totalCount;
        System.out.println(average);

        scanner.close();
    }
}
