package lista2;

import java.util.Scanner;

public class Ex8 {
	
	public static void main(String[] args) {
		
		// Sistema que lê uma variável numérica N e a imprime caso ela seja maior que 100, e, caso não seja, imprime o valor 0.
		
		
		double N;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Forneça um número: ");
		N = leia.nextDouble();
		
		if (N > 100) {
			System.out.println("\nO número fornecido foi " + N + ".\n");
		} else {
			System.out.println("\nO número fornecido foi zero (eu sei que não foi, mas o sistema insere esse valor forçadamente, rs.\n");
		}
	}
}
