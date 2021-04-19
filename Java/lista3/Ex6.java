package lista3;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		// Programa que lê um número informado e calcula a soma de todos os números de 1 até ele.
		
		
		int x = 0, numero, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Por favor, informe um número: ");
		numero = leia.nextInt();
		do {
			soma = (soma + x);
			x++;
		} while (x <= numero);
		
		System.out.printf("\nA soma é " + soma + ".");
	}
}
