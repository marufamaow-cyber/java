package Assignment2;

import java.util.Scanner;

public class ArithmeticDemo {
  public  static void main(String[]args) {
      Scanner input = new Scanner(System.in);
      int num1,num2,result;
      System.out.println("Enter any first numbers:");
      num1 = input.nextInt();
      System.out.println("Enter 2nd number: ");
      num2 = input.nextInt() ;
      result = num1 + num2;
      System.out.println("sum =" +result);
      result = num1 - num2;
      System.out.println("sub =" +result);
      result = num1 / num2;
      System.out.println("div =" +result);
      result = num1 % num2;
      System.out.println("rem =" +result);


  }
}
