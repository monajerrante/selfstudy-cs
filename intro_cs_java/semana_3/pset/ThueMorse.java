/****************************************************************
 * ThueMorse.java
 * 
 * Course: Computer Science: Programming with a Purpose
 * Book  : CS: An Interdisciplinary Approach
 * 
 * Tarea de programacion: 02 Thue–Morse weave.
 *   Write a program ThueMorse.java that takes an integer
 *   command-line argument n and prints an n-by-n pattern
 *   like the ones below. Include two space characters between 
 *   each + and - character.
 *  
 * ~/Desktop/arrays> java ThueMorse 4
    + - - +
    - + + -
    - + + -
    + - - +

 *   The Thue–Morse sequence is an infinite sequence of 0s and 1s
 *   that is constructed by starting with 0 and successively
 *   appending the bitwise negation (interchange 0s and 1s) of the
 *   existing sequence. Here are the first few steps of this
 *   construction:
     
        0
        01
        0110
        01101001
        0110100110010110
 *   
 *   To visualize the Thue–Morse sequence, create an n-by-n pattern
 *   by printing a + (plus sign) in row i and column j if bits i and j in
 *   the sequence are equal, and a - (minus sign) if they are
 *   different.
 *   
 *   Note: you may assume that n is a positive integer (but it need
 *         not be a power of 2).
 *   
 *   The Thue–Morse sequence has many fascinating properties and
 *   arises in graphic design and in music composition.
 ***************************************************************/

public class ThueMorse {
    public static void main( String[] argv ){
        int size = Integer.parseint(argv[0]);
        int[] str = new int[size*2;
        while ( str.length < size ) {
            for (int i = 0; i < str.length; i++) {
                if (str[i] == ) {
                    str +=  
        }
        ver = gen_str(size, '0')
        for i in ver:
            print(gen_str(size, i))
        
        def gen_str(n, res):
          #res = '0'
          while len(res) < n:
            for i in res:
              if i == '0':
                res += '1'
              elif i == '1':
                res += '0'
          return res[:n]
    }
}
