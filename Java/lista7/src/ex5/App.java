package ex5;

public class App {

	public static void main(String[] args) {
		
		Patinete patinete = new Patinete(1, 15);
		
		System.out.printf("A nova velocidade do patinete é %d km/h." , patinete.frear(10));
	}
}
