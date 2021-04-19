package exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		// Sistema que l� um n�mero inteiro e mostra uma mensagem indicando a paridade do n�mero e se � positivo ou negativo.
		
		
		int n1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro: ");
		n1 = leia.nextInt();
		
		if (n1 < 0) {
			System.out.println("\nO n�mero " + n1 + " � negativo, portanto, n�o possui paridade");
		} else if (n1 == 0) {
			System.out.println("\nH� diverg�ncias a respeito da paridade do n�mero 0. Por favor, escolha outro n�mero.");
		} else {
			if (n1 % 2 == 0) {
				System.out.println("\nO n�mero " + n1 + " � positivo e par.");
			} else {
				System.out.println("\nO n�mero " + n1 + " � positivo e �mpar.");
			}
		}
	}
}
