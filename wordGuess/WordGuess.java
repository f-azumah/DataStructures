/**
  * Homework 3 - Word Guess
  *
  * @author Fiona Azumah
  * @version - 09/20/2023
  */

import java.util.Arrays;

   public class WordGuess {
   
         public static String makeUserWord(String theWord)
         {
            char letter;
            int i;
            for (i = 0; i < theWord.length(); ++i) {
            
               letter = theWord.charAt(i);
               theWord.replace(letter,'*');
                   
            }
            
            return theWord; 
         }  
           public static boolean isInWord(char guess, String theWord) {
//               int i; 
//              for (i = 0; i < theWord.length(); ++i){
//                  
//                  if (theWord.charAt(i) == guess){
//                  }
//                  
//              }
             //  return True;
               if (theWord.contains(String.valueOf(guess))){
               }
               
               return true;
             
             
               
          
          
         }
            
            public static String updateUserWord(char guess, String userWord, String theWord){
            
               int i;
               for (i = 0; i < theWord.length(); ++i){
               
                  if (guess == theWord.charAt(i)){
                  userWord.replace(userWord.charAt(i),guess);
                  }
               }
               return userWord;
            }
      

             public static String updateGuesses(String guesses, char guess){
             
               
                   if (!guesses.contains(String.valueOf(guess))){
                   guesses += guess;
                   }
                   
                
                return guesses;
              }

               public static String displayUserWord(String userWord){
               
                  int i;
                  for (i = 0; i < userWord.length(); ++i){
                  
                     if (userWord.charAt(i) == '*'){
                        userWord.replace(userWord.charAt(i), '_'); 
                     }
                     
                     userWord.replace("", " ");
                  }
                  return userWord;
               }
               
               public static String displayGuesses(int strikes, String guesses){
                  int i;
                  char[] letters = new char[guesses.length()];
                  String newGuesses;
                  
                  for (i = 0; i < guesses.length(); ++i){
                     letters[i] = guesses.charAt(i);
                     newGuesses = Arrays.toString(letters);             
                  }
                 
                  System.out.println(newGuesses);
                  
                  newGuesses.substring(1, letters.length - 1);
                  System.out.println(newGuesses);
                
                return "hat";   
               }
               
           public static void main(String[] args){
           
           WordGuess.displayGuesses(3, "bgh");
           
           }   
               
   }