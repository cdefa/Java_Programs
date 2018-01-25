
package book;
/**
 * Novel class
 * book child class
 * @author Carlos
 */
public class Novel extends Book{
    
    private String type;
    private double markup;
   
    /**
     * Constructor
     * @param title
     * @param price
     * @param type
     * @param markup 
     */
    public Novel(String title, double price, String type, double markup){
        super(title,price);
        this.type = type;
        this.markup = markup;
        
    }
    /**
     * this method outputs if two Novels are equal or not
     * 
     */
    public boolean equals (Object other){
    if(other instanceof Novel){
        Novel n1 = (Novel) other;
        
    if(super.equals(n1) && type.equals(n1.getType())){
     return true;
    }
    else{
        return false;
    }
    }else {
    return false;
    }}
        
    
    /**
     * this method outputs all the information of novels
     * @return out
     */
    public String toString(){
    
    String out = super.toString();
    out += "\n\tType: " + this.getType() + "\n\tMarkup: " +  this.getMarkup()+"%" + "\n\tActual price: " + this.applyMarkup() +"$";
    return out;
    
}

//setters
public void setType(String type){
    this.type = type;
}
public void setMarkup(double markup){
    this.markup = markup;
    
}
//getters
public String getType(){
    return type;
}
public double getMarkup(){
    return markup;
}

//apply the markup to a novel
public double applyMarkup(){
    this.setMarkup(markup);
    double actualPrice = super.getPrice() * (markup/100) + super.getPrice();
    super.setPrice(actualPrice);
    return actualPrice;
}
}
