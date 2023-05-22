/********************************************************************
 * Libro: CS: An Introduction Approach
 * Listado 1.4.1
 * 
 * m ->      розмір вибірки 
 *           // tamaño de la muestra
 * n ->      діапозон                           
 *           // rango
 * perm[] -> перестановка діапазону від 0 до 10
 *           // permutación del rango de 0 a n-1
 **********************************************************************/
 public class Sample {
     public static void main(String[] args) {
         // Salida de una muestra aleatoria de n enteros
         // de 0 a n-1 (sin repeticiones)
         int m = Integer.parseInt(args[0]);
         int n = Integer.parseInt(args[1]);
         int[] perm = new int[n];

         // Inicializacion perm[]
         for (int j = 0; j < n; j++)
             perm[j] = j;
             
         for (int i = 0; i < n; i++)
             System.out.print(perm[i]);
         System.out.println();

         // Obteniendo la muestra
         for (int i = 0; i < m; i++) {
             // perm[i] cambia de lugar con un elemento aleatorio
             int r = i + (int)(Math.random()*(n-i));
             int t= perm[r];
             perm[r] = perm[i];
             perm[i] = t;
         }

         // Imprimir la muestra
         for (int i = 0; i < m; i++) {
             System.out.print( perm[i] + " ");
         }
         System.out.println();
         
         for (int i = 0; i < n; i++)
             System.out.print(perm[i]);
         System.out.println();
     }
}
