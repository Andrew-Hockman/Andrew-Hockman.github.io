import java.io.*;
import java.util.Scanner;

public class PigLatin {
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Type Word or Phrase to Convert into Pig Latin: ");
    String word = keyboard.nextLine();
    for(String pigword : word.split(" ")) {
      String newPigword = new String (makePig(pigword));
      System.out.println(newPigword + " ");
    }
  }
    
  public static String makePig(String word) {
    String Str2, result;
    Str2 = word.substring(0,1);
    result = word.substring(1) + Str2 + "ay";
    return result;
    //System.out.println(Str1.substring(1) + " " + Str2 + "ay");
}
}