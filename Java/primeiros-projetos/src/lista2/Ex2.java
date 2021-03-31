package lista2;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		// Elaborar um sistema que lê as variáveis C e N: código e número de horas trabalhadas
		// de um operário, respectivamente. Calcular o salário, sabendo-se que ele ganha R$
		// 10,00 por hora. Além disso, quando o número de horas exceder 50, calcular o excesso
		// de pagamento, armazenando-o na variável E (zerá-la caso o número de horas não exceda
		// 50). Cada hora excedente de trabalho vale R$ 20,00. No fim, imprimir o salário total
		// e o excedente.
		
		
		double N, E, salario;
		String senha = "Generation";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Olá, trabalhador, por favor, insira seu código: ");
		String C = leia.nextLine();
	
		if (C.equals(senha)) { 	// Ao manipular Strings, usar .equals, já que == não compara o conteúdo, e sim a referência dos objetos
			
			System.out.print("\nAgora, insira o número de horas trabalhadas: ");
			N = leia.nextDouble();
			
			if (N <= 0) {
				
				System.out.println("\nPor favor, insira um número válido de horas trabalhadas.");
				
			} else if (N > 0 && N <= 50) {
				
				salario = (N * 10);
				System.out.printf("\nVocê não tem direito a pagamento por horas extras. Seu salário é de R$%.2f%s" , salario , ".\n");
				
			} else {
				
				salario = 500;
				E = (N - 50) * 20;
				System.out.printf("\nVocê tem direito a receber R$%.2f%s%.2f%s" , E , " extras. Seu salário total é de R$" , (salario + E) , ".\n");
				
			}
						
		} else {
			
			System.out.print("\nCódigo de acesso inválido. Por favor, tente novamente.\n");
		}
		
	}
}
