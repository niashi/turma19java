package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		// Crie um programa que leia um n�mero do teclado at� que encontre um
		// n�mero igual a zero. No final, mostre a soma dos n�meros
		// digitados.(DO...WHILE)
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double numero, soma = 0;
		
		System.out.println("Digite quantos valores quiser: ");
		
		do {
			numero = leia.nextDouble();
			soma += numero;
		} while (numero != 0);
		
		System.out.printf("\nVoc� digitou zero. O programa ser� encerrado. A soma dos n�meros digitados at� agora � %.2f." , soma);
	}
}
