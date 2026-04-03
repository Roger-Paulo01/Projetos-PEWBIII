package br.com.quintoprojeto.etec;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		
		System.out.println(nome);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		System.out.println(idade);
	}

}
