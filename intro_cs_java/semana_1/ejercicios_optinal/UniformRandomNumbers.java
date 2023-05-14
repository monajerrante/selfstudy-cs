/*********************************************************************
 * Book : "Computer Science: An Interdisciplinary Approach"
 * 
 *
 * Exercise 1.2.30 Uniform random numbers.
 * [EN]  Write a program that prints five uniform random numbers
 *       between 0 and 1, their average value, and their minimum
 *       and maximum values.
 *       Use Math.random(), Math.min(), and Math.max().
 * [RU]  Случайные числа с равномерным распределением. 
 *       Напишите программу, ко­торая выводит пять случайных чисел
 *       с равномерным распределением в диапазоне от 0 до 1, 
 *       их среднее арифметическое, минимальное и максимальное значения.
 *
 * NOTA:  For these two exercises, use only Java features that we have 
 *   introduced in this course so far (e.g,. no loops or conditionals).
 **********************************************************************/

public class UniformRandomNumbers{
    public static void main(String[] argv){
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        
        double average = (a+b+c+d+e)/5.0;
        double nmin = Math.min(Math.min(Math.min(Math.min(a,b),c),d),e);
        double nmax = Math.max(Math.max(Math.max(Math.max(a,b),c),d),e);
        System.out.println("DDD: " + a + " " + b + " " + c + " " + d + " " + e);
        System.out.println("Average = " + average);
        System.out.println("Min = " + nmin);
        System.out.println("Max = " + nmax);
    }
}
