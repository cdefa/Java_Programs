package huntedhouse;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos PID:6050200
 * @author Marvin PID:5129215 COP2210 Professor Debra Davis
 */
public class HuntedHouse_1 {

    public static void main(String[] args) {

        HuntedHousePath path = new HuntedHousePath("", "");
        String userName;
        String actualPosition = "frontDoor";
        String loot;

        userName = JOptionPane.showInputDialog("Welcome to the Hunted House Game, what is your name?");
        JOptionPane.showMessageDialog(null, "Ok " + userName + " let this scary adventure begin");
        JOptionPane.showMessageDialog(null, "During your adventure you may find objects which can be collected from each of the rooms");
        JOptionPane.showMessageDialog(null, "You can always leave the house only when standing at the main rooms and after collected one item, by saying: leave");
        JOptionPane.showMessageDialog(null, "Also at the end you will keep the last item that you found at the house");

        while (!actualPosition.equals("game over")) {

            path.setPosition(actualPosition);
            path.frontDoor();
            actualPosition = path.getPosition();

            switch (actualPosition) {
             
                case "living room":
                    
                    path.livingRoom();
                    actualPosition = path.getPosition();
                    break;
            
        
                case "bathroom":

                    path.bathroom();
                    actualPosition = path.getPosition();
                    break;
            
                case "dining room":
                    
                    path.diningRoom();
                    actualPosition = path.getPosition();
                    break;
                    
                case "kitchen":
                    path.kitchen();
                    actualPosition = path.getPosition();
                    break;
                
                case "pantry":
                    path.pantry();
                    actualPosition = path.getPosition();
                    break;
                    
                case "stairs":
                    path.stairs();
                    actualPosition = path.getPosition();
                    break;
                
                case "bedroom1":
                    path.bedroom1();
                    actualPosition = path.getPosition();
                    break;
                    
                case "bathroom2":
                    path.bathroom2();
                    actualPosition = path.getPosition();
                    break;
                    
                case "bedroom2":
                    path.bedroom2();
                    actualPosition = path.getPosition();
                    break;
                
                case "master bedroom":
                    path.masterBedRoom();
                    actualPosition = path.getPosition(); 
                    break;
                    
                case "master bathroom":
                    path.masterBathroom();
                    actualPosition = path.getPosition();
                    break;
            }
            

    }
path.loot();
        }}
