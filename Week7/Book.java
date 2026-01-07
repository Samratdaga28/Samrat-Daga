package Week7;


/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
String title;
 String author; 
 double price; 
 
 public Book(String title, String author, double price)
 { 
     this.title = title; 
     this.author = author;
     this.price = price;
 }
 public void displayDetails() 
 {
     System.out.println("Title: " + title + " | Author: " + author +
     " | Price :"  + price);
 }
    }