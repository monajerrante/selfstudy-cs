/******************************************************************
 * RightTriangle.java
 * Problem Set 1.
 * Problem 2. Integers and booleans.
 *    Write a program RightTriangle that takes three int
 *    command-line arguments and determines whether they
 *    constitute the side lengths of some right triangle.
 *    
 *    The following two conditions are necessary and sufficient:
 *        - Each integer must be positive.
 *        - The sum of the squares of two of the integers must equal
 *          the square of the third integer.
 * 
 * ~/Desktop/hello> javac RightTriangle.java
 * ~/Desktop/hello> java RightTriangle 3 4 5
 *   true
 * ~/Desktop/hello> java RightTriangle 13 12 5
 *   true
 * ~/Desktop/hello> java RightTriangle 1 2 3
 *   false
 * ~/Desktop/hello> java RightTriangle -3 4 -5
 *   false
 ******************************************************************/
 
public class RightTriangle{
    public static void main(String[] argv){
        int a = Integer.parseInt(argv[0]);
        int b = Integer.parseInt(argv[1]);
        int c = Integer.parseInt(argv[2]);
        
        int hipt    = Math.max(Math.max(a, b), c);
        int sideOne = Math.min(Math.min(a, b), c);
        int sideTwo = (a + b + c) - (hipt + sideOne);
        
        System.out.println( ((a > 0) && (b > 0) && (c > 0))
                           && ( hipt*hipt == (sideOne*sideOne + sideTwo*sideTwo)) );
    }
}
