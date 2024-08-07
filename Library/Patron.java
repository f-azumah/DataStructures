/*

@author Fiona Azumah

@version 10/18/23

*/
public class Patron{


  private String name;
  private String email;
  private int idNumber;
  private double balance;
   
  public Patron(String name, String email, int idNumber, double balance){
   this.name = name;
   this.email = email;
   this.idNumber = idNumber;
   this.balance = balance;
  }
  
  public double adjustBalance(double amount){
   balance = balance + amount;
   return balance;
  }
  
  public boolean equals(Object other){
   if (other instanceof Patron){
   Patron patron = (Patron) other;
      if (patron.idNumber == (idNumber)){
         return true;
      }
      {
         return false;
      }
   }
      
   else if (other instanceof Integer){
      if (((Integer)other) == (idNumber)){
         return true;
      }
      {
         return false;
      }
   }
   return false;
       
  }
  
  public String toString(){
   return "Name: " + name + ", " + "Email: " + email + ", " + "ID: " + idNumber + ", " + String.format("Balance: $%.2f", balance);
  }
}