package antfarm;
//********************************************************************************
// FIU PANTHERID: 6050200
// CLASS: COP 2210 â€“ fall 2016
// ASSIGNMENT 2 [#]
// DATE: [Date]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class AntFarm {

    public static void main(String[] args) {
      
        String careTakerName = "";
        String colonyName = "";
        int colonySize = 0;
        boolean expansion = false;
        String queenName = "";
        int feed = 0;
        int breed = 0; 
        int lifeSpan = 10;
        
        Colony_1 colony = new Colony_1(careTakerName,colonyName,colonySize, expansion,queenName, feed, breed, lifeSpan);
        
        queenName = JOptionPane.showInputDialog("What is the name of your ant Queen?");
        JOptionPane.showMessageDialog(null, "Congratulations! the Queen's name is: " + queenName + ", make sure you take good care of her.");
        colony.setQueenName(queenName);
        
        careTakerName = JOptionPane.showInputDialog("What is the name of the care taker (you)? ");
        JOptionPane.showMessageDialog(null, "Hello " + careTakerName + ", I'm sure you will make your ants very happy");
        
        colonyName = JOptionPane.showInputDialog("What is the name of the colony?");
        JOptionPane.showMessageDialog(null, colonyName + " it's just a perfect name for your colony.");
        
        colonySize = Integer.parseInt(JOptionPane.showInputDialog("How many ants does the colony will start off with?"));
        JOptionPane.showMessageDialog(null, "Remember that at this moment your colony has " + colonySize + " ants!");
        colony.setColonySize(colonySize);
       
        colony.setLifeSpan(lifeSpan);
        colony.lifeSpan(lifeSpan);
        
        
        do{
        feed = Integer.parseInt(JOptionPane.showInputDialog(null, " How many times you want to feed your colony? remember this number could be from 1-20"));
        colony.setFeed(feed);
        colony.Feed(feed);
        
       
        breed = Integer.parseInt(JOptionPane.showInputDialog("if you would like to breed your queen, tell me how many times, otherwise type 0"));
        if (feed < breed)
        {
         JOptionPane.showMessageDialog(null, "They need at least one day of food for each time you want to breed!");   
        }
        else 
        {
        colony.setBreed(breed);
        colony.Breed(breed);    //figure out how to call this method
        JOptionPane.showMessageDialog(null, "Looks like your queen has succesfully breed, now you have: " + colony.getColonySize() + " ants!");
        }
       } while (feed < breed);
        
         String expansionQuestion = JOptionPane.showInputDialog(null, " Would you like to expand your colony by adding one more module to it? if "
                + "your anwser is yes, type: yes, otherwise type: no.");
        
       
        if (expansionQuestion.equalsIgnoreCase("yes")){
            expansion = true;
        }else{
            expansion = false;
        }
        colony.setExpansion(expansion);     //figure out how to call this method
        
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
        
    
     
     
    }

}

