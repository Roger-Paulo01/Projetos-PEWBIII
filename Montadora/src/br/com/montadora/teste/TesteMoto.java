package br.com.montadora.teste;

import br.com.montadora.model.Moto;

public class TesteMoto {

	public static void main(String[] args) {
		
		Moto moto = new Moto();
		
		moto.setFabricante("Yamaha");
		moto.setModelo("DK160");
		moto.setModeloVolante("foguinho");
		
		
		System.out.println("O fabricante " + moto.getFabricante() + 
				"\nimporta o carro " + moto.getModelo() + 
				"\ncom adesivo " + moto.getAdesivo()
				);
		
	}

}
