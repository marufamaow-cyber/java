package Assignment2;
import java.util.Scanner ;
public class Factorial {
    static void main() {
        Scanner input =new Scanner(System.in);
        System.out.println("enter n:");
        int n = input.nextInt();
         int factorial = 1;
         for(int i =1; i <= n; i++){
             factorial = factorial * i;
         }
        System.out.println("factorial =" + factorial);
    }
}
