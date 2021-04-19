package exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		// Obter um número digitado pelo usuário e repetir a operação de multiplicação desse número 
		// por 3 (imprimindo o novo valor a cada vez) até que o resultado seja maior que 100. 
		
		
		double numero, operacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		numero = leia.nextDouble();
		
		if (numero <= 0) {
			System.out.println("\nPor favor, digite um número positivo e diferente de zero.");
		} else if (numero > 100) {
			System.out.println("\nA sequência é: " + numero + ".\n");
		} else {
			System.out.print("\nA sequência é: " + numero + ", ");
			operacao = (numero * 3);
					
			while (operacao < 100) {
				System.out.print(operacao + ", ");
				operacao = operacao * 3;
			}
			
			System.out.println(operacao + ".\n");
		}		
	}
}
