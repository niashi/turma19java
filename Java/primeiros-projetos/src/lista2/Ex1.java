package lista2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// Programa que lê a variável P (peso dos tomates) e verifica se ultrapassa 50kg.
		// Se ultrapassar, paga-se uma multa de R$ 4,00 por kg excedente. Gravar o excesso
		// e a multa nas variáveis E e M, respectivamente. Se não houver excesso, gravar
		// o valor 0 nessas variáveis. 
		
		double P, E, M;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Quantos kg de tomate você adquiriu? ");
		P = leia.nextDouble();
		
		E = (P - 50);
		M = 4 * (P - 50);
		
		if (P > 50) {
			
			System.out.printf("\nHouve um excesso de %.2f%s%.2f%s" , E , " kg. Você deverá pagar uma multa de R$ " , M , ".\n");
			
		} else if (P >= 0 && P <= 50) {
			
			System.out.printf("\nVocê adquiriu %.2f%s%s" , P , " kg de tomates. Sendo assim, não alcançou a quantia máxima. Seu excesso é 0 kg e sua"
			, " multa é de R$0,00.");
			
		} else {
			
			System.out.println("\nPor favor, insira um número válido para a quantia de kg de tomates.");
			
		}
		
	}
}
