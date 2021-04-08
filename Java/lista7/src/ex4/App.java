package ex4;

public class App {
	
	public static void main(String[] args) {
		
		Funcionario jaque = new Funcionario("Jaqueline", "123", "Itaú", "Analista de Engenharia de TI");
		
		jaque.informarCodigo();
		
		System.out.println();
		
		jaque.baterPonto();
	}
}
