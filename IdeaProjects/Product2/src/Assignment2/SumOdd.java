package Assignment2;
import java.util.Scanner;
public class SumOdd {
    static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" enter m: ");
        int m = input.nextInt();
        System.out.println("enter n : ");
        int n = input.nextInt();
        int sum = 0;
        for(int i = m; i<=n; i++){
            if(i % 2 !=0){
                sum = sum + i;
            }
        }
        System.out.println("sum of odd numbers =" +sum);
    }
}
