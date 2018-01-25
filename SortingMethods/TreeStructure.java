
package p1a2;


public class P2 {
 private Node first;
 
 public P2(){
     this.first = null;
 }
 private class Node<Object>{
    Node(){
        this(null, null);
    }
    Node(Object d){
        this(d, null);
    }
    Node(Object d, Node n){
        data = d;
        next = n;
    }
    
    Object data;
    Node next;
 }
    
    
   
    public int size(){
      Node p = first;
      int count = 0;
      while(p!=null){
          count++;
          p = p.next;
      }
      return count;
    }
    
    public void print(){
        Node p = first;
        while(p!=null){
            System.out.print(p.data);
            p = p.next;
        }
    }
    
    public boolean contains(Object x){
       Node p = first;
       while(p!=null){
           if(p.data==x){
               return true;
           }
          p = p.next;
          
       }
       return false;
    }
    
    public boolean add(Object x){
        if(!contains(x)){
            Node q = new Node(x,first);
            first = q;
            return true;
        }
        
            return false;
    }
    
    public boolean remove(Object x){
        if(contains(x)){
            Node p = first;
            if(p.next.data == x){
                p.next = p.next.next;  
                return true;
            }
        }
            return false;
        
    }
    
    
    
 } 
