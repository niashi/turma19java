package exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		// Programa que informa o custo de um carro ao consumidor, utilizando porcentagem do distribuidor e impostos como par�metros.
		
		
		double custoFabrica, custoConsumidor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual � o pre�o de um carro novo para o consumidor final? \n");
		System.out.print("\nQual � o custo de f�brica? R$");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = custoFabrica + (0.28 * custoFabrica) + (0.45 * custoFabrica);
		
		System.out.println("\nO pre�o de um carro novo, para o consumidor, � de R$" + custoConsumidor + ".");
		
		
	}
}
