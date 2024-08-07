/* Homework 5

@author Fiona Azumah

@version 10/18/23

*/

import java.util.Date;


public class Book{

   public static final int AVAILABLE = 1;
   public static final int UNAVAILABLE = 2;
   
   private String title;
   private String author;
   private String isbn;
   private int pages;
   private int year;
   private int status;
   private Date due;
   private Patron patron;
   
   // initialising book attributes
   public Book (String title, String author, String isbn, int year, int pages){
      this.title = title;
      this.author = author;
      this.isbn = isbn;
      this.year = year;
      this.pages = pages;
      this.status = AVAILABLE;
      this.due = null;
      this.patron = null;
   }

   public void checkin(){
      this.status = AVAILABLE;
      this.due = null;
      this.patron = null;
   }
   
   public void checkout(Patron patron, Date due){
      this.status = UNAVAILABLE;
      this.patron = patron;
      this.due = due;
   }
   
   public boolean equals(Object other){
     if (other instanceof Book){
     Book book = (Book) other;
         if (book.isbn.compareTo(isbn) == 0){
         return true;
         }
         else{
         return false;
         }   
     }
     else if (other instanceof String){
         if (((String)other).compareTo(isbn) == 0){
         return true;
         }
         else{
            return false;
         }
     
    }
    return false;
  }
   
      public String getTitle() {
        return title;
      }

      public String getAuthor() {
        return author;
      }

      public String getIsbn() {
        return isbn;
      }
      
      public int getYear(){
         return year;
      }
       
      public int getPages() {
        return pages;
      }

      public int getStatus() {
        return status;
      }

      public Date getDue() {
        return due;
      }
      
      public Patron getPatron(){
         return patron;
      }
                
    
    public String toString(){
      return "Title:  " + title + ", " + "Author: "  + author + ", " + "ISBN: " + isbn + ", " + "Year: " + year  + ", " + "Pages: " + pages;
    } 
}