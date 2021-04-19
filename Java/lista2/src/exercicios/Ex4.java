package exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		// Sistema que lê um número inteiro e mostra uma mensagem indicando a paridade do número e se é positivo ou negativo.
		
		
		int n1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		n1 = leia.nextInt();
		
		if (n1 < 0) {
			System.out.println("\nO número " + n1 + " é negativo, portanto, não possui paridade");
		} else if (n1 == 0) {
			System.out.println("\nHá divergências a respeito da paridade do número 0. Por favor, escolha outro número.");
		} else {
			if (n1 % 2 == 0) {
				System.out.println("\nO número " + n1 + " é positivo e par.");
			} else {
				System.out.println("\nO número " + n1 + " é positivo e ímpar.");
			}
		}
	}
}
