
import java.util.Comparator;

/**
 * this class implements the Comparator and compares two males by their height
 *
 * @author Carlos
*
 */
public class xComparator implements Comparator<Male> {

    /**
     * method for comparing two males
     *
     * @param m1
     * @param m2
     * @return 0, -1 or 1
     */
    public int compare(Male m1, Male m2) {
        if (m1.getHeight() > m2.getHeight()) {
            return 1;
        } else if (m1.getHeight() < m2.getHeight()) {
            return -1;
        } else {
            return 0;
        }

    }
}
