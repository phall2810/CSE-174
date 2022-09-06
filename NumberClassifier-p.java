
import java.util.Scanner;

// Description: You will build a program that will take an integer (0 or greater) from the user and
// classify it based on a set of criteria. Different numbers are classified in different ways, so you will
// need to have some decision making in your code.

public class NumberClassifier  {
  public static void main(String [] args)  { 
    Scanner keyboardReader = new Scanner(System.in);
    System.out.println("Please provide an integer (0 or greater)"
      + " to classify: ");
    int num = keyboardReader.nextInt();
    if (num == 0) {
      System.out.println("Your number is 0.");
    }
    if (num % 2 == 0 && num > 0) {
      if (num % 4 == 0 || num % 6 == 0) {
        System.out.println("Your number is even and also"
          + " divisible by 4 or 6.");
      } else {
        System.out.println("Your number is even but not divisible by 4 or 6.");
      }
    }
    if (num % 2 != 0 && num > 0) {
      if (num % 3 == 0 || num % 5 == 0) {
        System.out.println("Your number is odd and" 
          + " is also divisible by 3 or 5.");
      } else {
        System.out.println("Your number is odd but not divisible by 3 or 5.");
      }
    }
    if (num >= 1000)  {
      System.out.println("Further, this is a large number.");
    } else {
      System.out.println("Further, this is not a large number.");
    }
    
  }
}
