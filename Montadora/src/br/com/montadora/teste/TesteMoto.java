package br.com.montadora.teste;

import br.com.montadora.model.Moto;

public class TesteMoto {

	public static void main(String[] args) {
		
		
		Moto moto = new Moto();
		
		moto.setFabricante("Honda");
		moto.setModelo("150 cc");
		moto.setAdesivo("Azul");
		
		System.out.println("Fabricante: " + 
				moto.getFabricante() +
				"\nModelo: " +
				moto.getModelo() +
				"\nAdesivo: " +
				moto.getAdesivo()
				);

	}
}
