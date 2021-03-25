package programas;

public class BancaDeRevista {
	
	public static void main(String[] args) {
		
		Pessoa clienteBanca = new Pessoa();
		
		clienteBanca.anoNascimento = 2001;
		
		System.out.println("A idade do cliente é " + clienteBanca.idade() + " anos.");
	}

}
