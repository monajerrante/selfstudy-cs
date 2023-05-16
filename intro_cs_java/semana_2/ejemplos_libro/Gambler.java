/******************************************************************
 * Listado 1.3.8 
 * Libro "CS: An Interpolation Approuch"
 * ****************************************************************/
 
public class Gambler {
	public static void main( String[] args) {
		// Realización de $trials experimentos que comienzan
		// con la suma original y terminan con el resultado $0 o $goal.
		// $stake es la suma original
		// $goal es la cantidad deseada
		// $bets es numero de apuestos
		// $wins es numero de victorias 
		// $cash es la suma actual
		int stake = Integer.parseInt(args[0]);
		int goal = Integer.parseInt(args[1]);
		int trials = Integer.parseInt(args[2]);
		
		int bets = 0;
		int wins 0;
		
		for (int t = 0; t < trials; t++) {
			// Realiza un experencia
			int cash = stake;
			while (cash > 0 && cash < goal) {
			    // Modelar una apuesta
			    bets++;
			   if (Math.random() < 0.5) cash++;
			   else                     cash--;
		    } //La suma llega 0 (ruina) o $goal (la victoria)
		    if (cash == goals) wins++;
	    }
	    System.out.println(100*wins/trials + "% wins");
	    System.out.println("Avg # bets: " + bets/trials);
	}
}
