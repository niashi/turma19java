package testes;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {   // Mapeia as chaves para os valores
	public static void main(String[] args) {
		
		Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
		
		Aluno a = new Aluno("Jaque", "Engenharia da Computação", 10);
		Aluno b = new Aluno("Mathias", "Ciência da Computação", 10);
		Aluno c = new Aluno("Maju", "Balé", 10);
		Aluno d = new Aluno("Nicolas", "Música", 10);
		Aluno e = new Aluno("Agnes", "Física", 10);
		
		mapa.put("Jaque", a);
		mapa.put("Mathias", b);
		mapa.put("Maju", c);
		mapa.put("Nicolas", d);
		mapa.put("Agnes", e);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Maju"));
		
		Collection<Aluno> alunos = mapa.values();
		
		for (Aluno f: alunos) {
			System.out.println(f);
		}
	}
}
