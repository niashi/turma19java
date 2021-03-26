package lista1;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		// Sistema que calcula a seguinte expressão: D = (R + S) / 2, sendo R = (A + B)² e S = (B + C)².
		
		int A, B, C;		
		double D, R, S;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o valor A: ");
		A = leia.nextInt();
		System.out.print("Informe o valor B: ");
		B = leia.nextInt();
		System.out.print("Informe o valor C: ");
		C = leia.nextInt();
		
		R = ((A + B) * (A + B));
		S = ((B + C) * (B + C));
		
		D = (R + S) / 2;
		
		System.out.println("\nO valor de D é " + D + ".");
	}
}
