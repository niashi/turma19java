package exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		// Obter um n�mero digitado pelo usu�rio e repetir a opera��o de multiplica��o desse n�mero 
		// por 3 (imprimindo o novo valor a cada vez) at� que o resultado seja maior que 100. 
		
		
		double numero, operacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		numero = leia.nextDouble();
		
		if (numero <= 0) {
			System.out.println("\nPor favor, digite um n�mero positivo e diferente de zero.");
		} else if (numero > 100) {
			System.out.println("\nA sequ�ncia �: " + numero + ".\n");
		} else {
			System.out.print("\nA sequ�ncia �: " + numero + ", ");
			operacao = (numero * 3);
					
			while (operacao < 100) {
				System.out.print(operacao + ", ");
				operacao = operacao * 3;
			}
			
			System.out.println(operacao + ".\n");
		}		
	}
}
