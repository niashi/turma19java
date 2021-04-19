package exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		// Programa que informa o custo de um carro ao consumidor, utilizando porcentagem do distribuidor e impostos como parâmetros.
		
		
		double custoFabrica, custoConsumidor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual é o preço de um carro novo para o consumidor final? \n");
		System.out.print("\nQual é o custo de fábrica? R$");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = custoFabrica + (0.28 * custoFabrica) + (0.45 * custoFabrica);
		
		System.out.println("\nO preço de um carro novo, para o consumidor, é de R$" + custoConsumidor + ".");
		
		
	}
}
