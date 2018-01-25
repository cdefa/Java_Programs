
package lotteryapplication.assignment.pkg1;

//********************************************************************************
// PantherID:  [Your PantherID]
// CLASS: COP 2210 – [Semester Year]
// ASSIGNMENT # [#]
// DATE: [Date]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
import java.util.Random;
import javax.swing.JOptionPane;

public class LotteryApplicationAssignment1 {
    public static void main(String[] args) {
         
    Random A = new Random();  	
    int a = 1 + A.nextInt(53);
    
    Random B = new Random();  	
    int b = 1 + B.nextInt(53);
    
    Random C = new Random();  	
    int c = 1 + C.nextInt(53);
    
    Random D = new Random();  	
    int d = 1 + D.nextInt(53);
    
    Random E = new Random();  	
    int e = 1 + E.nextInt(53);
    
    Random F = new Random();  	
    int f = 1 + F.nextInt(53);
    
    Random G = new Random();  	
    int g = 1 + G.nextInt(36);
    
    Random H = new Random();  	
    int h = 1 + H.nextInt(36);
    
    Random I = new Random();  	
    int i = 1 + I.nextInt(36);
    
    Random J = new Random();  	
    int j = 1 + J.nextInt(36);
    
    Random K = new Random();  	
    int k = 1 + K.nextInt(36);
    
    String first_name; 
    first_name = JOptionPane.showInputDialog("Are you ready to play Lotto?");
    
    JOptionPane.showMessageDialog(null,a +" "+ b +" "+ c +" "+ d +" "+ e +" "+ f + " these are your winning numbers!");
    
    String second_name; 
    second_name = JOptionPane.showInputDialog("Are you ready to play Fantasy5?");
    
    JOptionPane.showMessageDialog(null,g +" "+ h +" "+ i +" "+ j +" "+ k + " these are your winning numbers!");
    
     System.exit(0);

    }
    
}
