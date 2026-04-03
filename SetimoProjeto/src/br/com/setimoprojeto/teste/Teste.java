package br.com.setimoprojeto.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		System.out.println("oi");
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		System.out.println("O nome digitado foi " + nome);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		System.out.println("A idade digitada foi "+ idade);
		System.out.println("Nome: "+ nome + " e a idade é: " + idade);
	}

}
