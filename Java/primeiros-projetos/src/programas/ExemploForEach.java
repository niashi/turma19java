package programas;

public class ExemploForEach {

	public static void main(String[] args) {
		
		String[] nomes = {"Marcos", "Mateus", "Judas", "Paulo"};
		
		// Tipo, apelido, nome da lista
		for (String apostolo : nomes) {
			System.out.println(apostolo);
		}
	}
} 
