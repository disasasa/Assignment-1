import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = scanner.nextInt();
        double average = findAverage(scanner, totalCount, 0, 0);
        System.out.println(average);
    }

    public static double findAverage(Scanner scanner, int totalCount, double sum, int count) {
        if (count == totalCount) {
            return sum / totalCount;
        }

        double number = scanner.nextDouble();
        sum += number;
        count++;

        return findAverage(scanner, totalCount, sum, count);
    }
}