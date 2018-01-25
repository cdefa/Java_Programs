
/**
 * this class is used to handdle exceptions generated when non valid human beings are created
 *
 * @author Carlos
 */
class notHumanBeingException extends Exception {

    //instance variables
    private double weight;
    private double height;
    private int age;

    //constructor
    public notHumanBeingException(double weight, double height) {
        this.weight = weight;
        this.height = height;

    }

    //Methods
    public notHumanBeingException(int age) {
        this.age = age;
    }

    //Getters
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getAge() {
        return age;
    }
}
