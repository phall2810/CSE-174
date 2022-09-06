import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordleWizard {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please enter the name of your Wordle file: ");
    String fileName = keyboard.nextLine();
    System.out.println();
    Scanner fileScan = new Scanner(new File(fileName));
    int countWords = 0;
    while (fileScan.hasNext()) {
      String word = fileScan.nextLine();
      if (word.length() == 5) {
        System.out.println(word);
        countWords++;
      }  
    }
    System.out.println();
    System.out.println(fileName + " contained " 
        + countWords + " valid Wordle words.");

  }
}