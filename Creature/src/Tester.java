
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * This program is designed to take input with information of people from a file
 * check if they are indeed valid people, calculate their intelligence level and
 * store them into a list, then put all the information in order sorting the
 * people by name, the males and females will be sorted by height and age
 * respectively.
 *
 * @author Carlos
 */
public class Tester {

    public static void main(String args[]) throws FileNotFoundException {
        ArrayList<HumanBeing> personArray = new ArrayList<HumanBeing>();
        Male[] males = new Male[50];
        Female[] females = new Female[50];
        int i = 0;
        int j = 0;

        String inf = JOptionPane.showInputDialog("Input file?");
        // Input file is src/<name of the file>
        FileReader inFile = new FileReader(inf);
        Scanner in = new Scanner(inFile);

        String outf = JOptionPane.showInputDialog("Output file?");
        PrintWriter outFile = new PrintWriter(outf);

        /**
         * The loops will read through every line of the file provided and
         * perform the operations required, and spit it into the output file
         */
        
            while (in.hasNext()) {
                String m = in.next();

                switch (m) {
//Method for storing the males
                    case "M":
                        try {
                            males[i] = (new Male(in.next(), in.nextInt(), in.nextDouble(), in.nextDouble()));
                            personArray.add(males[i]);
                            i++;

                        } catch (notHumanBeingException e) {
                            e.printStackTrace();
                            outFile.println("YOU TRIED TO CREATE AN INVALID MALE!!!\nReminder: Only males who are less than 400 pounds and 100 inches are valid.");
                        } finally {

                            break;
                        }
//Method for storing the females
                    case "F":
                        try {
                            females[j] = (new Female(in.next(), in.nextInt(), in.next()));
                            personArray.add(females[j]);
                            j++;

                        } catch (notHumanBeingException e1) {
                            e1.printStackTrace();
                            outFile.println("YOU TRIED TO CREATE AN INVALID FEMALE!!!\nReminder: Only females who are less than 110 years old are valid.");
                        } finally {

                            break;
                        }
                }
            }

        
        //OUTPUT FOR PEOPLE
        outFile.println("UNSORTED ARRAY OF PEOPLE:");
        for (int x = 0; x < personArray.size(); x++) {
            outFile.println(personArray.get(x).toString());
        }
        outFile.println("_____________________________________________"
                + "_______________________");

        outFile.println("SORTED ARRAY OF PEOPLE:");
        Collections.sort(personArray);
        for (int x = 0; x < personArray.size(); x++) {
            outFile.println(personArray.get(x).toString());
        }
        outFile.println("_____________________________________________"
                + "_______________________");

        //OUTPUT FOR MALES
        outFile.println("UNSORTED ARRAY OF MALES:");
        for (int x = 0; x < i; x++) {
            outFile.println(males[x].toString());
        }
        outFile.println("_____________________________________________"
                + "_______________________");

        outFile.println("SORTED ARRAY OF MALES:");
        ArrayList<Male> tempArr = new ArrayList<Male>();
        for (int x = 0; x < i; x++) {
            tempArr.add(males[x]);
        }
        Collections.sort(tempArr, new xComparator());
        for (int x = 0; x < tempArr.size(); x++) {
            outFile.println(tempArr.get(x).toString());
        }
        outFile.println("_____________________________________________"
                + "_______________________");

        //OUTPUT FOR FEMALES
        outFile.println("UNSORTED ARRAY OF FEMALES:");
        for (int x = 0; x < j; x++) {
            outFile.println(females[x].toString());
        }
        outFile.println("_____________________________________________"
                + "_______________________");

        outFile.println("SORTED ARRAY OF FEMALES:");
        ArrayList<Female> tempArr2 = new ArrayList<Female>();
        for (int x = 0; x < j; x++) {
            tempArr2.add(females[x]);
        }
        Collections.sort(tempArr2, new yComparator());
        for (int x = 0; x < tempArr2.size(); x++) {
            outFile.println(tempArr2.get(x).toString());
        }
        outFile.println("_____________________________________________"
                + "_______________________");

        String line = in.nextLine();
        outFile.println(line + "\n");
        outFile.close();
        in.close();

    }
}
