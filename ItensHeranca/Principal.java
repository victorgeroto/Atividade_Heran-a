package ItensHeranca;

import Heranca.Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		Produto produto = new Produto (1,"escova", "30.00");
		System.out.println("Produto: ");
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Preco: "+ produto.getPreco());
		
		Sorvete sorvete = new Sorvete (2,"flocos","45.0",15.5);
		System.out.println("Temperatura Adequada: "+ sorvete.getTempAdequada());
		
		Camisa camisa = new Camisa (3,"Polo","40.0","preto","poliester","GG");
		System.out.println("Cor: " + camisa.getCor());
		System.out.println("Tecido: " + camisa.getTecido());
		System.out.println("Tamanho: "+ camisa.getTamanho());
		
		
		

	}

}
