/******************************************************************
 * HelloWorld.java
 * Problem Set 1.
 * Problem 1. Strings and command-line arguments.
 *   Write a program HelloGoodbye.java that takes two names
 *   as command-line arguments and prints hello and goodbye
 *   messages as shown below (with the names for the hello
 *   message in the same order as the command-line arguments
 *   and with the names for the goodbye message in reverse
 *   order).
 *   
 *   ~/Desktop/hello> javac HelloGoodbye.java
 *   ~/Desktop/hello> java HelloGoodbye Kevin Bob
 *    Hello Kevin and Bob.
 *    Goodbye Bob and Kevin.
 *   ~/Desktop/hello> java HelloGoodbye Alejandra Bahati
 *    Hello Alejandra and Bahati.
 *    Goodbye Bahati and Alejandra.
 * 
 ******************************************************************/
 
public class HelloGoodbye{
    public static void main(String[] argv){
        System.out.println("Hello " + argv[0] + " and " + argv[1]);
        System.out.println("Goodbye " + argv[1] + " and " + argv[0]);
    }
}
