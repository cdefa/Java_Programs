
package p1a2;
import java.util.*;

/*********************************************************************
 Purpose/Description:
 * P1: makes a ternary search on a array of integers to determine the position of the number on a sorted array
 *      Time complexity = log3(n)
 * P2: linked list implementation of methods to add,remove,search for an element, print and get size
 * P3: Sorting of a Stack of integers in ascending order
 *      Time complexity = (N^2)
 * P4: Finds the element most repeated on a array of integers and returns the index of the element on the array
 * 
 * Credentials:
 * Author’s Panther ID: 6050200
 * Author's Name: Carlos De Faria
 * Certification:
 * I hereby certify that this work is my own and none of it is the work of
 * any other person.
 ********************************************************************/ 
public class tester {

    public static void main(String[] args) {
    
     //P1
     int[] arr = {1,2,3,4,5,6,7,8,9,10};
     P1 array = new P1();
     System.out.print("P1: \n Number found at position: " + array.terSearch(arr, 0, arr.length-1, 6) + "\n");
     
     //P2
     P2 p2 = new P2(); P2 p20 = new P2(); P2 p200 = new P2(); P2 p2000 = new P2();
     p2.add(p20); p2.add(p200); p2.add(p2000);
     System.out.print("P2: \n Objects: ");
     p2.print();
     System.out.println("\n Size: " + p2.size());
     System.out.println(" Contains: "+ p2.contains(p2000));
     p2.remove(200);
     
     //P3
     
     P3 p3 = new P3();
     Stack <Integer> s1 = new Stack<>();
     s1.push(2); s1.push(19); s1.push(11); s1.push(6); s1.push(50);
     System.out.print("P3: \n Sorted Stack: ");
     p3.printStack(p3.stackSort(s1));
     System.out.print("\n");
     
    
    
    
    //P4 
    P4 A = new P4();
    int [] a = {3,2,1,1,2,6,7,7,2,2};
    System.out.println("P4: \n Index of the most repeated element on the array: " + A.leader(a) + "\n");
    
    
    }
    
}
