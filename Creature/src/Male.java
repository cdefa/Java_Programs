
import java.util.Comparator;

/**
 * This class will process all the information for the Males
 *
 * @author Carlos
 */

public class Male extends HumanBeing {

    //Instance Variables
    private double height;
    private double weight;

    //Constructor
    public Male(String name, int age, double height, double weight) throws notHumanBeingException {
        super(name, age);
        this.height = height;
        this.weight = weight;
        this.setIntLvl();
        if (this.weight >= 400 || this.height >= 100) {
            throw new notHumanBeingException(this.weight, this.height);
        }
    }

//METHODS
    /**
     * this method will return a String with the information of the person
     *
     * @return out
     */
    public String toString() {

        String out = "\n" + getClass().getName();
        out += "\nName: " + super.getName() + "\n\tAge: " + super.getAge()
                + "\n\tHeight: " + this.getHeight() + "\n\tWeight: " + this.getWeight()
                + "\n\tIntelligence Level: " + super.getIntLvl();

        return out;

    }

    /**
     * this method will calculate the intelligence level of a person
     */
    public void setIntLvl() {
        if (super.getAge() > 40) {
            super.setIntLvl(5);
        } else if (super.getAge() < 5) {
            super.setIntLvl(1);
        } else if (weight >= 150 && height > 70) {
            super.setIntLvl(5);
        } else if ((weight >= 120 && weight <= 149) && height > 70) {
            super.setIntLvl(4);
        } else if (weight >= 50 && weight <= 119) {
            super.setIntLvl(3);
        } else if ((weight >= 120 && weight <= 149) && (height >= 55 && height <= 69)) {
            super.setIntLvl(2);
        } else {
            super.setIntLvl(3);

        }
    }
//SETTERS

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
//GETTERS

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

}
