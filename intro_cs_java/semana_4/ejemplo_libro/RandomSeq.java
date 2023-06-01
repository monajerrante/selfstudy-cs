/*******************************************************************
 * RandomSeq.java
 * 
 * Listado 1.5.1. Generación de secuencias aleatorias
 * 
 * El programa demuestra el modelo tradicional que usamos
 * anteriormente en el pro gramática en Java. Toma un argumento
 * de línea de comando n y genera n caso números del 0,0 al 1,0.
 * Desde el punto de vista del programa, la longitud de los datos
 * de entrada es ilimitada.
 * 
 * % java RandoSeq.java 1000 | sort
 *******************************************************************/
public class RandomSeq {
    public static void main(String[] args) {
        // Salida de una serie aleatoria de valores reales en un rango [0, 1)
	int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++)
	    System.out.println(Math.random());
    }
}

        
