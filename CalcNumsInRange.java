
package a3;

/**
 *Name: Carlos De Faria
 *PID: 6050200
 * I hereby certify that this work is mine and only mine 
 */
public class A3 {
    /**********
    *PROBLEM 1
    *
    *Method to calculate the numbers between the range of left and right
    ***********/
    public static int countNums(int arr[],int left, int right,int k){
        //counter for every number within the range
        int count=0;
        //loop for traversing the list in O(n)
        for (int i =0;i<arr.length;i++){
            if(i>left &&  i<right){
                count++;
            }
        }
        return count;//returning the count O(1)
    }
    
    
    
    
    public static void main(String[] args) {
         int [ ] a = {3, 8, 2, 4, 1, 9, 11, 4, 15}; //input array
        int k = 15; // max element in a
        int left = 2; // lower value in range
        int right = 9; // upper value in range 
        MinHeap h1 = new MinHeap();
        
        System.out.println("Total number in range["+left + ".." +right+"] is " + countNums(a,left,right,k));
        h1.replaceKey(42,2);

    }
    
}
