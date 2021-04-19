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
			System.out.print("Digite a posi��o da pessoa no vetor [0-2]: ");
			aux = leia.nextInt();
			System.out.print("Digite o nome da pessoa: ");
			nomes[aux] = leia.next();
			System.out.print("Digite a nota: ");
			nota = leia.nextInt();
			
			if (nota <= 5) {
				situacao = "ainda n�o";
			} else situacao = "proximo n�vel";
			
		} catch (InputMismatchException erro) {
			System.out.println("Voc� n�o digitou um n�mero.");
		} catch (ArrayIndexOutOfBoundsException erro) {
			System.out.println("Voc� digitou um tamanho de vetor que n�o existe.");
		}
		
		System.out.printf("Ol�, %s, sua situa��o � %s" , nomes[aux], situacao);
		
	}
}
