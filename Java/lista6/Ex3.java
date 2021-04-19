package lista6;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		// 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		// idade for =-99. (WHILE)
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idade;
		int quantiaMenor21 = 0, quantiaMaior50 = 0;
		
		System.out.print("Por favor, digite uma idade: [Para sair, digite -99] ");
		idade = leia.nextInt();
		while (idade != -99) {
			if (idade <= 0) {
				System.out.println("Por favor, insira um valor adequado.");
			} else if (idade < 21) {
				quantiaMenor21++;
			} else if (idade > 50) {
				quantiaMaior50++;
			}
			System.out.print("Deseja continuar? Se sim, siga digitando mais idades. ");
			idade = leia.nextInt();
		}
		
		System.out.printf("\nO total de pessoas com menos de 21 anos é %d e o total com mais de 50 é %d ." , quantiaMenor21 , quantiaMaior50);
	}
}
