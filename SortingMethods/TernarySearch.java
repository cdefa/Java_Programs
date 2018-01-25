
package p1a2;

public class P1 {
    
    
    public int terSearch(int arr[], int l, int r, int x){
         
        
        
        
         int d1 = l+(r-l)/3;
         int d2 = d1+(r-l)/3;
         
         if (l>r){
            return -1;
        }
         if(arr[d1]==x){
             return d1;
         }
         if(arr[d2]==x){
             return d2;
         }
         
         else if(x<arr[d1]){
             return terSearch(arr,l,d1-1,x);
         }
         else if(x>arr[d2]){
             return terSearch(arr,d2+1,r,x);
         }else{
            return terSearch(arr,d1+1,d2-1,x);
         }
        
    }
}
