/********************************************************
 * Sqrt.java
 * 
 * Listado 1.3.6
 * 
 * Descripción:
 *   El programa acepta un número de punto flotante n
 *   como argumento en la línea de comando y calcula
 *   la raíz cuadrada con una precisión de hasta 15 dígitos
 *   según el método de Newton.
 * 
 *********************************************************/

public class Sqrt {
    
    // c -> es argumento
    // EPSILON -> es error
    // t -> una precicion de valores de raiz cuadrada de c
    
    public static void main(String[] args) {
        
        double c = Double.parseDouble(args[0]);
        double EPSILON = 1e-15;
        double t = c;
        
        while (Math.abs(t - c/t) > EPSILON * t) {
            // Reemplazando t con la media aritmética de t y c/t
            t = (c/t + t)/2.0;
        }
        System.out.println(t);
    }
}
