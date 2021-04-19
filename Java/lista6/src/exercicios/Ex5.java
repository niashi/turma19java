package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		// Crie um programa que leia um número do teclado até que encontre um
		// número igual a zero. No final, mostre a soma dos números
		// digitados.(DO...WHILE)
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double numero, soma = 0;
		
		System.out.println("Digite quantos valores quiser: ");
		
		do {
			numero = leia.nextDouble();
			soma += numero;
		} while (numero != 0);
		
		System.out.printf("\nVocê digitou zero. O programa será encerrado. A soma dos números digitados até agora é %.2f." , soma);
	}
}
