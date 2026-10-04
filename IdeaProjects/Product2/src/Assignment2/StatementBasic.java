package Assignment2;
import java.util.Scanner;

public class StatementBasic {
    static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a digit(0-9): ");
        int digit = input.nextInt() ;

        if(digit == 0){
            System.out.println("laddu kha");
        }
        else if(digit == 1){
            System.out.println("ek");
        }
        else if(digit == 2){
            System.out.println("দুই");
        }
        else{
            System.out.println("invalid digit");
        }
    }

}
