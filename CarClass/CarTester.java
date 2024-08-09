// Car tester class//

public class CarTester {
    
   public static void main(String[] args) {

   Car car1 = new Car("Porsche Cayenne", 2020);
   Car car2 = new Car("Audi A5", 2016);
   int i; 
   
      for (i = 0; i < 5; ++i) 
      {
      car1.accelerate();
      System.out.println("The " + car1.getmake() + " is going at: " + car1.getspeed() + "mph");
      }
   
      for (i = 0; i < 3; ++i) 
      {
      car2.accelerate();
      System.out.println("The " + car2.getmake() + " is going at: " + car2.getspeed() + "mph");
      }

      for (i = 0; i < 5; ++i) 
      {
      car1.brake();
      System.out.println("The " + car1.getmake() + " is going at: " + car1.getspeed() + "mph");
      }

   
   System.out.println(car1.toString());
   System.out.println(car2.toString());
  }
}