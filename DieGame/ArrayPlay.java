/**
  * Lab 3
  *
  * @author Fiona Azumah
  * @version - 08/16/2023
  */

public class ArrayPlay {

     
   int[] array = new int[6];
   int i; //loop index

   
      for (i = 0; i < array.length; ++i) // loop to initialize each element to -1
      {
         array[i] = -1; 
      }
   
      for (i = 0; i < array.length; ++i)
      {
         System.out.println("array" + "[" + i + "]" + " = " + array[i]);
      }
      
      for (i = 0; i < array.length; ++i) // initiliazing each element to its subscript
      {
         array[i] = i;
         System.out.println("array" + "[" + i + "]" + " = " + array[i]);
      }
      
 
      for (i = 0; i < array.length; ++i) // initilaizing each element to 0
      {
         array[i] = 0;
      } 
      
      Die dice = new Die(); // new obect Die
           
      for (i = 0; i < 100; ++i) // loop to roll die multiple times
      {
         int faces = dice.roll(); // roll() method rolls the die and returns the face value which is saved in the faces variable
         array[faces-1] += 1;
      }   
      
      for (i = 0; i < array.length; ++i) {                
          
         System.out.println(i+1 + " was rolled " + array[i] + " times.");
      }      
     
    

    double[] array1 = {8,9,4,2,10,3,1,7,6,13};
    double[] array2 = new double [10];
      
      System.out.println();   
      System.out.println("Before: ");

      for (i = 0; i < array1.length; ++i)
      {
         System.out.println("array1" + "[" + i + "]" + " = " + array1[i] + " " + "array2" + "[" + i + "]" + " = " + array2[i]);

      }
   
      for (i = 0; i < array1.length; ++i)
      {
         array2[i] = array1[i];
      }
      
      System.out.println();
      System.out.println("After: ");      

      for (i = 0; i < array1.length; ++i)
      {
         System.out.println("array1" + "[" + i + "]" + " = " + array1[i] + " " + "array2" + "[" + i + "]" + " = " + array2[i]);
      }
      
      
      array1[6] = 99;
      array2[3] = 28;
      
      System.out.println();   
      System.out.println("After Change: ");

      for (i = 0; i < array1.length; ++i)
      {
         System.out.println("array1" + "[" + i + "]" + " = " + array1[i] + " " + "array2" + "[" + i + "]" + " = " + array2[i]);

      }



    }
}

