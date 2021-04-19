package exercicios;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		// Sistema que lê o índice de poluição da Secretaria de Meio Ambiente e emite
		// uma notificação adequada aos diferentes grupos de indústrias poluidoras (1, 2 e 3).
		
		
		double indice = 0.01;
		int grupo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual é o grupo de sua indústria? 1, 2 ou 3? ");
		grupo = leia.nextInt();
		
		if (grupo < 1 || grupo > 3) {
			System.out.println("\nPor favor, insira um grupo válido.");
		} else {
			System.out.print("\nE qual é o índice de poluição total? ");
			indice = leia.nextDouble();
			
			if (indice < 0) {
				System.out.println("\nPor favor, insira um valor válido para o índice.");
			} else if (indice == 0) {
				System.out.println("\nTem certeza que o índice está correto?");
			} else if (indice > 0 && indice < 0.3) {
				System.out.println("\nO índice está aceitável. Não é necessário suspender as atividades industriais.");
			} else if (indice >= 0.3 && indice < 0.4) {
				if (grupo == 1) {
					System.out.println("\nO índice está elevado. As indústrias do seu grupo terão suas atividades suspensas.");
				} else {
					System.out.println("\nO índice está elevado, mas as indústrias do seu grupo poderão seguir operando.");
				}
			} else if (indice >= 0.4 && indice < 0.5) {
				if (grupo == 1 || grupo == 2) {
					System.out.println("\nO índice está muito elevado. As indústrias dos grupos 1 e 2 terão suas atividades suspensas.");
				} else {
					System.out.println("\nO índice está muito elevado, mas as indústrias do seu grupo poderão seguir operando.");
				}
			} else {
				System.out.println("\nO índice está extremamente elevado. As indústrias dos grupos 1, 2 e 3 terão suas atividades " + 
				"suspensas.");
			}
		}
	}
	
}
