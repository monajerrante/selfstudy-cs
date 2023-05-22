/****************************************************************
 * EuclidDistance.java
 * 
 * Course: Computer Science: Programming with a Purpose
 * Book  : CS: An Interdisciplinary Approach
 * 
 * Tarea de programacion: 1.4.3 
 *   Dados dos vectores de longitud n, representados
 *   por matrices unidimensionales, escriba un código
 *   para calcular la distancia euclidiana entre ellos
 *   (la raíz cuadrada de la suma de las diferencias
 *    al cuadrado entre los elementos correspondientes).
 * 
 *   ¿Lo entendiste?  Déjame explicarte en Python:
 *   
 *       distancia = ((x2 - x1)**2 + (y2-y1)**2 )**0.5
 * 
 *   (¡Estoy seguro de que sabes que 4**0.5 es igual a sqrt(4)!
 ***************************************************************/

public class EuclidDistance {
    public static void main( String[] args ){
        if (args.length != 4) {
            System.out.println("Use: $ java EuclidDistance x1 y1 x2 y2");
            System.exit(1);
        }

        // El bloque iniciando variables
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        
        System.out.println(" Distancia euclidiana entre puntos ("
                    + x1 + ", " + x2 +") y (" + y1 + ", " + y2 + ") es "
                    + Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
        }   
}

// NOTA. Esta tarea se puede resolver de manera más fácil y rápida
//       usando Python. (Sí, sé un poco de Python)
//       Pero estoy aprendiendo Java por mi cuenta, y como todos saben,
//       es mejor empezar poco a poco. Pero... Quiero darme prisa !!!
// x1, y1, x2, y2 = (int(input()) for _ in range(4))
// print("Distancia euclidiana entre dos puntos \
// ({0}, {1}) y ({2}, {3}) es {4}".format(x1, y1, x2, y2,
//                                      ((x2-x1)**2 + (y2-y1)**2)**0.5))
