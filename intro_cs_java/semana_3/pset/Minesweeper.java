/****************************************************************
 * Minesweeper.java
 * 
 * Course: Computer Science: Programming with a Purpose
 * Book  : CS: An Interdisciplinary Approach
 * 
 * Tarea de programacion: 04 Minesweeper (Buscaminas).
 * 
 *   Buscaminas es un videojuego de la década de 1960 que se juega
 *   en una cuadrícula de celdas m-by-n. El objetivo es deducir
 *   qué celdas contienen minas ocultas usando pistas sobre el número
 *   de minas en las celdas vecinas.
 *   
 *   Escriba un programa Minesweeper.java que tome tres argumentos
 *   de línea de comandos enteros m, n y k e imprima una cuadrícula
 *   m-por-n de celdas con k minas, usando asteriscos para las minas
 *   y números enteros para los conteos de minas vecinas
 *   (con dos espacios caracteres entre cada celda). Para hacerlo,
 *        - Genere una cuadrícula de celdas m por n, con exactamente k
 *          de las mn celdas que contienen minas, uniformemente al azar.
 *        - Para cada celda que no contenga una mina, cuente el número
 *          de minas vecinas (arriba, abajo, izquierda, derecha o diagonal).
 * 
 * ~/Desktop/arrays> java Minesweeper 9 9 10
 *   0  1  *  1  0  0  0  1  *  
 *   1  3  2  2  0  0  0  1  1  
 *   *  2  *  1  0  0  1  1  1  
 *   1  2  2  2  1  0  1  *  1  
 *   0  1  2  *  1  0  1  1  1  
 *   1  2  *  3  3  1  1  0  0  
 *   1  *  3  *  2  *  1  0  0  
 *   1  1  2  1  2  1  1  0  0  
 *   0  0  0  0  0  0  0  0  0 
 * 
 ***************************************************************/

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);  // El tamaño de la matriz
        int n = Integer.parseInt(args[1]);
        int[][] minefields = new int[m][n]; // Crea la matriz
        
        int mines = Integer.parseInt(args[2]); // Numero de las minas
        
        int x = 0; // los variables temporales
        int y = 0;
        
        // estableser elementos de matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
				minefields[i][j] = 0;
			}
		}
		
		// estableser las minas
		int temp = 0;
        while (temp < mines) {
			x = (int) (Math.random() * m);
			y = (int) (Math.random() * n);
			if (minefields[x][y] == 0) {
				minefields[x][y] = 100;
				temp++;
			}
		}
		
		// estableser numeros 
		for (int i = 0; i < m; i++) {
		    for (int j = 0; j < n; j++) {
		        if (minefields[i][j] == 0) {
		            for (int grad = 0; grad < 360; grad += 45) {
				        x = (int) Math.round(Math.sin(Math.toRadians(grad)));
				        y = (int) Math.round(Math.cos(Math.toRadians(grad)));
			            if ((((i - x) >= 0) && ((i - x) < m))
				                    && (((j + y) >= 0) && ((j + y) < n))) {
					        if (minefields[i - x][j + y] == 100) {
					            minefields[i][j] += 1;
					        }
					    }						 
			        }
		        }
	        }
	    }	
        
        
        // Imprimir matriz
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (minefields[i][j] == 100)
				    System.out.print("*  ");
				else System.out.print(minefields[i][j] + "  ");
			}
			System.out.println();
		}
        
    }
}

