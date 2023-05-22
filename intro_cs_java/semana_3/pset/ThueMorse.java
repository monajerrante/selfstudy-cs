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
        int size = Integer.parseInt(argv[0]);  // El tamaño de la matriz
        int[][] matrice = new int[size][size]; // Crea la matriz
        
        int[] line = new int[size]; // Crea la cadena horizontal y vertical
        line[0] = 0;                // con el primer elemento puesto a cero 
        
        matrice[0][0] = 0; // No hace falta pero ¿porque no?
        
        // Genera cadena horizontal/vertical  
        int i = 1;
        int j = 0;
        
        while ( i < matrice[0].length ) {
            for ( j = 0; j < i; j++) {
                if (j+i == matrice[0].length) break;
                if (matrice[0][j] == 0) matrice[0][j+i] = 1;
                else           matrice[0][j+i] = 0;
            }
            i = i+j;
            //System.out.println(j + " " + i);
        }
        /*
        for (i = 0; i < matrice[0].length; i++) {
            System.out.print(matrice[0][i]);
        }
       */
        for (int k = 0; k < size; k++) {
            i = 1;
            while( i < size) {
                for ( j = 0; j < i; j++) {
                    if (j+i == size) break;
                    if (matrice[j][k] == 0) matrice[j+i][k] = 1;
                    else           matrice[j+i][k] = 0;
                }
                i = i+j;
            }
        }
        
        for (i = 0; i < size; i++) {
            //System.out.println("Estoy aqui");
            for (j = 0; j < size; j++)
                System.out.print(matrice[i][j]);
            System.out.println();
        }
    }
}

