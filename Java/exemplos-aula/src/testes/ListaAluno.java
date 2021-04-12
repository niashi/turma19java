package testes;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	
	public static void main(String[] args) {
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("Jaque", "Engenharia da Computação", 10);
		Aluno b = new Aluno("Mathias", "Ciência da Computação", 10);
		Aluno c = new Aluno("Maju", "Balé", 10);
		Aluno d = new Aluno("Nicolas", "Música", 10);
		Aluno e = new Aluno("Agnes", "Física", 10);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}
}
