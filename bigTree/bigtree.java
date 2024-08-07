/** 
* Program to calculate the Total Points value of a candidate "big tree"
*
* @author Fiona Azumah
* @version 09/11/2023
*/

import java.util.Scanner;

   public class PA1 
   {
      public static void main(String[] args) 
      {
      
         Scanner input; // standard input
         String comName;
         String sciName;
         int circumference;
         int height;
         int csmax;
         int csmin;
         
         input = new Scanner(System.in);
         
         System.out.print("Enter the common name: ");
         comName = input.nextLine();
         
         System.out.print("Enter the scientific name:" );
         sciName = input.nextLine();
         
         System.out.print("Enter the circumeference in inches: ");
         circumference = input.nextInt();

         System.out.print("Enter the height in feet: ");
         height = input.nextInt();
         
         System.out.print("Enter the largest crown spread in feet: ");
         csmax = input.nextInt();
         
         System.out.print("Enter the smallest crown spread in feet: ");
         csmin = input.nextInt();
         
         int avgcrown = (csmax + csmin) / 2; // calculating average crown spread
         System.out.println(avgcrown);
         
         int total = circumference + height + (avgcrown/4); // calculating total points
         System.out.println(total);
         
         System.out.println("Big Tree Report: ");
         System.out.println();
         System.out.println("    Common Name: " + comName);
         System.out.println("Scientific Name: " + sciName); 
         System.out.println();
         System.out.println("  Circumference: " + circumference);
         System.out.println("         Height: " + height);
         System.out.println("  Average Crown: " + avgcrown);
         System.out.println();
         System.out.println("   Total Points: " + total);
      }
   
   }      