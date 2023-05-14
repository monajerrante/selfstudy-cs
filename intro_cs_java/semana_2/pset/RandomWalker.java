/****************************************************************
 * RandomWalker.java
 * 
 * Course: Computer Science: Programming with a Purpose
 * 
 * Tarea de programacion: 03 Random walk. 
 *     A Java programmer begins walking aimlessly. At each time step,
 *     she takes one step in a random direction (either, north, east,
 *     south, or west), each with probability 25%. She stops once she
 *     is at Manhattan distance r from the starting point. How many
 *     steps will the random walker take?
 *     
 *     This process is known as a two-dimensional random walk.
 *  
 *     Write a program RandomWalker.java that takes an integer
 *     command-line argument r and simulates the motion of a random
 *     walk until the random walker is at Manhattan distance r from
 *     the starting point. Print the coordinates at each step of the
 *     walk (including the starting and ending points), treating the
 *     starting point as (0,0). Also, print the total number of steps
 *     taken.
 * 
 *     ~/Desktop/loops> java RandomWalker 5
 *      (0, 0)
 *      (0, 1)
        (1, 1)
        (1, 2)
        (1, 3)
        (0, 3)
        (-1, 3)
        (-1, 2)
        (-2, 2)
        (-2, 1)
        (-1, 1)
        (-1, 0)
        (-2, 0)
        (-2, -1)
        (-3, -1)
        (-3, -2)
        steps = 15
 *     This process is a discrete version of a natural phenomenon
 *     known as Brownian motion. It serves as a scientific model
 *     for an astonishing range of physical processes from the
 *     dispersion of ink flowing in water, to the formation of polymer
 *     chains in chemistry, to cascades of neurons firing in the brain.
 ***************************************************************/

public class RandomWalker {
    public static void main( String[] argv ){
        int r = Integer.parseInt(argv[0]);
        
        int x     = 0;
        int y     = 0;
        int dist  = 0;
        int steps = 0;
        
        System.out.println("(" + x + ", " + y + ")");
        
        while ( dist != r ) {
            // choose direction (elige la direccion)
            int direction = (int)(Math.random()*4);
            
            if (direction == 0)      y += 1; // goes north (va a la norte)
            else if (direction == 1) y -= 1; // goes south (va a la sur)
            else if (direction == 2) x += 1; // goes east  (va a la este)
            else                     x -= 1; // goes west  (va la oeste)
          
            dist = Math.abs(x)+Math.abs(y);
            steps += 1;                      //Si, soy pitonista    
            
            System.out.println("(" + x + ", " + y + ")");
        }
        
        System.out.println("steps = " + steps);
    }
}
