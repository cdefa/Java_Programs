/********************************************************************* 
   Author     : Carlos De Faria
   Course     : COP4814
   Professor  : Caryl Rahn
   Program    : Lab 1
   Purpose    : This program is designed to keep record of a list of Students with id, last name and 
		courses,  the program will output the list of students ordered in alphabetically
   Due Date   : 01/21/2018 

   Certification: 
   I hereby certify that this work is my own and none of it is the work of any other person. 


  Carlos De Faria
*********************************************************************/   
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class StudentTest {
     
    public static void main(String[] args) {
       ArrayList <Student> students = new ArrayList<Student>();
      
       
        Student s1 = new Student("001", "Johnson");
        s1.courseID.add("COP2250");
        s1.courseID.add("COP1210");
        s1.courseID.add("COP4250");
        Student s2 = new Student("002", "Smith");
        s2.courseID.add("ENC1105");
        s2.courseID.add("COP1210");
        s2.courseID.add("REL2210");
        Student s3 = new Student("003", "Ramirez");
        s3.courseID.add("COP3337");
        s3.courseID.add("COP4250");
        s3.courseID.add("COP4250");
        Student s4 = new Student("004", "Kim");
        s4.courseID.add("COP3530");
        s4.courseID.add("COP1210");
        s4.courseID.add("ENC3250");
        Student s5 = new Student("005", "Lee");
        s5.courseID.add("COP2250");
        s5.courseID.add("ENC1105");
        s5.courseID.add("COP4250");
        Student s6 = new Student("006", "Wong");
        s6.courseID.add("REL2210");
        s6.courseID.add("COP1210");
        s6.courseID.add("COP4250");
        Student s7 = new Student("007", "Alvarez");
        s7.courseID.add("COP2250");
        s7.courseID.add("REL2210");
        s7.courseID.add("ENC3250");
        Student s8 = new Student("008", "Johnson");
        s8.courseID.add("COP2250");
        s8.courseID.add("COP1210");
        s8.courseID.add("COP4250");
        Student s9 = new Student("009", "Pier");
        s9.courseID.add("ENC2210");
        s9.courseID.add("COP1210");
        s9.courseID.add("COP4250");
        Student s10 = new Student("001", "Duvan");
        s10.courseID.add("COP2250");
        s10.courseID.add("REL2210");
        s10.courseID.add("COP4250");
        
        
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
        
        
        
        Collections.sort(students, new studentComparator());
        
        
        System.out.println(students.get(0).Id + ", " + students.get(0).lastName + "     " + students.get(0).courseID.get(0) + 
                        ", " + students.get(0).courseID.get(1) + ", " + students.get(0).courseID.get(2));
        System.out.println(students.get(1).Id + ", " + students.get(1).lastName + "       " + students.get(1).courseID.get(0) + 
                        ", " + students.get(1).courseID.get(1) + ", " + students.get(1).courseID.get(2));
        System.out.println(students.get(2).Id + ", " + students.get(2).lastName + "     " + students.get(2).courseID.get(0) + 
                        ", " + students.get(2).courseID.get(1) + ", " + students.get(2).courseID.get(2));
        System.out.println(students.get(3).Id + ", " + students.get(3).lastName + "     " + students.get(3).courseID.get(0) + 
                        ", " + students.get(3).courseID.get(1) + ", " + students.get(3).courseID.get(2));
        System.out.println(students.get(4).Id + ", " + students.get(4).lastName + "         " + students.get(4).courseID.get(0) + 
                        ", " + students.get(4).courseID.get(1) + ", " + students.get(4).courseID.get(2));
        System.out.println(students.get(5).Id + ", " + students.get(5).lastName + "         " + students.get(5).courseID.get(0) + 
                        ", " + students.get(5).courseID.get(1) + ", " + students.get(5).courseID.get(2));
        System.out.println(students.get(6).Id + ", " + students.get(6).lastName + "        " + students.get(6).courseID.get(0) + 
                        ", " + students.get(6).courseID.get(1) + ", " + students.get(6).courseID.get(2));
        System.out.println(students.get(7).Id + ", " + students.get(7).lastName + "     " + students.get(7).courseID.get(0) + 
                        ", " + students.get(7).courseID.get(1) + ", " + students.get(7).courseID.get(2));
        System.out.println(students.get(8).Id + ", " + students.get(8).lastName + "       " + students.get(8).courseID.get(0) + 
                        ", " + students.get(8).courseID.get(1) + ", " + students.get(8).courseID.get(2));
        System.out.println(students.get(9).Id + ", " + students.get(9).lastName + "        " + students.get(9).courseID.get(0) + 
                        ", " + students.get(9).courseID.get(1) + ", " + students.get(9).courseID.get(2));
        }
       
    }
    

