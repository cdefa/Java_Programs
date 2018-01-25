package huntedhouse;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos PID:6050200
 * @author Marvin PID:5129215 COP2210 Professor Debra Davis
 */
public class HuntedHousePath {

    String userName;
    String actualPosition;
    String loot;
    String leave;

    public HuntedHousePath(String userName, String actualPosition) {
        this.userName = userName;
        this.actualPosition = actualPosition;
    }

    public void setPosition(String actualPosition) {
        this.actualPosition = actualPosition;

    }

    /**
     * METHOD FOR FRONT DOOR
     *
     * @return
     */
    public String frontDoor() {
        if (actualPosition.equals("frontDoor")) {
            JOptionPane.showMessageDialog(null, userName + " You are now at the front door, your position is marked on the map by the big 'X'");
            ImageIcon locationFrontDoor = new ImageIcon("images/locationFrontDoor.png");
            JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, locationFrontDoor);
            do {
                actualPosition = JOptionPane.showInputDialog("From here, you can walk into the living room, dining room or take the stairs to the second floor " + "\n"
                        + " type: living room, dining room or stairs, respectively");
            } while (!actualPosition.equals("living room") && !actualPosition.equals("dining room") && !actualPosition.equals("stairs"));

        }
        return actualPosition;
    }

    /**
     * METHOD FOR LIVING ROOM
     *
     * @return
     */
    public String livingRoom() {

        if (actualPosition.equals("living room")) {
            JOptionPane.showMessageDialog(null, "You decide to enter the living room.");
            ImageIcon locationLivingRoom = new ImageIcon("images/locationLivingRoom.png");
            JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, locationLivingRoom);
            do {
                actualPosition = JOptionPane.showInputDialog(" You notice a large chest and a bathroom with a blinking light. Which will you explore?" + "\n"
                        + "Type: bathroom, chest, go back or leave , respectively ");

            } while (!actualPosition.equals("bathroom") && !actualPosition.equals("chest") && !actualPosition.equals("go back") && !actualPosition.equals("leave"));

            if (actualPosition.equals("chest")) {
                JOptionPane.showMessageDialog(null, "Okay, lets open the chest");
                ImageIcon chest = new ImageIcon("images/chest.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, chest);
                JOptionPane.showMessageDialog(null, "You died");
                actualPosition = "game over";
                
            }
            if (actualPosition.equals("go back")) {
                JOptionPane.showMessageDialog(null, "You are back at the front door");
                actualPosition = "frontDoor";
            }
            if (actualPosition.equals("leave")) {
                leave();
            }

        }
        return actualPosition;
    }

    /**
     * METHOD FOR BATHROOM
     *
     * @return
     */
    public String bathroom() {

        if (actualPosition.equalsIgnoreCase("bathroom")) {
            do {
                JOptionPane.showMessageDialog(null, "You are now in the bathroom. The light is dark and you've found a mirror reflecting the light from the living room"
                        + " would you like to look into it or go back to the living room?");
                actualPosition = JOptionPane.showInputDialog("type: mirror or go back");
            } while (!actualPosition.equals("mirror") && !actualPosition.equals("go back"));

            if (actualPosition.equals("mirror")) {

                ImageIcon BloodyFace = new ImageIcon("images/mirror1.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, BloodyFace);

                loot = "golden teeth";
                actualPosition = "bathroom";

            }
            if (actualPosition.equals("go back")) {
                JOptionPane.showMessageDialog(null, "You are back in the living room");
                actualPosition = "living room";
            }

        }
        return actualPosition;
    }

    /**
     * METHOD FOR DINING ROOM
     *
     * @return
     */
    public String diningRoom() {

        if (actualPosition.equalsIgnoreCase("dining room")) {
            JOptionPane.showMessageDialog(null, " Now you're standing in the dining room. The candles blow out and you smell an odd scent in the air.");
            ImageIcon locationDinningRoom = new ImageIcon("images/locationDinningRoom.png");
            JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, locationDinningRoom);
            do {
                actualPosition = JOptionPane.showInputDialog("Do you wish to go back, explore the candelabra, or proceed to the kitchen with the odd smell of rotten flesh?" + "\n"
                        + ", type: candelabra, kitchen, go back, or leave");
            } while (!actualPosition.equals("candelabra") && !actualPosition.equals("kitchen") && !actualPosition.equals("go back") && !actualPosition.equals("leave"));

            if (actualPosition.equals("candelabra")) {
                ImageIcon candelabra = new ImageIcon("images/candelabra.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, candelabra);
                JOptionPane.showMessageDialog(null, "the misterious ghost will count to ten and kill you");

                for (int number = 1; number != 11; number++) {
                    JOptionPane.showMessageDialog(null, number + " It's happening!");

                }
                JOptionPane.showMessageDialog(null, "you died!");
                actualPosition = "game over";
            }
            if (actualPosition.equals("go back")) {
                JOptionPane.showMessageDialog(null, "You are back at the front door");
                actualPosition = "frontDoor";
            }
            if (actualPosition.equals("leave")) {
                leave();
            }
            if (actualPosition.equals("kitchen")) {
                kitchen();
            }
        }
        return actualPosition;
    }

    /**
     * METHOD FOR KITCHEN
     *
     * @return
     */
    public String kitchen() {
        if (actualPosition.equalsIgnoreCase("kitchen")) {

            ImageIcon locationKitchen = new ImageIcon("images/locationKitchen.png");
            JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, locationKitchen);
            do {
                actualPosition = JOptionPane.showInputDialog("You entered kitchen, you can see that everything is disorganized and messy " + "\n"
                        + " There are knives on the floor and blood coming out of the bottom of the fridge" + "\n"
                        + " You have five posibilities, you can:"
                        + " go to the pantry, explore the cabinet, explore the bloody refrigerator, go back, or leave. What will you do? type: pantry, cabinet or refrigerator, go back or leave, respectively");
            } while (!actualPosition.equals("cabinet") && !actualPosition.equals("refrigerator") && !actualPosition.equals("go back") && !actualPosition.equals("leave"));

            if (actualPosition.equalsIgnoreCase("cabinet")) {
                ImageIcon cabinet = new ImageIcon("images/cabinet.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, cabinet);
                JOptionPane.showMessageDialog(null, "You died");
                actualPosition = "game over";

            } else if (actualPosition.equalsIgnoreCase("refrigerator")) {
                ImageIcon refrigerator = new ImageIcon("images/refrigerator.png");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, refrigerator);
                loot = "chopped head";
                actualPosition = "kitchen";
            }
            if (actualPosition.equals("go back")) {
                JOptionPane.showMessageDialog(null, "You are back in the dining room");
                actualPosition = "dining room";
            }
            if (actualPosition.equals("leave")) {
                leave();
            }
            if (actualPosition.equals("pantry")) {
                pantry();
            }
        }
        return actualPosition;
    }

    /**
     * METHOD FOR PANTRY
     *
     * @return
     */
    public String pantry() {
        if (actualPosition.equalsIgnoreCase("pantry")) {
            do {
                actualPosition = JOptionPane.showInputDialog("A cold breeze past through your shoulder and weird smells start to appear, you will have to decide "
                        + "between openning the dusty recipe box on the corner of the room or the broom" + "\n"
                        + "type: dusty recipe box, broom or go back respectively");
            } while (!actualPosition.equals("dusty recipe box") && !actualPosition.equals("broom") && !actualPosition.equals("go back"));
            if (actualPosition.equalsIgnoreCase("broom")) {
                ImageIcon broom = new ImageIcon("images/broom.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, broom);
                actualPosition = "pantry";

            } else if (actualPosition.equals("dusty recipe box")) {
                ImageIcon dustyRecipeBox = new ImageIcon("images/recipeBox.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, dustyRecipeBox);
                loot = "poisoned cookie";
                actualPosition = "pantry";

            } else if (actualPosition.equals("go back")) {
                JOptionPane.showMessageDialog(null, "You are back at the front door");
                actualPosition = "kitchen";
            }

        }
        return actualPosition;
    }

    /**
     * METHOD FOR STAIRS
     *
     * @return
     */
    public String stairs() {
        if (actualPosition.equalsIgnoreCase("stairs")) {
            JOptionPane.showMessageDialog(null, "You've taken the stairs to the second floor, seems like youre taking things to the next level, huh?" + "\n"
                    + " Very well... Here is the map and your location:");
            ImageIcon locationStairs = new ImageIcon("images/locationStairs.png");
            JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, locationStairs);
            do {
                actualPosition = JOptionPane.showInputDialog("Now you are standing in the second floor. A shadow passes from one of the bedrooms to the hall and lights barely let you see the steps you take" + "\n"
                        + " now you will have to decide"
                        + "which room of the second floor you want to enter." + "\n"
                        + " type bedroom1, bedroom2, master bedroom or go back");
            } while (!actualPosition.equals("bedroom1") && !actualPosition.equals("bedroom2") && !actualPosition.equals("master bedroom") && !actualPosition.equals("go back"));
        }
        if (actualPosition.equals("go back")) {
            JOptionPane.showMessageDialog(null, "You are back at the front door");
            actualPosition = "frontDoor";
        }
        return actualPosition;
    }

    /**
     * METHOD FOR BEDROOM1
     *
     * @return
     */
    public String bedroom1() {
        if (actualPosition.equalsIgnoreCase("bedroom1")) {
            JOptionPane.showMessageDialog(null, "You entered the first bedroom. The story here is this is where the son of the past owner of the house was last seen." + "\n"
                    + " People often say that the devil took him and only a spirit remains in this room");

            ImageIcon locationBedroom1 = new ImageIcon("images/locationBedroom1.png");
            JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, locationBedroom1);
            do {
                actualPosition = JOptionPane.showInputDialog(" Do you want to look at the mirror in the room, explore the rocking chair, go back, or go to the bathroom2?" + "\n" + "type: mirror, rocking chair, go back, bathroom2 or leave");
            } while (!actualPosition.equals("mirror") && !actualPosition.equals("rocking chair") && !actualPosition.equals("go back") && !actualPosition.equals("leave") && !actualPosition.equals("bathroom2"));
            if (actualPosition.equalsIgnoreCase("bathroom2")) {
                bathroom2();
            }
            if (actualPosition.equalsIgnoreCase("mirror")) {
                ImageIcon mirror = new ImageIcon("images/mirror1.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, mirror);
                JOptionPane.showMessageDialog(null, "You died");
                actualPosition = "game over";

            } else if (actualPosition.equalsIgnoreCase("rocking chair")) {
                ImageIcon rockingChair = new ImageIcon("images/rockingChair.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, rockingChair);
                actualPosition = "bedroom1";
                //No dialog here, needs dialog
            }
            if (actualPosition.equals("go back")) {
                JOptionPane.showMessageDialog(null, "You are back at the stairs");
                actualPosition = "stairs";
            }
            if (actualPosition.equals("leave")) {
                leave();
            }

        }
        return actualPosition;
    }

    /**
     * METHOD FOR BATHROOM2
     *
     * @return
     */
    public String bathroom2() {
        if (actualPosition.equals("bathroom2")) {
            
            do{
            actualPosition = JOptionPane.showInputDialog(null, "You see something in the mirror and the shower curtain move. Which one would you like to see? "
                    + "\n" + "type: mirror, curtain, go back or leave");
            }while(!actualPosition.equals("mirror") && !actualPosition.equals("curtain") && !actualPosition.equals("go back") && !actualPosition.equals("leave"));
           
            
            if (actualPosition.equals("mirror")) {
                ImageIcon mirror1 = new ImageIcon("images/mirror1.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, mirror1);
                JOptionPane.showMessageDialog(null, "You died");
                actualPosition = "game over";
            }
            if (actualPosition.equals("curtain")) {
                ImageIcon bathroom = new ImageIcon("images/bathroom2.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, bathroom);
                loot = "magic rope";
                actualPosition = "bathroom2";
            }
            if (actualPosition.equals("go back")) {
                JOptionPane.showMessageDialog(null, "You are back in the first bedroom");
                actualPosition = "bedroom1";
            }
            if (actualPosition.equals("leave")) {
                leave();
            }
        }
        return actualPosition;
    }

    /**
     * METHOD FOR BEDROOM2
     *
     * @return
     */
    public String bedroom2() {
        if (actualPosition.equalsIgnoreCase("bedroom2")) {
            ImageIcon locationBedroom2 = new ImageIcon("images/locationBedroom2.png");
            JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, locationBedroom2);
            do{
            actualPosition = JOptionPane.showInputDialog("Now you are in the daughter's room, her dolls are placed sitting on the tea table without eyes and they feel like they are alive! quick"
                    + "decide if you want to explore or go to another room" + "\n" + "type: go back, doll house, dresser, bathroom2 or leave ");
            }while(!actualPosition.equals("go back") && !actualPosition.equals("doll house") && !actualPosition.equals("dresser") && !actualPosition.equals("leave") && !actualPosition.equals("bathroom2"));
            
            if (actualPosition.equalsIgnoreCase("dresser")) {
                ImageIcon dresser = new ImageIcon("images/dresser.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, dresser);
                loot = "invisible cloak";
                actualPosition = "bedroom2";
            }
            if (actualPosition.equalsIgnoreCase("doll house")) {
                ImageIcon dollHouse = new ImageIcon("images/dollHouse.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, dollHouse);
                JOptionPane.showMessageDialog(null, "You died");
                actualPosition = "game over";
            }
            if (actualPosition.equals("go back")) {
                JOptionPane.showMessageDialog(null, "You are back in the second bathroom.");
                actualPosition = "bathroom2";
            }
            if (actualPosition.equals("leave")) {
                leave();

            }
        }
        return actualPosition;
    }

    /**
     * METHOD FOR MASTERBEDROOM
     *
     * @return
     */
    public String masterBedRoom() {
        if (actualPosition.equalsIgnoreCase("master bedroom")) {
            JOptionPane.showMessageDialog(null, "You've decided to go into the master bedroom, nobody has made it this far.");

            ImageIcon locationMasterBedroom = new ImageIcon("images/locationMasterBedroom.png");
            JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, locationMasterBedroom);
do{
            actualPosition = JOptionPane.showInputDialog("The doors open and the canddle lights are on. There is blood on the bed pillows and something that seems to be a cursed box sitting on the table. "
                    + "\n" + "from here there are not too many options so pick fast before they get you." + "\n" + "Type go back, master bathroom, jewelery box or leave");
}while(!actualPosition.equals(" master bathroom") && !actualPosition.equals("jewelery box") && !actualPosition.equals("leave") && !actualPosition.equals("go back"));
            if (actualPosition.equalsIgnoreCase("jewelery box")) {
                ImageIcon jeweleryBox = new ImageIcon("images/jeweleryBox.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, jeweleryBox);
                loot = "diamond ring";
                actualPosition = "master bedroom";
            }
            if (actualPosition.equals("go back")) {
                JOptionPane.showMessageDialog(null, "You are back at the stairs.");
                actualPosition = "stairs";
            }
            if (actualPosition.equals("leave")) {
                leave();
            }
        }
        return actualPosition;
    }

    /**
     * METHOD FOR MASTERBATHROOM
     *
     * @return
     */
    //We need to edit this beacuse you made it sound as if they were supposed to die no matter what in the room, however they are somehow able to collect loot and continue.
    public String masterBathroom() {
        if (actualPosition.equalsIgnoreCase("master bedroom")) {
            JOptionPane.showMessageDialog(null, "You just entered the last room of the house and are glad to see your journey come to an end. Unfortunately, the house begins to consume your soul!");
do{
            actualPosition = JOptionPane.showInputDialog("But before you die we will give you the oportunity to either open the shower or the Intricate oil lamp." + "\n" + "type: go back, shower or intricate oil lamp");
}while(!actualPosition.equals("shower") && !actualPosition.equals("intrincate oil lamp") && !actualPosition.equals("go back"));
            if (actualPosition.equalsIgnoreCase("shower")) {
                ImageIcon shower = new ImageIcon("images/shower.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, shower);
                JOptionPane.showMessageDialog(null, "You died");
                actualPosition = "game over";
            } else {
                ImageIcon oilLamp = new ImageIcon("images/bathroom2.jpg");
                JOptionPane.showMessageDialog(null, " ", " ", JOptionPane.INFORMATION_MESSAGE, oilLamp);
                loot = "enchanted lighter";
                actualPosition = "master bathroom";

            }
            if (actualPosition.equals("go back")) {
                JOptionPane.showMessageDialog(null, "You are back in the master bedroom");
                actualPosition = "master bedroom";
            }
        }
        return actualPosition;
    }

    /**
     * METHOD FOR LOOT
     *
     * @return
     */
    public String loot() {
        JOptionPane.showMessageDialog(null, "You collected: " + loot);
        return loot;
    }

    /**
     * METHOD FOR LEAVING
     *
     * @return
     */
    public String leave() {
        do {
            actualPosition = JOptionPane.showInputDialog("to leave the house and collect your loot type: yes");
            JOptionPane.showMessageDialog(null, "Bye! we hope to see you again");
            loot();
        } while (!actualPosition.equals("yes"));
        actualPosition = "game over";
        return actualPosition;
    }

    public String getPosition() {
        return actualPosition;
    }

}
