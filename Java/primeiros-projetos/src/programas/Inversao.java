package programas;

import java.util.Scanner;

public class Inversao {
	
	public static void main(String[] args) {
		
		// receber dois valores inteiros e positivos. Inverter os valores das vari�veis.
		
		int a, b, c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Insira o valor da vari�vel A: ");
		a = leia.nextInt();
		System.out.print("Insira o valor da vari�vel B: ");
		b = leia.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("\nInvertendo valores...");
		System.out.println("\nNovo valor de A: " + a);
		System.out.println("Novo valor de B: " + c);
	}
}
