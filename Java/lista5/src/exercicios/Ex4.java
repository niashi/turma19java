package exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		// Programa que permite a entrada de um n�mero qualquer e exibe se este
		// n�mero � par ou �mpar. Se for par, exibe tamb�m a raiz quadrada dele; se for
		// �mpar, exibe o n�mero elevado ao quadrado. 
		
		
		Scanner leia = new Scanner(System.in);
		
		int numero, quadrado;
		double raizQuadrada; 
		
		System.out.print("Por favor, insira um n�mero inteiro e positivo: ");
		numero = leia.nextInt();
		
		if (numero < 0) {
			System.out.println("\nPor favor, insira um valor positivo.");
		} else if (numero == 0) {
			System.out.println("\nH� diverg�ncias quanto � paridade no n�mero zero. Por favor, insira outro valor.");
		} else {
			if (numero % 2 == 0) {
			raizQuadrada = Math.sqrt(numero);
			System.out.printf("\nO n�mero informado � par e sua raiz quadrada � %.2f%s" , raizQuadrada , ".");
			} else {
				quadrado = (numero * numero);
				System.out.println("\nO n�mero informado � �mpar e seu quadrado � " + quadrado + ".");
			}
		}
	}
}
