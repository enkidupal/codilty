// you can also use imports, for example:
 import java.math.*;


// you can use System.out.println for debugging purposes, e.g.

// System.out.println("this is a debug message");


class Solution {
    
	public int solution(int X, int Y, int D) {
        
	// write your code in Java SE 8
        
	return (int)  Math.ceil( (Y - X) / (1.0*D) ) ;
    
	}

}