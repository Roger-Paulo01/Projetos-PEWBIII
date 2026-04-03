package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setFabricante(JOptionPane.showInputDialog("digite fabricante"));
		carro.setModelo(JOptionPane.showInputDialog("digite o Modelo"));
		carro.setModeloVolante(JOptionPane.showInputDialog("Digite modelo volante"));
		
		System.out.println("O fabricante " + carro.getFabricante() + 
				"\nimporta o carro " + carro.getModelo() + 
				"\ncom volante " + carro.getModeloVolante()
				);
		
	}

}
