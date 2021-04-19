package exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		// Programa que permite a entrada de um número qualquer e exibe se este
		// número é par ou ímpar. Se for par, exibe também a raiz quadrada dele; se for
		// ímpar, exibe o número elevado ao quadrado. 
		
		
		Scanner leia = new Scanner(System.in);
		
		int numero, quadrado;
		double raizQuadrada; 
		
		System.out.print("Por favor, insira um número inteiro e positivo: ");
		numero = leia.nextInt();
		
		if (numero < 0) {
			System.out.println("\nPor favor, insira um valor positivo.");
		} else if (numero == 0) {
			System.out.println("\nHá divergências quanto à paridade no número zero. Por favor, insira outro valor.");
		} else {
			if (numero % 2 == 0) {
			raizQuadrada = Math.sqrt(numero);
			System.out.printf("\nO número informado é par e sua raiz quadrada é %.2f%s" , raizQuadrada , ".");
			} else {
				quadrado = (numero * numero);
				System.out.println("\nO número informado é ímpar e seu quadrado é " + quadrado + ".");
			}
		}
	}
}
