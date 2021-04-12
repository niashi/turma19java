package app;

import java.util.ArrayList;
import java.util.List;

import entities.Celular;
import entities.Notebook;

public class Loja {

	public static void main(String[] args) {
		List<String> produtos = new ArrayList<String>();
		
		Celular pocophone = new Celular("Xiaomi", 1499.99, 64);
		Notebook macbook = new Notebook("Macbook", 9999.99, true);
		
		produtos.add("macbook");
		produtos.add("pocophone");
		
		System.out.println(produtos);		
		
		produtos.remove("macbook");
		
		System.out.println(produtos);
	}
}
