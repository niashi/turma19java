package lista3;

public class Ex2 {

	public static void main(String[] args) {
		
		// Sistema que efetua a soma de todos os números ímpares múltiplos de 3 e que se
		// encontram na range 1 <= x <= 500.
		
		
		int soma = 0;
		
		System.out.print("Qual é a soma de todos os números ímpares múltiplos de 3, de 1 a 500? \n");
		
		for (int numero = 0; numero <= 500; numero++) {		
			if (numero % 3 == 0) {
				soma = soma + numero;				
			}		
		}
		
		System.out.println("\nÉ " + soma);
	}
}
