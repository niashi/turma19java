package exercicios;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		// Sistema que l� o �ndice de polui��o da Secretaria de Meio Ambiente e emite
		// uma notifica��o adequada aos diferentes grupos de ind�strias poluidoras (1, 2 e 3).
		
		
		double indice = 0.01;
		int grupo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual � o grupo de sua ind�stria? 1, 2 ou 3? ");
		grupo = leia.nextInt();
		
		if (grupo < 1 || grupo > 3) {
			System.out.println("\nPor favor, insira um grupo v�lido.");
		} else {
			System.out.print("\nE qual � o �ndice de polui��o total? ");
			indice = leia.nextDouble();
			
			if (indice < 0) {
				System.out.println("\nPor favor, insira um valor v�lido para o �ndice.");
			} else if (indice == 0) {
				System.out.println("\nTem certeza que o �ndice est� correto?");
			} else if (indice > 0 && indice < 0.3) {
				System.out.println("\nO �ndice est� aceit�vel. N�o � necess�rio suspender as atividades industriais.");
			} else if (indice >= 0.3 && indice < 0.4) {
				if (grupo == 1) {
					System.out.println("\nO �ndice est� elevado. As ind�strias do seu grupo ter�o suas atividades suspensas.");
				} else {
					System.out.println("\nO �ndice est� elevado, mas as ind�strias do seu grupo poder�o seguir operando.");
				}
			} else if (indice >= 0.4 && indice < 0.5) {
				if (grupo == 1 || grupo == 2) {
					System.out.println("\nO �ndice est� muito elevado. As ind�strias dos grupos 1 e 2 ter�o suas atividades suspensas.");
				} else {
					System.out.println("\nO �ndice est� muito elevado, mas as ind�strias do seu grupo poder�o seguir operando.");
				}
			} else {
				System.out.println("\nO �ndice est� extremamente elevado. As ind�strias dos grupos 1, 2 e 3 ter�o suas atividades " + 
				"suspensas.");
			}
		}
	}
	
}
