package testes;

public class Erros {

	public static void main(String[] args) {
		String frase = null;
		String novaFrase = null;
		
		try {										// Testa possíveis erros
			novaFrase = frase.toUpperCase();
		} catch(NullPointerException e) {			// Captura e trata possíveis erros
			System.out.println("A frase inicial é nula. Para solucionar o problema, foi-lhe atribuído um valor default.");
			frase = "Frase vazia.";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.printf("\nFrase antiga: %s" , frase);
		System.out.printf("\nFrase nova: %s" , novaFrase);
	}
}
