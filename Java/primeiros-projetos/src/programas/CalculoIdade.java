package programas;

import java.util.Scanner;

public class CalculoIdade {

	public static void main(String[] args) {
		
		int valor1, valor2, soma;
		
		Scanner leia = new Scanner(System.in); 				// Instanciando (criando) um objeto teclado, para inserir valores.
															// Depois disso, adicionar a biblioteca java.util
		
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = leia.nextInt();
		System.out.println("Digite o primeiro valor: ");
		valor2 = leia.nextInt();
		
		// Processamento
		soma = valor1 + valor2; 
		
		
		
	}

}
