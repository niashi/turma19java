package exercicios;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		// Sistema que l� 4 n�meros, calcula o quadrado de cada um e, se o quadrado do terceiro
		// for >= 1000, o imprime e finaliza o programa. Caso contr�rio, imprime os valores lidos e seus respectivos
		// quadrados.
		

		double n1, n2, n3, n4, n1Quadrado, n2Quadrado, n3Quadrado, n4Quadrado;

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Insira o primeiro n�mero: ");
		n1 = leia.nextDouble();
		System.out.print("Insira o segundo n�mero: ");
		n2 = leia.nextDouble();
		System.out.print("Insira o terceiro n�mero: ");
		n3 = leia.nextDouble();
		System.out.print("Insira o quarto n�mero: ");
		n4 = leia.nextDouble();

		n1Quadrado = n1 * n1;
		n2Quadrado = Math.pow(n2, 2);
		n3Quadrado = Math.pow(n3, 2);
		n4Quadrado = Math.pow(n4, 2);

		if (n3Quadrado >= 1000) {
			System.out.println("\nO quadrado do terceiro n�mero � " + n3Quadrado + ".\n");			
		} else {
			System.out.print("\nO primeiro n�mero � " + n1 + " e seu quadrado � " + n1Quadrado + ".\n");
			System.out.print("O segundo n�mero � " + n2 + " e seu quadrado � " + n2Quadrado + ".\n");
			System.out.print("O terceiro n�mero � " + n3 + " e seu quadrado � " + n3Quadrado + ".\n");
			System.out.print("O quarto n�mero � " + n4 + " e seu quadrado � " + n4Quadrado + ".\n");
		}
	}
}
