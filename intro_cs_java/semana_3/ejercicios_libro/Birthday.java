/****************************************************************
 * Birthday.java
 * 
 * Course: Computer Science: Programming with a Purpose
 * Book  : CS: An Interdisciplinary Approach
 * 
 * Tarea de programacion: 1.4.38 Cumpleaños.
 *   Supongamos que las personas entran a una habitación vacía
 *   hasta que encuentran un par de personas con el mismo cumpleaños
 *   entre ellos.
 * 
 *   ¿Cuántas personas deben entrar a la habitacion
 *   para que lo ocurra ?
 * 
 *   Realice experimentos para evaluar los valores.
 * 
 *   Se supone que los cumpleaños están determinados por números
 *   enteros uniformemente distribuidos del 0 al 364.
 ***************************************************************/

public class Birthday {
    public static void main( String[] args ){
        int trials = Integer.parseInt( args[0]);
       
        for (int i = 0; i < trials; i++) {
            int[] days = new int[365];
            int day = 0;
            int personas = 0;
            while (true) {
                day = (int)(Math.random()*364);
                personas++;
                if (days[day] == 1){
                    System.out.println("El probe : " + (i+1)
                                  + "  Personas : " + personas
                                  + "  Day : " + (day++));
                    break;
                } else {
                    days[day] = days[day] + 1;
                }
            }
        }
    }
}
