package lista3;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		// Programa que l� um n�mero informado e calcula a soma de todos os n�meros de 1 at� ele.
		
		
		int x = 0, numero, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Por favor, informe um n�mero: ");
		numero = leia.nextInt();
		do {
			soma = (soma + x);
			x++;
		} while (x <= numero);
		
		System.out.printf("\nA soma � " + soma + ".");
	}
}
