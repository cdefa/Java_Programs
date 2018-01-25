
package p1a2;

import java.util.*;

public class P3 {
    Stack <Integer>temp = new Stack();
    
Stack stackSort(Stack <Integer>s){
    if(!s.isEmpty()){
       int i = s.pop();
       stackSortHelper(i);
       stackSort(s);
    }
    return temp;
}
    void stackSortHelper(int i){
    if(temp.isEmpty()|| i > temp.peek()){
        temp.push(i);
        return;
    }
    int x = temp.pop();
    stackSortHelper(i);
    temp.push(x);
}
    
    
    
    void printStack(Stack <Integer> s){
        ListIterator<Integer> lt = s.listIterator();
        
        while(lt.hasNext()){
            lt.next();
        }
        while(lt.hasPrevious()){
            System.out.print(lt.previous()+" ");
        }
        
        
        
    }
}    

