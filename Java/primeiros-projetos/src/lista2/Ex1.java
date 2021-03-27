package lista2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// Programa que l� a vari�vel P (peso dos tomates) e verifica se ultrapassa 50kg.
		// Se ultrapassar, paga-se uma multa de R$ 4,00 por kg excedente. Gravar o excesso
		// e a multa nas vari�veis E e M, respectivamente. Se n�o houver excesso, gravar
		// o valor 0 nessas vari�veis. 
		
		double P, E, M;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Quantos kg de tomate voc� adquiriu? ");
		P = leia.nextDouble();
		
		E = (P - 50);
		M = 4 * (P - 50);
		
		if (P > 50) {
			
			System.out.printf("\nHouve um excesso de %.2f%s%.2f%s" , E , " kg. Voc� dever� pagar uma multa de R$ " , M , ".\n");
			
		} else if (P >= 0 && P <= 50) {
			
			System.out.printf("\nVoc� adquiriu %.2f%s%s" , P , " kg de tomates. Sendo assim, n�o alcan�ou a quantia m�xima. Seu excesso � 0 kg e sua"
			, " multa � de R$0,00.");
			
		} else {
			
			System.out.println("\nPor favor, insira um n�mero v�lido para a quantia de kg de tomates.");
			
		}
		
	}
}
