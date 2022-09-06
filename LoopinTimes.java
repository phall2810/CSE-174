import java.util.Scanner;

public class LoopinTimes  {
  public static void main(String [] args)  { 
    Scanner keyboardReader = new Scanner(System.in);
    // Column number input 
    int columnNum; 
    do {
      System.out.print("How many columns should be in the table: ");
      columnNum = keyboardReader.nextInt();
    } while (columnNum > 20 || columnNum < 1);
    // Row number input 
    int rowsNum;
    do {
      System.out.print("How many rows should be in the table: ");
      rowsNum = keyboardReader.nextInt();
    } while (rowsNum > 20 || rowsNum < 1);
    
    multiTable(columnNum, rowsNum);
    
  }
  // Number Counter 
  
  public static void multiTable(int columnNum, int rowsNum) {
  
    System.out.println();
    for (int i = 1; i <= rowsNum; i++) {
      for (int j = 1; j <= columnNum; j++) {
        System.out.printf("%4d", i * j);
      }
      System.out.println();
    } 
   
  }
}