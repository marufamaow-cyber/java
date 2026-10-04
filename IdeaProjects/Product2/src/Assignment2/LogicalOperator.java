package Assignment2;
 import java.util.Scanner ;
public class LogicalOperator {

    static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you love java?");
          char answer  = input.next().charAt(0);
          if(answer == 'y' || answer == 'Y'){
              System.out.println("you are a java lover");
          }
          else if (answer == 'N') {
              System.out.println("you are not a java lover");
          } else if (answer == 'n') {
              System.out.println("you are not a java lover");
          }
          else{
              System.out.println("invalid");
          }
    }
}
