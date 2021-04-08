package ex2;

public class App {
	
	public static void main(String[] args) {
		
		Aviao boeing737 = new Aviao("Boeing 737", 215, 500);
		
		System.out.printf("A nova velocidade é %d km/h." , boeing737.acelerar(200));
	}
}
