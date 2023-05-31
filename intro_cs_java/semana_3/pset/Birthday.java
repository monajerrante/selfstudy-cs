/****************************************************************
 * Birthday.java
 * 
 * Course: Computer Science: Programming with a Purpose
 * Book  : CS: An Interdisciplinary Approach
 * 
 * Tarea de programacion: 03 Birthday problem.
 * Supongamos que las personas entran en una habitación de una en una.
 * ¿Cómo deben entrar las personas hasta que dos comparten un cumpleaños?
 * Contrariamente a la intuición, después de que 23 personas ingresan
 * a la habitación, hay aproximadamente una probabilidad de 50 a 50
 * de que dos compartan un cumpleaños. Este fenómeno se conoce como
 * el problema del cumpleaños o la paradoja del cumpleaños.
 * 
 * Escriba un programa Birthday.java que tome dos argumentos de línea
 * de comandos enteros $n y $trails y realice lo siguiente experimento,
 * tiempos de prueba:
 * 
 *   -> Elija un cumpleaños para la siguiente persona, uniformemente
 *      al azar entre 0 y n − 1.
 *   -> Haga que esa persona entre en la habitación.
 *   -> Si esa persona comparte un cumpleaños con otra persona en el
 *      habitación, parada; en caso contrario repetir.
 * 
 * En cada experimento, cuente la cantidad de personas que ingresan
 * a la habitación. Imprima una tabla que resuma los resultados
 * (el conteo i, la cantidad de veces que exactamente i personas
 * ingresan a la habitación y la fracción de veces que i o menos
 * personas ingresan a la habitación) para cada valor posible de i
 * desde 1 hasta que la fracción alcance (o supera) el 50%.
 * 
 * El problema del cumpleaños surge en muchas informáticas
 * aplicaciones, incluidos hashing, ataques criptográficos y
 * probar generadores de números aleatorios.
 ***************************************************************/

public class Birthday {
    public static void main(String[] argv) {
        // tome dos argumentos de línea de comandos 
        int n = Integer.parseInt(argv[0]);
        int trails = Integer.parseInt(argv[1]);
        
        // declaración y definición de variables
        double goodluck = 0.0;     // el número de coincidencias
                               // de todos los cumpleaños
        int good = 0;          // el número de coincidencias
                               // de cumpleaños en un intento
        
        boolean[] birthdays = new boolean[n]; // Si, matriz de cumpleaños
        double fraction = 0;   // el fracción
        int peoples = 1;       // estoy empezando con una persona
        int birthday = 0;      // el cumpleaño
        
        // bueno, vamos, hasta que la fracción sea menor a 0.5
        while (fraction < 0.5) {
            // ejecuta $trials intentos
			// (¿O hacer? ¿Cuál es la mejor manera de decir?)
		    for (int i = 0; i < trails; i++) {
				// restablecer cumpleaños
			    for (int a = 0; a < birthdays.length; a++) {
				    birthdays[a] = false;
				}
				
				for (int j = 1; j <= peoples; j++) {
				    birthday = (int) (Math.random() * n);
				    
				    if (birthdays[birthday]) { 
						good++;
						break;
					} else {
						birthdays[birthday] = true;
					}
				}
			} // // Entonces, completó la ejecución
			// Veamos qué pasa
			goodluck += good;
			
			fraction = goodluck/trails;
			
			System.out.println(peoples + " " + good + " " + fraction + " ");
			good = 0;
			peoples++;
			
		}
    }
}

