import java.util.ArrayList;

public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
   public static String printCharacters(String word) {
      String newString = "";
      for (int i = 0; i < word.length(); i++){
         newString += word.substring(i, i + 1) + "\n";
      }
        // TODO: Implement this method
      return newString;
   }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
   public static String reverseWord(String word) {
        // TODO: Implement this method
      String reverse = "";
      for (int i = 0; i < word.length(); i++){
         reverse += word.substring(word.length() - i - 1, word.length() - i);
      }
      return reverse;
   }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
   public static String capitalizeString(String sentence) {
        // TODO: Implement this method
      String newString = "";
      String currChar = "";
      boolean shouldCapitalize = true;
      for (int i = 0; i < sentence.length(); i++){
         currChar = sentence.substring(i, i + 1); // current char
           
         if (shouldCapitalize){
            newString += currChar.toUpperCase();
            shouldCapitalize = false;
         } else {
            newString += currChar;
         }
         if (currChar.equals(" ")){
            shouldCapitalize = true;
         }
            
      }
      return newString;
   }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
   public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
      String palindrome = "";
      int length = word.length();
      for (int i = 0; i < length; i++){
         palindrome += word.substring(length - i - 1, length - i);
      }
      if (palindrome.equalsIgnoreCase(word)){
         return true;
      } else {
         return false;
      }
   }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
   public static char firstUniqueChar(String word) {
        // TODO: Implement this method
      // can make list of character not to check and loop through it for each char, or delete each char in a run through.
      String text = word;
      char uniqueChar = word.charAt(0);
      int i = 1;
      while (i < text.length()){
         if (text.charAt(i) == uniqueChar){
            // delete all of uniqueChar from word
            for (int g = 0; g < text.length(); g++){
               if (text.charAt(g) == uniqueChar){
                  
                  text = text.substring(0, g) + text.substring(g + 1, text.length());
                  System.out.println(text);
               }
            }
            i = 0;
            uniqueChar = text.charAt(i);
               
         }
         i++;
         if (text.length() == 0){
            return ' ';
         }
      }
      return uniqueChar;
   }


    /**
     * Main method:
     * Test each method at least once.
     */
   public static void main(String[] args) {
   
        // TODO: Add test calls for each challenge method
        
      System.out.println("Testing printCharacters:");
      System.out.println(printCharacters("Caligraphy"));
   
        // Example:
        // System.out.println(printCharacters("hello"));
   
      System.out.println("\nTesting reverseWord:");
      System.out.println(reverseWord("noahIsCool"));
        // Example:
        // System.out.println(reverseWord("hello"));
        
      System.out.println("\nTesting capitalizeString:");
      System.out.println(capitalizeString("the quick brown fox"));
        
        // Example:
        // System.out.println(capitalizeString("the quick brown fox"));
   
      System.out.println("\nTesting detectPalindrome:");
      System.out.println(detectPalindrome("TacoCAt"));
        // Example:
        // System.out.println(detectPalindrome("racecar"));
   
      System.out.println("\nTesting firstUniqueChar:");
      System.out.println(firstUniqueChar("super man super man hot dog and baloney"));
        // Example:
        // System.out.println(firstUniqueChar("swiss"));
   }
}
