/******************************************************************
 * Listado 1.3.9 
 * Libro "CS: An Interpolation Approuch"
 * ****************************************************************/
 
public class Factors {
	public static void main( String[] args) {
		int n = Integer.parseInt(args[0]);
		int k = 1;
		System.out.println(k);
		k = 2;
		while( k < n/2 ) {
			while( n % k == 0) {
				System.out.print( k + " ");
				n = (int)(n / k);
			}
			k++;
		}
	}
}
