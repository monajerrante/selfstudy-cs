/**
 * Tema: Exercises
 * Book: Computer Science:An Interdisciplinary Approach
 * Capitulo 1.2. Built-in types of data.
 * 
 * Exercise 1.2.34 Three-sort.(Tres ordenados.)
 *   [EN]   Write a program that takes three integer command-line
 *          arguments and prints them in ascending order.
 *          Use Math.min() and Math.max().
 *   [ES]  Escribe un programa que toma la línea de comando
 *         de tres enteros argumentos y los imprime en orden
 *         ascendente.
 *         Utilice Math.min() y Math.max().
 *   [RU]  Напишите программу, которая получает в аргументах
 *         командной строки три целочисленных значения и выводит
 *         их упорядоченными пo возрастанию.
 * 
 * NOTA:  For these two exercises, use only Java features that we have 
 *   introduced in this course so far (e.g,. no loops or conditionals).
 * NOTA:  Esto podemos realizar facil en Python
 *            print(*sort([a, b, c]))
 **********************************************************************/

public class ThreeNumSort{

    public static void main(String[] argv){
        // Vamos al fuerte. Largarte :)
        if (argv.length != 3){
            System.out.println("Hello, World");
            System.exit(1);
        }
        
        int a = Integer.parseInt(argv[0]);
        int b = Integer.parseInt(argv[1]);
        int c = Integer.parseInt(argv[2]);
        /* -> First version :)
         * int nmax = Math.max(a, b);
         * int nmax = Math.max(nmax, c);
         * -> Second version :0              */
        int nmax = Math.max(Math.max(a, b), c);
        
        /* -> First version :)  
         * int nmin = Math.min(a, b);
         * int nmin = Math.min(nmin, c);
         * -> Second version :0              */
        int nmin = Math.min(Math.min(a, b), c);
         
        int nmid = (a + b +c) - (nmin + nmax);

        System.out.println(nmax + " " + nmid + " " + nmin);
    }
}
