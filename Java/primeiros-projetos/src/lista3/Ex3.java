package lista3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		// Programa lê sucessivamente 10 valores numéricos e apresenta o somatório, média e total de valores lidos.
		// O programa é finalizado e apresenta os resultados caso o usuário insira um valor negativo.
		
		
		double valor, soma = 0, media;
		int total = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Insira um valor numérico inteiro e positivo: ");
			valor = leia.nextDouble();
			
			if (valor >= 0) {
				soma = soma + valor;
				total++;				
			}
		} while (valor >= 0);
			
		if (total == 0) {
			System.out.println("\nPor favor, insira pelo menos um valor. \n");
		} else {
			media = (soma / total);
			
			System.out.print("\nVocê inseriu um valor negativo. \n");
			System.out.printf("\nA soma dos valores é %.2f%s" , soma , ". \n");
			System.out.printf("A média dos valores é %.2f%s" , media , ". \n");
			System.out.print("O total de valores informados é " + total + ". \n");
		}
	}
}
