package programas;

public class Programa1 {

	public static void main (String[] args) {// Public: ; Static: ocorre s� uma vez;
											// Void: sem retorno; Main: 
		
	int idade1, idade2;
	boolean vivo1, vivo2;
	
	Pessoa cliente = new Pessoa();
	Pessoa aluno1 = new Pessoa();
			
	cliente.anoNascimento = 2000;
	aluno1.anoNascimento = 2010;
	
	System.out.println("Idade � " + cliente.idade() + ".\n");
	System.out.println("A idade do aluno � " + aluno1.idade() + ".\n");
	
	}
}

