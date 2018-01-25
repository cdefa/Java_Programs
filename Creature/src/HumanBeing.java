
import java.util.ArrayList;

/**
 * this is the Human being super class that contains the name and age for all
 * human beings
 *
 * @author Carlos
 */
public class HumanBeing extends Creature implements Comparable<HumanBeing> {

//Instance Variables
    private String name;
    private int age;

//Constructor
    public HumanBeing(String name, int age) {
        
        this.name = name;
        this.age = age;

    }

    /**
     * this method compares human beings by their names
     *
     * @param other
     * @return 1, -1, 0
     */
    public int compareTo(HumanBeing other) {
        int compareInt = this.name.compareTo(other.name);
        if (compareInt < 0) {
            return -1;
        }
        if (compareInt > 0) {
            return 1;
        }
        return 0;
    }
//SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void IntLvl() {
    }
    

//GETTERS 
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public int getIntLvl(){
        return intLvl;
    }
}
