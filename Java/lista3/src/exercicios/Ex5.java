package exercicios;

public class Ex5 {

	public static void main(String[] args) {
		
		// Programa que mostra uma contagem de 233 a 456.
		// Entre 300 e 400, contar de 3 em 3.
		// Em qualquer outra range, contar de 5 em 5.
		
		
		int x = 233;
				
		do {
			
			if (x >= 300 && x <= 400) {			
				System.out.print(x + "\n");
				x = (x + 3);
			} else {				
				System.out.print(x + "\n");
				x = (x + 5);			
			}					
		} while (x >= 233 && x <= 456); 
	}
}
