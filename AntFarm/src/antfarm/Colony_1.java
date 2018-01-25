package antfarm;

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;





public class Colony_1 {
    
    String careTakerName;
    String colonyName;
    int colonySize;
    boolean expansion;
    String queenName;
    int feed;
    int breed;
    private int lifeSpan; 
    
    public Colony_1(String careTakerName, String colonyName, int colonySize, boolean expansion, String queenName, int feed, int breed, int LifeSpan){
    this.careTakerName = careTakerName;
    this.colonyName = colonyName;
    this.colonySize = colonySize;
    this.expansion = expansion;
    this.queenName = queenName;
    this.feed = feed;
    this.breed = breed;
    this.lifeSpan = lifeSpan;
    
    }
    //setters
    
    public void setLifeSpan (int lifeSpan){
        this.lifeSpan = lifeSpan;
    }
    
     public void setColonySize(int colonySize){
         this.colonySize = colonySize;
     }
    
     public void setFeed(int feed){
         this.feed = feed;
     }
            
     public void setBreed(int breed){
         this.breed = breed;
     }
   
    public void setQueenName(String queenName){
    this.queenName = queenName;
    
}
      public int getColonySize(){
         return colonySize;
     }

     public int getLifeSpan(){
         return lifeSpan;
     }
     public void Breed(int breed){
     
     if (breed >= 1) {

     colonySize = colonySize * breed;
     }
     
     }
     public void lifeSpan(int lifeSpan){
     JOptionPane.showMessageDialog(null, "Remember that the life Span of your queen is " + lifeSpan + " days.");
     }
     
     public void Feed (int feed){
        if (feed > 10) {

            JOptionPane.showMessageDialog(null, "Oh no! the queen died, she couldn't handdle that much of food");
            colonySize = colonySize/2;
            JOptionPane.showMessageDialog(null, "now your colony has decreased to: " + colonySize + " ants");
        } else {

            JOptionPane.showMessageDialog(null, "Perfect now your ants will have plenty of food, this also mean that your queen could breed " + feed + " time(s).");
     }
     }

   
public void setExpansion(boolean IfExpand) {
        
    
    if(IfExpand){
        Random A = new Random();  	
        int a = A.nextInt(2);
        
         if (a == 1) {
                JOptionPane.showMessageDialog(null, "Congratulations a new Queen was born her name is: " + queenName + " 2.0!"); 
                 
        } else {
                JOptionPane.showMessageDialog(null, "Looks like the Queen wasn't born");}
    }
    else{
       Random B = new Random();
        int b = 1 + B.nextInt(10);
       
        if (b==1){
        JOptionPane.showMessageDialog(null, "Congratulations a new Queen was born her name is: " + queenName + " 2.0!"); 
        
        }else{
        JOptionPane.showMessageDialog(null, "Looks like the Queen wasn't born");
        }
        
    }


    }
}
