package projetoEmpresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		// Funcionario fulano = new Funcionario("12345", "Fulano");
		// Funcionario beltrano = new Funcionario("67890", "Beltrano", 48, 30);		
		// Terceiro ciclano = new Terceiro("11111", "Ciclano", 30, 30, 50);
		
		// fulano.setHorasTrabalhadas(10);
		// fulano.setValorHora(50);
		
		// beltrano.setHorasTrabalhadas(25);
		// beltrano.setValorHora(10);
		
		// System.out.println(fulano.getNome() + " sal�rio: R$ " + fulano.retornarSalario());
		// System.out.println(beltrano.getNome() + " sal�rio: R$ " + beltrano.retornarSalario());
		
		System.out.println("Cadastro de funcion�rios - Pagamentos");
		System.out.println("Quantos funcion�rios ser�o cadastrados?");
		int quantia = leia.nextInt();
		
		for (int x = 1; x <= quantia; x++) {
			System.out.printf("� Colaborador %d, selecione a op��o:\n" , x);
			System.out.print("\nDigite 1 - Funcion�rio 2 - Terceiro");
			char tipo = leia.next().charAt(0);
			System.out.print("\nDigite a matr�cula: ");
			String matricula = leia.nextLine();
			System.out.println("\nDigite o nome: ");
			String nome = leia.nextLine();
			System.out.println("\nDigite as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Digite o valor por hora: R$");
			double valorHora = leia.nextDouble();
			
			if (tipo == '2') {
				System.out.println("Digite o valor do adicional: R$");
				double adicional = leia.nextDouble();
				Terceiro colaborador = new Terceiro(matricula, nome, horasTrabalhadas, valorHora, adicional);
				lista.add(new Terceiro(matricula, nome, horasTrabalhadas, valorHora, adicional));
			} else {
				lista.add(new Funcionario(matricula, nome, horasTrabalhadas, valorHora));
			}
		}
		
		System.out.println();
		System.out.println("Folha de pagamentos: ");
		
		// For each
		for (Funcionario funcionario: lista) {
			System.out.println(funcionario.getNome() + " "  + "sal�rio R$: " + funcionario.retornarSalario()) ;
		}
		
		System.out.println("FIM DE PROGRAMA");
	}

	
	
	// System.out.printf("O funcion�rio %s, de matr�cula %s, trabalhou %d horas. Sendo o valor da hora %f, o funcion�rio recebeu "  , fulano.getNome() , fulano.getMatricula() , fulano.getHorasTrabalhadas());
}
