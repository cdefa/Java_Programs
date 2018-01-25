
/*********************************************************************
 Purpose/Description:  The following solution has the linear complexity using BigInteger numbers 
in order to print very long numbers without causing an undesired overflow however a subLinear 
couldn't be found but using a fibbonnacci solution.
 Author’s Panther ID: 6050200
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 The complexity of the algorithm is defined by the size of the sample, meaning
that it will have a linear complexity, Big O’h =(n).
 ********************************************************************/  





package p3;

import java.math.BigInteger;
public class P3 {

  static BigInteger findLucas(int n)
{

    int a = 2;
    int b = 1;
    int c;
    int i;
    
    if (n == 0)
      return BigInteger.valueOf(a);
 
    
    for (i = 2; i <= n; i++)
    {
        c = a + b;
        a = b;
        b = c;
    }
    return BigInteger.valueOf(b);
}
	public static void main(String[] args) {
		int n = 9;
		System.out.print(findLucas(n)+"\n");
	}
        
}