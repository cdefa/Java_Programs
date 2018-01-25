
import java.util.Comparator;

/**
 * this class implements the Comparator and compares two females by their age
 *
 * @author Carlos
 */

public class yComparator implements Comparator<Female> {

    /**
     * method for comparing two females
     *
     * @param f1
     * @param f2
     * @return 0, -1 or 1
     */
    public int compare(Female f1, Female f2) {
        if (f1.getAge() > f2.getAge()) {
            return 1;
        } else if (f1.getAge() < f2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
