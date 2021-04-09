package app;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Teste {
	
	public static void main(String[] args) {
		
		Cachorro trapo = new Cachorro("Trapo", 15, "caramelo");
		Cavalo ponita = new Cavalo("Ponita", 10, 2);
		Preguica slakoth = new Preguica("Slakoth", 5, 20);
		
		System.out.println(trapo.getNome() + " - " + trapo.getIdade() + " anos e pelagem " + trapo.getPelagem());
		trapo.emitirSom("au");
		trapo.correr();
		
		System.out.println();
		
		System.out.println(ponita.getNome() + " - " + ponita.getIdade() + " anos e " + ponita.getAltura() + "m de altura.");
		ponita.emitirSom("hiin");
		ponita.correr();
		
		System.out.println();
		
		System.out.println(slakoth.getNome() + " - " + slakoth.getIdade() + " anos e " + slakoth.getTamanhoGarras() + "cm de garras.");
		slakoth.emitirSom("aaaa");
		slakoth.subirEmArvore();
	}
}
