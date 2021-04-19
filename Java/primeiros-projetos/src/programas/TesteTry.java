package programas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteTry {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int nota = 0, aux = 0;
		String nomes[] = new String[3];
		String situacao = "";
		
		try {
			System.out.print("Digite a posição da pessoa no vetor [0-2]: ");
			aux = leia.nextInt();
			System.out.print("Digite o nome da pessoa: ");
			nomes[aux] = leia.next();
			System.out.print("Digite a nota: ");
			nota = leia.nextInt();
			
			if (nota <= 5) {
				situacao = "ainda não";
			} else situacao = "proximo nível";
			
		} catch (InputMismatchException erro) {
			System.out.println("Você não digitou um número.");
		} catch (ArrayIndexOutOfBoundsException erro) {
			System.out.println("Você digitou um tamanho de vetor que não existe.");
		}
		
		System.out.printf("Olá, %s, sua situação é %s" , nomes[aux], situacao);
		
	}
}
