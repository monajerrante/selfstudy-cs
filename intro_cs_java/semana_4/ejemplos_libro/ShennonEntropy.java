public class ShennonEntropy {
    public static void main(String[] args) {
		int m = (Integer.parseInt(args[0]) + 1);
		int[] arr = new int[m];
		
	    while (!StdIn.isEmpty()) {
		    arr[StdIn.readInt()]++;  
	    }
	    
	    for (int i = 1; i <= m; i++) {
			StdOut.printf("%d ", arr[i]);
		}
		StdOut.println(); 
    }
}
