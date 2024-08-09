/**
  * Lab 4 - creating car class
  *
  * @author Fiona Azumah
  * @version - 09/20/2023
  */
  
  public class Car {
   
   private String make;
   private int year;-
   private double speed;
   
   public Car (String make, int year) {
      this.make = make;
      this.year = year;
      speed = 0.0;
   }
   
   public String toString() {
   return String.format("A %d %s that is going %.1f mph", year, make, speed);
   }
   
   public String getmake() {
   return make;
   }
   
   public double getspeed(){
   return speed;
   }
   
   public int getyear(){
   return year;
   }
   
   public void accelerate()
   {
      speed += 5;
   }
   
   public void brake()
   {
      speed -= 5;
   }
   
   
   
  }
