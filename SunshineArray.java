import java.util.Scanner; //Needed for user input

// In this lab, you will write methods to create and print 2D arrays. The user will enter the
// dimensions and a default value for their array, and your methods will be used to actually
// declare, initialize, and print the desired array.

public class SunshineArray {
   
  public static void main(String[] args) {
    int rows;
    int cols; 
    int value;
    Scanner keyboardReader = new Scanner(System.in);
    System.out.print("How many rows for your table? ");
    rows = keyboardReader.nextInt();
    System.out.print("How many cols for your table? ");
    cols = keyboardReader.nextInt();
    System.out.print("What value should fill your table? ");
    value = keyboardReader.nextInt();
    int[] array = makeArray(cols, value);
    printArray(array, rows);
  }  
   
  //method that takes the size of the array as well as the default value
  public static int[] makeArray(int cols, int value) {
    int[] array = new int[cols];
    for (int i = 0; i < cols; i++) {
      array[i] = value;
    } 
    return array;
  }
   
  public static void printArray(int[] array, int rows) {
    System.out.println();
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < array.length; j++) {
        System.out.print(array[j] + " ");
     
       
      }
      System.out.println();
    } 

  }
}

