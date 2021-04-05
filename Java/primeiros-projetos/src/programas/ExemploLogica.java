package programas;

import java.util.Locale;
import java.util.Scanner;

public class ExemploLogica {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero; 		// N�mero inteiro.	
		String nome;		// Cadeia de caracteres.
		boolean vivo;		// Verdadeiro ou falso [True/False].
		char escolha; 		// Caractere �nico.
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		parImpar(numero);
		System.out.println("Fim de programa.");
	}
	
	public static void parImpar(int numero) {			// Fun��o que analisa a paridade (Subfun��o).
		if ((numero % 2) == 0 && numero > 0) {
			System.out.println("\nO n�mero � par.");
			escreveLinha();
		} else if ((numero % 2) != 0 && numero > 0) {
			System.out.println("\nO n�mero � �mpar.");
			escreveLinha();
		} else if (numero == 0) {
			System.out.println("\nH� diverg�ncias quanto � paridade do n�mero zero. Por favor, insira outro valor.");
			escreveLinha();
		} else {
			System.out.println("\nPor favor, insira um n�mero positivo.");
			escreveLinha();
		}
	}
	
	public static void escreveLinha() {
		System.out.println("------------------------------------------------");
	}
}
