package lista2;

import java.util.Scanner;

public class Ex8 {
	
	public static void main(String[] args) {
		
		// Sistema que l� uma vari�vel num�rica N e a imprime caso ela seja maior que 100, e, caso n�o seja, imprime o valor 0.
		
		
		double N;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Forne�a um n�mero: ");
		N = leia.nextDouble();
		
		if (N > 100) {
			System.out.println("\nO n�mero fornecido foi " + N + ".\n");
		} else {
			System.out.println("\nO n�mero fornecido foi zero (eu sei que n�o foi, mas o sistema insere esse valor for�adamente, rs.\n");
		}
	}
}
