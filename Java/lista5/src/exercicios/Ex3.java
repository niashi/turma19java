package exercicios;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		// Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		// categoria ela se encontra: 
		// [10 - 14] - Infanti. 
		// [15-17] - Juvenil. 
		// [18-25] - Adulto.
		
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Por favor, insira sua idade: ");	
		idade = leia.nextInt();
		
		if (idade <= 0) {
			System.out.println("\nPor favor, insira um valor apropriado para a idade.");		
		} else if (idade > 0 && idade < 10) {
			System.out.println("\nVocê é muito jovem para estar em uma categoria. Volte quando for mais velho.");
		} else {
			while (idade >= 10 && idade <= 14) {
				System.out.println("\nSua categoria é a Infantil.");
				System.exit(1);
			}
			while (idade >= 15 && idade <= 17) {
				System.out.println("\nSua categoria é a Juvenil.");
				System.exit(1);
			}
			while (idade >= 18 && idade <= 25) {
				System.out.println("\nSua categoria é a Adulto.");
				System.exit(1);
			}
			System.out.println("\nVocê não está em nenhuma categoria.");
		}
	}
}
