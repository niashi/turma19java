package exemplo;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa jessica = new Pessoa("Jessica", 555);
		Funcionario pedro = new Funcionario("Pedro", 222, "TI");
		Pessoa maria = new Funcionario("Maria", 333, "Informática - Desenvolvimento");
		Pessoa jose = new Coordenador("Jose", 444, "CC");
		
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
	} 
}
