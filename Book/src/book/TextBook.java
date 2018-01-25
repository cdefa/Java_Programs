
package book;

/**
 * TextBook class 
 * Book child class
 */
public class TextBook extends Book{

private String field;
private double discount;
private double actualPrice;

/**
 * constructor
 * 
 * @param title
 * @param price
 * @param field
 * @param discount 
 */
   public TextBook(String title, double price, String field, double discount){
        super(title, price);
        this.field = field;
        this.discount = discount;
    }
   /**
    * checks if two textbooks are equal
    * 
    * @param other
    * @return 
    */
     public boolean equals (Object other){
    if(other instanceof TextBook){
        TextBook t1 = (TextBook) other;
        
    if(super.equals(t1) && this.field.equals(t1.getField())){
     return true;
    }else{
        return false;
    }
    }else{
        return false;
    }}
     
     /**
      * outputs all the information of a textbook
      * @return 
      */
    public String toString(){
    
    String out = super.toString();
    out += "\n\tField: " + this.getField() + "\n\tDiscount: " + 
    this.getDiscount()+ "%" + "\n\tActual price: " + this.applyDiscount() +"$";
    return out;
    
}
    


//setters
public void setField(String field){
    this.field = field;
}
public void setDiscount(double discount){
    this.discount = discount;
}

//getters
public String getField(){
    return field;
}
public double getDiscount(){
    return discount;
}

//apply discount to a textbook
public double applyDiscount(){
    this.setDiscount(discount);
     actualPrice = super.getPrice() - super.getPrice() * discount/100;
    super.setPrice(actualPrice);
    return actualPrice;
}
}



















