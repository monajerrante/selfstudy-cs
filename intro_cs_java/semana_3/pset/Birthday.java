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
    public static void main( String[] argv ){
        int size = Integer.parseint(argv[0]);
        int[] str = new int[size*2;
        while ( str.length < size ) {
            for (int i = 0; i < str.length; i++) {
                if (str[i] == ) {
                    str +=  
        }
        ver = gen_str(size, '0')
        for i in ver:
            print(gen_str(size, i))
        
        def gen_str(n, res):
          #res = '0'
          while len(res) < n:
            for i in res:
              if i == '0':
                res += '1'
              elif i == '1':
                res += '0'
          return res[:n]
    }
}

