package programas;

import java.util.Locale;
import java.util.Scanner;

public class ExemploLogica {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero; 		// Número inteiro.	
		String nome;		// Cadeia de caracteres.
		boolean vivo;		// Verdadeiro ou falso [True/False].
		char escolha; 		// Caractere único.
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		parImpar(numero);
		System.out.println("Fim de programa.");
	}
	
	public static void parImpar(int numero) {			// Função que analisa a paridade (Subfunção).
		if ((numero % 2) == 0 && numero > 0) {
			System.out.println("\nO número é par.");
			escreveLinha();
		} else if ((numero % 2) != 0 && numero > 0) {
			System.out.println("\nO número é ímpar.");
			escreveLinha();
		} else if (numero == 0) {
			System.out.println("\nHá divergências quanto à paridade do número zero. Por favor, insira outro valor.");
			escreveLinha();
		} else {
			System.out.println("\nPor favor, insira um número positivo.");
			escreveLinha();
		}
	}
	
	public static void escreveLinha() {
		System.out.println("------------------------------------------------");
	}
}
