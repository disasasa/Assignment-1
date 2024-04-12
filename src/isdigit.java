import java.util.Scanner;
public class isdigit {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s1 = scanner.next();
    if(AllDigits(s1)){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    }
    public static boolean AllDigits(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
