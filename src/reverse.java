import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class reverse {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int length = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(reverse(list));
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> list){
        Collections.reverse(list);
        return list;
    }
}
