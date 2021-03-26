package lista1;

import java.util.Scanner;

public class raiz {
	
	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		int entrada;
		double resultado;
		System.out.println("Digite um número: ");
		entrada = numero.nextInt();
		resultado = Math.sqrt(entrada);
		System.out.println(resultado);
	}
}
