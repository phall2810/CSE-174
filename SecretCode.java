import java.util.Scanner;

// Description: You will build a program that takes in a secret code from the user in the form of a
// five-letter word, and encrypts it using a secret key that the user also provides. You will then
// display the secret encrypted word back to the user.


public class SecretCode {
  public static void main(String[] args) {
    // Five Letter Word Input 
    Scanner keyboardReader = new Scanner(System.in);
    System.out.print("Enter a five letter word to encrypt: ");
    String userWord = keyboardReader.next();
    // If statemenet for exactly 5 LETTERS (not other characters)
    if (userWord.length() < 5) {
      System.out.println("Word needs to be exactly five letters."); 
    }
    if (userWord.length() > 5) {
      System.out.println("Word needs to be exactly five letters.");
    }
    if (userWord.matches(".*\\d+.*")) {
      System.out.println("Only letters can be used.");
    }
    // Secret Encryption Key (1-1000)
    Scanner keyboardReaderint = new Scanner(System.in);
    System.out.println("Enter an encryption key between 1-1000: ");
    int userKey = keyboardReader.nextInt();
    // If statemenet for key to be 1-1000
    if (userKey > 1000) {
      System.out.println("Key needs to be 1-1000.");
    }
    if (userKey < 1) {
      System.out.println("Key needs to be 1-1000.");
    }
      
    int zCode = userKey % 43;
    
    double firstInit = (double)userWord.charAt(0);
    double secondInit = (double)userWord.charAt(1);
    double thirdInit = (double)userWord.charAt(2);
    double fourthInit = (double)userWord.charAt(3);
    double fifthInit = (double)userWord.charAt(4);
      
    double encrypCode1 = (firstInit - zCode);
    double encrypCode2 = (secondInit - zCode);
    double encrypCode3 = (thirdInit - zCode);
    double encrypCode4 = (fourthInit - zCode);
    double encrypCode5 = (fifthInit - zCode);
      
    char charEncrypCode1 = (char) encrypCode1;
    char charEncrypCode2 = (char) encrypCode2;
    char charEncrypCode3 = (char) encrypCode3;
    char charEncrypCode4 = (char) encrypCode4;
    char charEncrypCode5 = (char) encrypCode5;
     
    System.out.print("Your encrypted word is: ");
    System.out.print(charEncrypCode1);
    System.out.print(charEncrypCode2);
    System.out.print(charEncrypCode3);
    System.out.print(charEncrypCode4);
    System.out.println(charEncrypCode5);
      
      
  }
}
