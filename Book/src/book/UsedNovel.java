
package book;
/**
 * UsedNovel class
 * Novel and Book child class
 * @author Carlos
 */
public class UsedNovel extends Novel {
    
    private int howold;
    private double discount;
    private double actualPrice;
    
    /**
     * constructor
     * 
     * @param title
     * @param price
     * @param type
     * @param markup
     * @param howold 
     */
    public UsedNovel(String title, double price, String type, double markup, int howold){
        super(title, price, type, markup);
        this.howold = howold;
    }
    /**
     * checks if two Used Novels are equal
     * 
     * @param other
     * @return 
     */
      public boolean equals (Object other){
    if(other instanceof UsedNovel){
        UsedNovel un1 = (UsedNovel) other;
        
    if(super.equals(un1) && (Math.abs(this.getActualPrice()) - un1.getActualPrice())< 1.0){
     return true;
    }else{ return false;
    }
    }else{ return false;
    }    
    }
      
      /**
       * outputs all the information of a used novel
       * @return 
       */
   public String toString(){
    
    String out = super.toString();
    out += "\n\tHow old: " + this.getHowOld() + " years" + "\n\tDiscount: " + this.getDiscount() + "%"
            + "\n\tFinal price: " + this.applyDiscount() + "$";
    return out;
    
}

//setters
public void setHowOld(int howold){
    this.howold = howold;
}
public void setDiscount(double Discount){
    
    if (this.howold<5){
    discount = 5;}
    else if (this.howold>=5 && this.getHowOld()< 10){
    discount = 10;}
    else if(this.howold>=10){
    discount = 15;}
    
    
}

//getters
public int getHowOld(){
    return howold;
}
public double getActualPrice(){
    return actualPrice;
}
public double getDiscount(){
    setDiscount(discount);
    return discount;
}

//applies a discount to a used novel
public double applyDiscount(){
    setDiscount(discount);
    discount = discount/100;
    actualPrice = super.getPrice() - super.getPrice() * discount;
    super.setPrice(actualPrice);
    return actualPrice;
}

}

