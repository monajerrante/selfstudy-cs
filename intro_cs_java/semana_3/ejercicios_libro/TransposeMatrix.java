/****************************************************************
 * TransposeMatrix.java
 * 
 * Course: Computer Science: Programming with a Purpose
 * Book  : CS: An Interdisciplinary Approach
 * 
 * Tarea de programacion: 1.4.14
 *   Escriba una programa para generar el transpuesto 
 *   de una matriza bidimensional (es decir, obtenida
 *   permutando filas y columnas). Su código debe generar
 *   lo siguiente resultado:
 * 
 * 99 85 98     99 98 92 94 99 90 76 92 97 89
 * 98 57 78     85 57 77 32 34 46 59 66 71 29
 * 92 77 76     98 78 76 11 22 54 88 89 24 38
 * 94 32 11
 * 99 34 22
 * 90 46 54
 * 76 59 88
 * 92 66 89
 * 97 71 24
 * 89 29 38
 * 
 ***************************************************************/

public class TransposeMatrix {
    public static void main( String[] args ){
        
        int[][] matrix = { {99, 85, 98},
                         {98, 57, 78},
                         {92, 77, 76},
                         {94, 32, 11},
                         {99, 34, 22},
                         {90, 46, 54},
                         {76, 59, 88},
                         {92, 66, 89},
                         {97, 71, 24},
                         {89, 29, 38}
                         };
                         
        int[][] transpose = new int[matrix[0].length][matrix.length];
        
        for (int rows = 0; rows < matrix[0].length; rows++)
            for (int colm = 0; colm < matrix.length; colm++)
                transpose[rows][colm] = matrix[colm][rows];
        
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int colm = 0; colm < matrix[0].length; colm++)
               System.out.print(matrix[rows][colm] + " ");
            System.out.println();
        }
        System.out.println();
        
        for (int rows = 0; rows < transpose.length; rows++) {
            for (int colm = 0; colm < transpose[0].length; colm++)
               System.out.print(transpose[rows][colm] + " ");
            System.out.println();
        }
    }
}
