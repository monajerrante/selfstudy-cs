/********************************************************
 * DivisiorPattern.java
 * 
 * //Esta es mi solución: el original está en el archivo
 *                        DivisionPatternOriginal.java
 *                  Desculpe, original no tiene diferentes
 * Descripción:
 *   El programa toma un argumento entero n en la línea
 *   de comando y usa bucles for anidados para imprimir
 *   una tabla n*n en la que la intersección de la fila i
 *   y la columna j está marcada con un asterisco si
 *   i es divisible por j o j es divisible por i.
 *   Las variables de bucle i y j controlan la ejecución.
 * 
 *********************************************************/

public class DivisiorPattern {
    public static void main(String[] argv) {
        int n = Integer.parseInt(argv[0]);
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ( (j % i == 0) || (i % j == 0) ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" | " + i);
        }
    }
}
