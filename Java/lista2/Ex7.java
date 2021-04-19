package lista2;

import java.util.Scanner;

public class Ex7 {
	
	public static void main(String[] args) {
		
		// Programa que recebe valores de BASE e ALTURA de um tri�ngulo e, caso sejam v�lidos, emite a �rea da figura.
		
		
		double base, altura, area;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o valor da base do tri�ngulo: ");
		base = leia.nextDouble();
		
		if (base <= 0) {
			System.out.println("\nPor favor, forne�a um valor v�lido para a base.\n");
		} else {
			System.out.print("\nInforme o valor da altura do tri�ngulo: ");
			altura = leia.nextDouble();
			
			if (altura <= 0) {
				System.out.println("\nPor favor, forne�a um valor v�lido para a altura.\n");
			} else {
				area = (base * altura) / 2;
				System.out.println(area);
				System.out.printf("\nO valor da �rea do tri�ngulo � %.2f%s" , area , ".\n");
			}
		}
	}
}
