package exercicios;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		// Sistema que lê 4 números, calcula o quadrado de cada um e, se o quadrado do terceiro
		// for >= 1000, o imprime e finaliza o programa. Caso contrário, imprime os valores lidos e seus respectivos
		// quadrados.
		

		double n1, n2, n3, n4, n1Quadrado, n2Quadrado, n3Quadrado, n4Quadrado;

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		n1 = leia.nextDouble();
		System.out.print("Insira o segundo número: ");
		n2 = leia.nextDouble();
		System.out.print("Insira o terceiro número: ");
		n3 = leia.nextDouble();
		System.out.print("Insira o quarto número: ");
		n4 = leia.nextDouble();

		n1Quadrado = n1 * n1;
		n2Quadrado = Math.pow(n2, 2);
		n3Quadrado = Math.pow(n3, 2);
		n4Quadrado = Math.pow(n4, 2);

		if (n3Quadrado >= 1000) {
			System.out.println("\nO quadrado do terceiro número é " + n3Quadrado + ".\n");			
		} else {
			System.out.print("\nO primeiro número é " + n1 + " e seu quadrado é " + n1Quadrado + ".\n");
			System.out.print("O segundo número é " + n2 + " e seu quadrado é " + n2Quadrado + ".\n");
			System.out.print("O terceiro número é " + n3 + " e seu quadrado é " + n3Quadrado + ".\n");
			System.out.print("O quarto número é " + n4 + " e seu quadrado é " + n4Quadrado + ".\n");
		}
	}
}
