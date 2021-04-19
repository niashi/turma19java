package lista5;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		// Programa que entra com três números e os coloca em ordem crescente.
		
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c;
		double maior = 0, meio = 0, menor = 0;
		
		do {
			System.out.print("Por favor, insira três valores numéricos distintos: ");
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
		
		System.out.println("A ordem crescente dos valores é: " + menor + ", " + meio + " e " + maior + ".");
	}
}
