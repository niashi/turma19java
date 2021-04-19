package lista2;

import java.util.Scanner;

public class Ex7 {
	
	public static void main(String[] args) {
		
		// Programa que recebe valores de BASE e ALTURA de um triângulo e, caso sejam válidos, emite a área da figura.
		
		
		double base, altura, area;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o valor da base do triângulo: ");
		base = leia.nextDouble();
		
		if (base <= 0) {
			System.out.println("\nPor favor, forneça um valor válido para a base.\n");
		} else {
			System.out.print("\nInforme o valor da altura do triângulo: ");
			altura = leia.nextDouble();
			
			if (altura <= 0) {
				System.out.println("\nPor favor, forneça um valor válido para a altura.\n");
			} else {
				area = (base * altura) / 2;
				System.out.println(area);
				System.out.printf("\nO valor da área do triângulo é %.2f%s" , area , ".\n");
			}
		}
	}
}
