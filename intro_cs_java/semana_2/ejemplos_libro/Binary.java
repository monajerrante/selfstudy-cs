/********************************************************
 * Binary.java
 * 
 * Listado 1.3.7
 * 
 * Descripción:
 *   El programa acepta un número enterno n como argumento
 *   en la línea de comando y genera la representación
 *   binaria de n en el método de prueba de potencia de 2
 *   en orden descendente.
 * 
 *********************************************************/

public class Binary {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int power = 1;
        
        while (power <= n/2) {
            power = 2 * power;
        }
        
        while (power > 0) {
            if (n < power) { System.out.print(0); }
            else           { System.out.print(1); n = n - power;}
            power = power/2 ;
        }
        System.out.println();       
    }
}
