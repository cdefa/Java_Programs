
/**
 * This class will process all the information for the females
 *
 * @author Carlos
 */
public class Female extends HumanBeing implements Comparable<HumanBeing> {

    private String lastDegree;
//Constructor

    public Female(String name, int age, String lastDegree) throws notHumanBeingException {
        super(name, age);
        this.lastDegree = lastDegree;
        this.setIntLvl();
        if (this.getAge() >= 110) {
            throw new notHumanBeingException(super.getAge());
        }

    }
//Methods

    /**
     * this method will return a String with the information of the person
     *
     * @return out
     */
    public String toString() {

        String out = "\n" + getClass().getName();
        out += "\nName: " + super.getName() + "\n\tAge: " + super.getAge()
                + "\n\tLast Degree: " + this.lastDegree + "\n\tIntelligence Level: "
                + super.getIntLvl();
        return out;

    }

    /**
     * this method will calculate the intelligence level of a Female
     */
    public void setIntLvl() {
        if (lastDegree.equals("Ph.D.")) {
            super.setIntLvl(5);
        } else if (lastDegree.equals("MS")) {
            super.setIntLvl(4);
        } else if (lastDegree.equals("BS")) {
            super.setIntLvl(3);
        } else if (lastDegree.equals("AA")) {
            super.setIntLvl(2);
        } else {
            super.setIntLvl(1);
        }
    }

//Setters
    public void setLastDegree(String lastDegree) {
        this.lastDegree = lastDegree;
    }
//Getters

    public String getLastDegree() {
        return lastDegree;
    }
}
