/** 
* Name converter program; a java class (NameConverter) that takes in a person's name, as input, in a particular format and displays the person's name in a different
format.
*
* @author Fiona Azumah
* @version 09/06/2023
*/
   import java.util.Scanner;
   
   public class NameConverter {
      public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);// declare object of scanner class
      String userInput = scnr.nextLine(); // saves input in userInput
      int i;  // loop index
      int count = 0; 
      int space1 = userInput.indexOf(" ");
      int space2 = userInput.indexOf(" ", space1 + 1);
      String firstName = userInput.substring(0, space1);
      String lastName = "" ;
      String midName = "";
      
      if (space2 != -1) {
         midName = userInput.substring(space1+1, space2);
         lastName = userInput.substring(space2+1); 
      }
      else {
         lastName = userInput.substring(space1+1);
      }
 
         for (i = 0; i < userInput.length(); ++i) { // loop to count spaces 
            if ( userInput.charAt(i) == ' '){
               ++count;
            }
         }
       
           if (count > 1){
            System.out.print(lastName +  ", " + firstName.charAt(0) + "." + midName.charAt(0)+ ".");
           }
           else if (count == 1){
            System.out.print(lastName +  ", " + firstName.charAt(0) + ".");
           } 
      }
      
   }