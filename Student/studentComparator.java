import java.util.Comparator;


public class studentComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return (s1.lastName).compareToIgnoreCase(s2.lastName);
    }
}

