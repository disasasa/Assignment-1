import java.util.Scanner;
import java.util.ArrayList;

public class min {
    public static int minNumber(ArrayList<Integer> list, int number) {
        int min = list.get(0);
        for (int i = 1; i < number; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(scanner.nextInt());
        }

        int result = minNumber(list, number);
        System.out.println(result);

        scanner.close();
    }
}
