package exercicios;

public class Ex1 {

	public static void main(String[] args) {
		
		// Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
		// obtemos resto = 5. (FOR)
		
		
		System.out.println("Lista de n�meros de 1000 a 1999 cujo resto da divis�o por 11 � 5: \n");
		
		for (int x = 1000; x < 1985; x++) {
			if ((x % 11) == 5) {
				System.out.print(x + ", ");
			}
		}
		System.out.println("1985 e 1996.");
 	}
}
