import java.util.Scanner;

// Description:You will be writing a collection of methods that take parameters and return results
// based on the method descriptions. Your code WILL NOT have a main method, as your methods
// will be called by the main method written by the instructors, and you won’t know what is in it.
// Essentially you will need to focus on ensuring that your methods work in all cases.

public class MyMethods {
  
  public static boolean isVowel(char vowel1) {
    if (vowel1 == 'a' || vowel1 == 'A' || vowel1 == 'e' || vowel1 == 'E' 
        || vowel1 == 'i' || vowel1 == 'I' || vowel1 == 'o' || vowel1 == 'O' 
        || vowel1 == 'u' || vowel1 == 'U') {
      return true;
    } else {
      return false;      
    }
  }
  
  public static double madScore(String word) {
    double madScore = 0.0;
    for (int i = 0; i < word.length(); i++) {
      if (isVowel(word.charAt(i))) {
        madScore++;
      } 
    } 
    madScore = madScore / word.length();
    return madScore;     
  }
    
  public static boolean madString(String madWord) {
    double madScore = madScore(madWord);
    if (madScore >= 0.25) {
      return true;
    } else {
      return false;
    }
  }
 
  public static String unmadify(String newWord) {
    if (madString(newWord) == false) {
      return newWord;
    }
    while (madString(newWord) == true) {
      newWord = " " + newWord;
    }
    return newWord; 
  }
  
  public static String goCrazy(String crazyWord) {
    if (madString(crazyWord) == false) {
      System.out.println("I'm sad that string was not mad :(");
    }
    return "";
  }   
} 
