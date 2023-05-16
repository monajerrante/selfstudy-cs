/******************************************************************************
 *  UseArgument.java
 *      Below is the syntax highlighted version
 *      of UseArgument.java from §1.1 Hello World. 
 * 
 *  Compilation:  javac UseArgument.java
 *  Execution:    java UseArgument name
 *
 *  Prints "Hi, Bob. How are you?" where "Bob" is replaced by the
 *  command-line argument.
 *
 *  % java UseArgument Bob
 *  Hi, Bob. How are you?
 *
 *  % java UseArgument Alice
 *  Hi, Alice. How are you?
 *  
 *  Copyright © 2000–2022, Robert Sedgewick and Kevin Wayne.
 *  Last updated: Sat Nov 26 13:13:23 EST 2022. 
 ******************************************************************************/

 public class UseArgument {

    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[0]);
        System.out.println(". How are you?");
    }

}

/*
  TODO: y como podemos coger/tomar argumentos de linea de comando 
        en python
        import os

        os.argv
   */
