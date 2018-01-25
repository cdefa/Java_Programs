
package p1a2;


public class P4 {
    
    int leader(int[] A){
       int[] temp= new int[A.length];
       temp = A;
    
         for(int i = 0;i<A.length;i++){
             A[(A[i]%A.length)] += A.length;
         }
         int max = A[0];
         int index = 0;
        
         for (int i = 1; i < A.length; i++){
        
            if (A[i] > max)
            {
                max = A[i];
                index = i;
                
            }
            
        }
         for(int i = 0;i<temp.length;i++){
             if(temp[i]==index){
                 return i;
             }
         }         
    return -1;
    }}


