/****************************************************************
 * GeneralizedHarmonic.java
 * 
 * Course: Computer Science: Programming with a Purpose
 * 
 * Tarea de programacion: 01
 *     Program takes two integer command-line arguments n and r
 *     and uses a for loop to compute the n-th generalized harmonic
 *     number of order r, which is defined by the following formula:
 * 
 *       H(n, r) = (1/1**r) + (1/2**r) + ... + (1/n**r)
 * 
 *     For example, H(3, 2) = (1/1**2) + (1/2**2) + (1/3**2) = 49/36
 * 
 *     ~/Desktop/loops> java GeneralizedHarmonic 1 1
 *     1.0
 *     ~/Desktop/loops> java GeneralizedHarmonic 2 1
 *     1.5
 *     ~/Desktop/loops> java GeneralizedHarmonic 3 1
 *     1.8333333333333333
 *     ~/Desktop/loops> java GeneralizedHarmonic 3 2
 *     1.3611111111111112
 * 
 *     Note: you may assume that n is a positive integer.
 *           The generalized harmonic numbers are closely
 *           related to the Riemann zeta function, which
 *           plays a central role in number theory.
 ***************************************************************/

public class GeneralizedHarmonic{
    public static void main( String[] argv ){
        int n = Integer.parseInt(argv[0]);
        int r = Integer.parseInt(argv[1]);
        double harmonicNumber = 0.0;
        
        for (int i = 1; i <= n; i++){
            harmonicNumber += 1/Math.pow(i,r);
        }
        
        System.out.println(harmonicNumber);
    }
}
