package lista5;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		// Programa que entra com tr�s n�meros e os coloca em ordem crescente.
		
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c;
		double maior = 0, meio = 0, menor = 0;
		
		do {
			System.out.print("Por favor, insira tr�s valores num�ricos distintos: ");
			a = leia.nextDouble();	
			b = leia.nextDouble();
			c = leia.nextDouble();
		
		} while (a == b || a == c || b == c);
		
		if (a > b) {
			if (a > c) {
				maior += a;
				if (c > b) {
					meio += c;
					menor += b;
				} else {
					meio += b;
					menor += c;
				}
			} else  {
				maior += c;
				meio += a;
				menor += b;
			}
		} else {
			if (b > c) {
				if (a > c) {
					maior += b;
					meio += a;
					menor += c;					
				} else {
					maior += b;
					meio += c;
					menor += a;				
				}
			} else {
				maior += c;
				meio += b;
				menor += a;
			}
		}	
		
		System.out.println("A ordem crescente dos valores �: " + menor + ", " + meio + " e " + maior + ".");
	}
}
