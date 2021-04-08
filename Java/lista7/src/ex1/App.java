package ex1;

public class App {
	
	public static void main(String[] args) {
		
		Cliente jaque = new Cliente("Jaqueline", "Azambuja", "123.456.789-01");
		System.out.println(jaque.getNomeCompleto());
		System.out.println(jaque.mostrarCpf());
	}
}
