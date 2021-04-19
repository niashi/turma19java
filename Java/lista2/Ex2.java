package lista2;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		// Elaborar um sistema que l� as vari�veis C e N: c�digo e n�mero de horas trabalhadas
		// de um oper�rio, respectivamente. Calcular o sal�rio, sabendo-se que ele ganha R$
		// 10,00 por hora. Al�m disso, quando o n�mero de horas exceder 50, calcular o excesso
		// de pagamento, armazenando-o na vari�vel E (zer�-la caso o n�mero de horas n�o exceda
		// 50). Cada hora excedente de trabalho vale R$ 20,00. No fim, imprimir o sal�rio total
		// e o excedente.
		
		
		double N, E, salario;
		String senha = "Generation";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Ol�, trabalhador, por favor, insira seu c�digo: ");
		String C = leia.nextLine();
	
		if (C.equals(senha)) { 	// Ao manipular Strings, usar .equals, j� que == n�o compara o conte�do, e sim a refer�ncia dos objetos
			
			System.out.print("\nAgora, insira o n�mero de horas trabalhadas: ");
			N = leia.nextDouble();
			
			if (N <= 0) {
				
				System.out.println("\nPor favor, insira um n�mero v�lido de horas trabalhadas.");
				
			} else if (N > 0 && N <= 50) {
				
				salario = (N * 10);
				System.out.printf("\nVoc� n�o tem direito a pagamento por horas extras. Seu sal�rio � de R$%.2f%s" , salario , ".\n");
				
			} else {
				
				salario = 500;
				E = (N - 50) * 20;
				System.out.printf("\nVoc� tem direito a receber R$%.2f%s%.2f%s" , E , " extras. Seu sal�rio total � de R$" , (salario + E) , ".\n");
				
			}
						
		} else {
			
			System.out.print("\nC�digo de acesso inv�lido. Por favor, tente novamente.\n");
		}
		
	}
}
