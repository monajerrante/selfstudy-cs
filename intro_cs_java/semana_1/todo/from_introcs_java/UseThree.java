/******************************************************************************
 *  UseThree.java
 *  
 *  Exercise:
 *      Book: CS: An Interdisciplinary Approach
 *       
 *  Takes 3 command-line arguments and prints them in reverse order
 *  in a friendly greeting.
 *
 *  % java UseThree Alice Bob Carol
 *  Hi, Carol, Bob, and Alice.
 *
 *  % java UseThree Carol Bob Alice
 *  Hi, Alice, Bob, and Carol.
 *
 *  Compilation:  javac UseThree.java
 *  Execution:    java UseThree name1 name2 name3
 *  
 *  Copyright © 2000–2017, Robert Sedgewick and Kevin Wayne.
 *  Last updated: Fri Oct 20 14:12:12 EDT 2017. 
 ******************************************************************************/

public class UseThree {

    public static void main(String[] args) {
        // TODO: como puedo coger exepciones
        System.out.print("Hi, ");
        System.out.print(args[2]);
        System.out.print(", ");
        System.out.print(args[1]);
        System.out.print(", and ");
        System.out.print(args[0]);
        System.out.println(".");
    }

}



