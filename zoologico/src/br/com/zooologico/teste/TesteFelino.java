package br.com.zooologico.teste;

import javax.swing.JOptionPane;

import br.com.zooologico.model.Felino;

public class TesteFelino {

	public static void main(String[] args) {
		Felino felino = new Felino();
		
		felino.setTamanho(Double.parseDouble(JOptionPane.showInputDialog("digite o tamanho")));
		felino.setPeso(Double.parseDouble(JOptionPane.showInputDialog("digite o Peso")));
		felino.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade")));
		felino.setTempoGestacao(Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de Gestação")));
		
		System.out.println("O tamanho do felino é " + felino.getTamanho() + 
				"\ncom o peso " + felino.getPeso() + 
				"\ne idade " + felino.getIdade() +
				"\ne com o tempo de gestacao " + felino.getTempoGestacao() 
				);

	}

}
