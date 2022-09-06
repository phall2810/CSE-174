import java.util.Scanner;

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
