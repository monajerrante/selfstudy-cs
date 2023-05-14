/****************************************************************
 * BandMatrix.java
 * 
 * Course: Computer Science: Programming with a Purpose
 * 
 * Tarea de programacion: 01 Band matrices.
 *    Write a program BandMatrix.java that takes two integer
 *    command-line arguments n and width and prints an n-by-n
 *    pattern like the ones below, with a zero (0) for each
 *    element whose distance from the main diagonal is strictly
 *    more than width, and an asterisk (*) for each entry that
 *    is not, and two  spaces between each 0 or *.
 *    Here, distance means the minimum number of cells you have
 *    to move (either left, right, up, or down) to reach any
 *    element on the main diagonal.
 *    
 *    ~/Desktop/loops> java BandMatrix 8 0
 *      * 0 0 0 0 0 0 0
 *      0 * 0 0 0 0 0 0
 *      0 0 * 0 0 0 0 0
 *      0 0 0 * 0 0 0 0
 *      0 0 0 0 * 0 0 0
 *      0 0 0 0 0 * 0 0
 *      0 0 0 0 0 0 * 0
 *      0 0 0 0 0 0 0 *
 *       
 *      ~/Desktop/loops> java BandMatrix 8 1
 *      * * 0 0 0 0 0 0
 *      * * * 0 0 0 0 0
 *      0 * * * 0 0 0 0
 *      0 0 * * * 0 0 0
 *      0 0 0 * * * 0 0
 *      0 0 0 0 * * * 0
 *      0 0 0 0 0 * * *
 *      0 0 0 0 0 0 * *
       
        ~/Desktop/loops> java BandMatrix 8 2
        * * * 0 0 0 0 0
        * * * * 0 0 0 0
        * * * * * 0 0 0
        0 * * * * * 0 0
        0 0 * * * * * 0
        0 0 0 * * * * *
        0 0 0 0 * * * *
        0 0 0 0 0 * * *
       
        ~/Desktop/loops> java BandMatrix 8 3
        * * * * 0 0 0 0
        * * * * * 0 0 0
        * * * * * * 0 0
        * * * * * * * 0
        0 * * * * * * *
        0 0 * * * * * *
        0 0 0 * * * * *
       
 *    Hint 1: Do not use arrays.
 *    Hint 2: Devise an expression that determines the distance
 *            of element (i, j) from the main diagonal. For reference,
 *            the following diagram illustrates the distance of each
 *            element in an 8-by-8 matrix. Solution to hint.
 *            Math.abs(i - j)
 * 
 * 
 *    Note: you may assume that n and width are non-negative integer.
 *      Band matrices are matrices whose nonzero entries are restricted
 *      to a diagonal band. They arise frequently in numerical
 *      linear algebra.
 ***************************************************************/

public class BandMatrix {
    public static void main( String[] argv ){
        int n = Integer.parseInt(argv[1]);  //reads the value of n from user
        int width = Integer.parseInt(argv[0]); //reads input value of width

        //the outer and inner loops to form a n by n pattern
        for (int i=0; i<width; i++) {
            for (int j=0; j<width; j++) {
                if (j==i || Math.abs(i-j) <= n) {
                    /*if the value of j become equal to the value
                     * of i OR if the difference between i and j
                     * is less than or equal to the value of width
                     * input by user then asterisks are printed
                     * in the pattern otherwise 0 is printed.
                     * This simply moves through each element of and
                     * calculates its distance from main diagonal */
                     System.out.print(" * ");  // displays asterisks when above 
                                               // if condition is true
                } else { //when the above IF condition evaluates to false
                    System.out.print(" 0 ");//displays 0 in pattern when if condition is false 
                }  
            }
            System.out.println();    
        } 
    }
}
