package testes;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	
	public static void main(String[] args) {
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("Jaque", "Engenharia da Computa��o", 10);
		Aluno b = new Aluno("Mathias", "Ci�ncia da Computa��o", 10);
		Aluno c = new Aluno("Maju", "Bal�", 10);
		Aluno d = new Aluno("Nicolas", "M�sica", 10);
		Aluno e = new Aluno("Agnes", "F�sica", 10);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}
}
