package br.com.sextoprojeto.etec;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		int idader = Integer.parseInt(JOptionPane.showInputDialog("digite a idade do professor"));
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade"));
		
		int dif = idader - idade;
		
		System.out.println("a diferença de idade é: " + dif);
	}

}
