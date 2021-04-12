package testes;

public class Erros {

	public static void main(String[] args) {
		String frase = null;
		String novaFrase = null;
		
		try {										// Testa poss�veis erros
			novaFrase = frase.toUpperCase();
		} catch(NullPointerException e) {			// Captura e trata poss�veis erros
			System.out.println("A frase inicial � nula. Para solucionar o problema, foi-lhe atribu�do um valor default.");
			frase = "Frase vazia.";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.printf("\nFrase antiga: %s" , frase);
		System.out.printf("\nFrase nova: %s" , novaFrase);
	}
}
