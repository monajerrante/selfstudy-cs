/********************************************************
 * HarmonicNumber.java
 * 
 * Listado 1.3.5
 * 
 * Descripción:
 *   El programa toma un argumento entero n en la línea
 *   de comando y calcula el valor del número armónico n-ésimo.
 *   Del análisis matemático se sabe que este valor es
 *   aproximadamente igual a ln(n) + 0.57721 para números grandes.
 * 
 *   Por ejemplo,     ln(1000000) + 0.57721 = 14.39272  
 * 
 *********************************************************/

public class HarmonicNumber {
    
    public static void main(String[] argv) {
        // Calcula el valor del número armónico n-ésimo.
        int n = Integer.parseInt(argv[0]);
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        System.out.println(sum);
            
    }
}
