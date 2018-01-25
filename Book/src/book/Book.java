
package book;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 * The book class is the super class which has most of the operations performed 
 * with the books stored. 
 * @author Carlos
 */
public class Book {

private String title;
private double price;
private double markup;
private double discount;
private double actualPrice;

/**
 * Constructor
 * 
 * @param title
 * @param price 
 */
public Book(String title, double price){
    this.title = title;
    this.price = price;
}
/**
 * This method checks if two books are equal
 * 
 * @param other
 * @return 
 */
public boolean equals (Object other){
    if(other instanceof Book){
        Book b1 = (Book) other;
        
    if(title.equals(b1.getTitle())){
     return true;
    }else{ return false;
    }
    }else{ return false;
    }}
    
/**
 * this method outputs all the information of one book
 * @return out
 */
public String toString(){
    
    String out = getClass().getName();
    out += ":\nThe book: \n\tTitle: " + this.getTitle() + "\n\tPrice: " + this.getPrice() +"$";
    return out;
    
}

 
 
//setters    

 public void setMarkup(double markup){}
 public void setDiscount(double discount){}
 public void setTitle(String title){
    this.title = title;
}
public void setPrice(double price){
    this.price = price;
}

//getters
public double getDiscount(){
    return discount;
}
public double getMarkup(){
    return markup;
}
public String getTitle(){
    return title;
}
public double getPrice(){
    return price;
}

// apply disscount and markup to a book
public double applyDiscount(){
    return actualPrice;
}
public double applyMarkup(){
    return actualPrice;
}
}
