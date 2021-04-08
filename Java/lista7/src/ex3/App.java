package ex3;

public class App {

	public static void main(String[] args) {
		
		ProdEletronico ps5 = new ProdEletronico("Sony", "PS5", 75);
		
		System.out.printf("O novo volume é %d%%." , ps5.aumentarVolume(25));
		System.out.printf("\nO novo volume é %d%%." , ps5.diminuirVolume(25));
	}
}
