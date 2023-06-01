/*******************************************************************
 * triangle.java
 * 
 * Como helo World
 *******************************************************************/
public class Triangle {
    public static void main(String[] args) {
        // Salida de una serie aleatoria de valores reales en un rango [0, 1)
	    double t = Math.sqrt(3.0)/2.0;
        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, 0.5, t);
        StdDraw.line(0.5, t, 0.0, 0.0);
        StdDraw.point(0.5, t/3.0);
    }
}

        
