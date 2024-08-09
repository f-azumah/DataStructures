import java.util.Scanner;
/**********************************************************************
 * Class purpose: Produce Star patterns demonstrating nested loops
 *
 * @author  Farzana Rahman, Fiona Azumah
 * @version V2 06/02/2020
 *********************************************************************/

public class Stars
{
   /******************************************************************
    * Function purpose:  Prints star pattern
    *
    * @param args Command line arguments, ignored
    *****************************************************************/

   public static void main (String[] args)
   {
      char     hiPattern;  // pattern count
      int      maxRows;    // maximum number of rows to print
      int      starCnt;    // Stars per row
      int      blnkCnt;    // Blanks preceding the stars
      Scanner  stdIn;      // standard input

      stdIn = new Scanner(System.in);
      System.out.print("Enter positive number for the number of rows: ");
      
      maxRows = stdIn.nextInt();

      //**************************************************
      // First Example, stars per row goes from 1 to maxRow
      //**************************************************
      System.out.println();
      System.out.println("GIVEN example\n");
      for (int row = 1; row <= maxRows; row++)
      {
         starCnt = row;
         for (int star = 1; star <= starCnt; star++)
         {
            System.out.print ("*");
         }
         System.out.println();
      }

      //*******************************************************
      // Insert code for patterns (A), (B), (C) below.
      //*******************************************************
      // Code for pattern A: 
      //********** 
      //********* 
      //******** 
      //******* 
      //****** 
      //*****
      //**** 
      //*** 
      //**
      //*
       for (int row = maxRows; row > 0; row--)
      {
         starCnt = row;
         for (int star = 0; star < starCnt; star++)
         {
            System.out.print("*");
         }
         System.out.println(); 
      } 
      
      // Code for pattern B//
       /*         *
                 **
                ***
               ****
              *****
             ******
            *******
           ********
          *********
         ********** */
      for (int row = 1; row <= maxRows; row++)
      {
       blnkCnt = maxRows-row;
       for (int space = 0; space < blnkCnt; space++)
         {
            System.out.print(" "); 
         }
         starCnt = row;
         for (int star = 1; star <= starCnt; star++)
         {
            System.out.print("*");  
         } 
         System.out.println();  
      }  
      
      // Code for pattern C//
      /* **********
          *********
           ********
            *******
             ******
              *****
               ****
                ***
                 **
                  * */
      for (int row = maxRows; row > 0; row--)
      {
         blnkCnt = maxRows - row;
         for (int space = 0; space < blnkCnt; space++)
         {
            System.out.print(" "); 
         }

         starCnt = row;
         for (int star = 0; star < starCnt; star++)
         {
            System.out.print("*");
         }
         System.out.println(); 
      } 
   
   }
   
    
}
