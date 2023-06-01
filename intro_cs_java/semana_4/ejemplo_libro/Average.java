/************************************************************************
 * Average.java
 * 
 * Listado 1.5.3. Cálculo de la media aritmética de un flujo numérico
 *
 *    El programa lee de la entrada estándar la secuencia
 *    de números flotantes , calcula la media aritmética
 *    de x y la imprime en la salida estándar
 *    (suponiendo que la suma no cause desbordamiento). 
 * 
 *    La medida del flujo de entrada es ilimitada. A la derecha
 *    de la parte inferior están los comandos que uso mecanismo
 *    de redirección y canales (ver la siguiente subsección)
 *    para la transmisión y el programa alrededor de 100 000 números.
 * 
 *    % java RandomSeq 1000000 > data.txt
 *    % java Average < data.txt
 * 
 *    % java RandomSeq 1000000 | java Average
 * 
 *************************************************************************/

public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int n = 0;
        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            sum += value;
            n++;
        }
        double average = sum / n;
        StdOut.println("Average is " + average);
    }
}

