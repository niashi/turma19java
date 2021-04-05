package lista5;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// Programa que recebe três inteiros e diz qual deles é o maior.
		
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Insira três valores: ");
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		
		while (a >= b) {
			if (a >= c) {
				System.out.print("O maior valor é " + a + ".");
				System.exit(1);
			} else {
				System.out.print("\nO maior valor é " + c + ".");
				System.exit(1);
			}
		}
		
		if (c <= b) {
			System.out.print("\nO maior valor é " + b + ".");
		} else {
			System.out.print("\nO maior valor é " + c + ".");
		}
	}
}
