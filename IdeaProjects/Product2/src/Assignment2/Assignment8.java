package Assignment2;
import java.util.Scanner;

public class Assignment8 {
    static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Have you completed your masters? (y/n) :");
        char masters;
        masters = input.next().charAt(0);
        System.out.println("Are you fluent in English? (y/n) : ");
        char english = input.next().charAt(0);

         if((masters == 'y' || masters == 'Y') && ( english == 'y' || english == 'Y')){
             System.out.println("You are eligible for the job interview");
         }
    else {
             System.out.println("Sorry babe. You are a gobbet goru");
         }
    }
}
