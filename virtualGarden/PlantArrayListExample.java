import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample
{
   // Method prints an ArrayList of objects                                                       
   public static void printArrayList(ArrayList<Plant> myGarden) {
      int i;
      
      for (i = 0; i < myGarden.size(); ++i) {
         myGarden.get(i).printInfo();
         System.out.println();
      }
   }

   
   public static void main(String[] args) 
   {
      Scanner scnr = new Scanner(System.in);
    
     
      // TODO
      // Declare an ArrayList called myGarden to store Plant objects.
      // Note: Since Plant is the base class and Flower is the derived class, 
      // the Arraylist declared to store Plant will be able to refer to  either Plant object or Flower object.
      // See the slide deck for Inheritance and polymorphism if you need to revise these concepts.
      
      ArrayList<Plant> myGarden = new ArrayList<Plant>();
      
      
      String plantName, plantCost;
      String flowerName, flowerCost, colorOfFlowers;
      boolean isAnnual;
      String input;
      
      input = scnr.next();
      while(!input.equals("-1"))
      {
         
         if (input.equals("plant")) {
            //TO DO
            Plant plant = new Plant(); //instantiate a Plant object
            plant.setPlantName(scnr.next()); //take name input from user and set the name of the plant obect
            plant.setPlantCost(scnr.next()); //take cost input from user and set the cost of the plant object           
            
            myGarden.add(plant); //Add the plant object to the ArrayList myGarden
            
            
         }
         else if (input.equals("flower")) {
            //TO DO
           Flower flower = new Flower(); //instantiate a Flower object
            
            boolean plantType;
            
            flower.setPlantName(scnr.next()); //take name input from user and set the name of the flower obectpla
            flower.setPlantCost(scnr.next()); //take cost input from user and set the cost of the flower object
            flower.setPlantType(Boolean.parseBoolean(scnr.next())); //take input from the usr if flower is annual and set the isAnnual field of flower object
            flower.setColorOfFlowers(scnr.next()); //take color input from user and set the color field of the flower object
            myGarden.add(flower); //Add the flower object to the ArrayList myGardenplant Spirea 10
            


         }
         input = scnr.next();
       }
      
     printArrayList(myGarden); // TO DO: Call the method PrintArrayList to print myGarden
      
   }
}
