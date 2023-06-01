/************************************************************************
 * TwentyQuestions.java
 * 
 * Listado 1.5.2. entrada interactiva
 *
 * El programa implementa un simple juego de adivinanzas de números.
 * El usuario ingresa números, cada uno de los cuales puede tratarse
 * como una pregunta implícita ("¿Se ha adivinado este número?") y el
 * programa informa si la suposición del usuario fue mayor o menor
 * que el número adivinado. El usuario siempre puede llegar a la respuesta
 * ("¡Tú ganas!") en menos de 20 preguntas.
 *************************************************************************/
public class TwentyQuestions {
    public static void main(String[] args) {
        // El programa genera un número y reacciona a las conjeturas,
        // mientras el usuario intenta adivinar el número,
        int secret  = 1 + (int) (Math.random() * 1000000); // numero oculto secreto
	StdOut.print("I'm thinking  of a number ");
	StdOut.println("between 1 and 1,000,000");
	int guess = 0;                                     // suposicion del usuario 

        while (guess != secret) {
            // El programa pide una conjetura y muestra la respuesta.
            StdOut.print("What's your guess ? ");
	    guess = StdIn.readInt();
	    if (guess == secret) StdOut.println("You win!");
	    if (guess < secret)  StdOut.println("Too low ");
	    if (guess > secret)  StdOut.println("Too high");
	}
    }
}

