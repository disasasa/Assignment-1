import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean result = IsPrime(number);
        if(result==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }
    public static boolean IsPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
    return true;
    }
}
