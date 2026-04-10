package br.com.montadora.teste;

import br.com.montadora.model.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setFabricante("Honda");
		carro.setModelo("Civic");
		carro.setModeloVolante("Esportivo");
		
		System.out.println("Fabricante: " + 
				carro.getFabricante() +
				"\nModelo: " +
				carro.getModelo() +
				"\nModelo do volante: " +
				carro.getModeloVolante()
				);
	}
}
