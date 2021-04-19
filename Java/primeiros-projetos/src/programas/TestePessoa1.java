package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestePessoa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List<Pessoa1> contatos = new ArrayList<>();
		
		contatos.add(new Pessoa1("Maju", 2017, 'F'));
		contatos.add(new Pessoa1("Jaque", 2001, 'F'));
		contatos.add(new Pessoa1("Mathias", 1994, 'M'));
		
		System.out.println(contatos.indexOf("Maju"));
		
		
			// tipo de dado; apelido que representará cada elemento; nome da lista
		for (Pessoa1 nome: contatos) {
			System.out.println(nome.getNome() + " - " + nome.idade() + ". Nasceu em " + nome.getAnoNascimento());
		}
		
	}
}
