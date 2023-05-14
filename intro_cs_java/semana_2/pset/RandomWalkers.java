/****************************************************************
 * RandomWalkers.java
 * 
 * Course: Computer Science: Programming with a Purpose
 * 
 * Tarea de programacion: 04 Random walkers.
 *   Write a program RandomWalkers.java that takes
 *   two integer command-line arguments r and trials. In each of
 *   trials independent experiments, simulate a random walk until
 *   the random walker is at Manhattan distance r from the starting
 *   point. Print the average number of steps.
 * 
 *      ~/Desktop/loops> java RandomWalkers 5 1000000
 *      average number of steps = 14.98188
        ~/Desktop/loops> java RandomWalkers 5 1000000
        average number of steps = 14.93918
        ~/Desktop/loops> java RandomWalkers 10 100000
        average number of steps = 59.37386
        ~/Desktop/loops> java RandomWalkers 20 100000
        average number of steps = 235.6288
        ~/Desktop/loops> java RandomWalkers 40 100000
        average number of steps = 949.14712
        ~/Desktop/loops> java RandomWalkers 80 100000
        average number of steps = 3775.7152
        ~/Desktop/loops> java RandomWalkers 160 100000
        average number of steps = 15113.61108
 *  As r increases, we expect the random walker to take more and
 *  more steps. But how many more steps? Use RandomWalkers.java to
 *  formulate a hypothesis as to how the average number of steps
 *  grows as a function of r.
 * 
 *  Estimating an unknown quantity by generating random samples
 *  and aggregating the results is an example of Monte Carlo
 *  simulation—a powerful computational technique that is used
 *  widely in statistical physics, computational finance, and
 *  computer graphics.
 ***************************************************************/

public class RandomWalkers {
    public static void main( String[] argv ){
        int r = Integer.parseInt(argv[0]);
        int trials = Integer.parseInt(argv[1]); //intensos
        int steps = 0;   
        
        for (int i = 0; i < trials; i++) {     
            // empiezar experimento
            int x     = 0;
            int y     = 0;
            int dist  = 0;
            
            
            while ( dist != r ) {
                // choose direction (elige la direccion)
                int direction = (int)(Math.random()*4);
                
                if (direction == 0)      y += 1; // goes north (va a la norte)
                else if (direction == 1) y -= 1; // goes south (va a la sur)
                else if (direction == 2) x += 1; // goes east  (va a la este)
                else                     x -= 1; // goes west  (va la oeste)
              
                dist = Math.abs(x)+Math.abs(y);
                steps += 1;                      //Si, soy pitonista    
                
            }
        }
        
        System.out.println("average number of steps = " + ((double)steps/trials));
    }
}
