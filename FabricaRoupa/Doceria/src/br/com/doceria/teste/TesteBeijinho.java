package br.com.doceria.teste;

import javax.swing.JOptionPane;

import br.com.doceria.model.Beijinho;

public class TesteBeijinho {

	public static void main(String[] args) {

		Beijinho beijinho = new Beijinho();

		beijinho.setNomeDoce(JOptionPane.showInputDialog("Digite o nome do doce:"));
		beijinho.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:")));
		beijinho.setPesoCoco(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do coco:")));

		System.out.println("Nome do doce:" + beijinho.getNomeDoce() + "\nvalor: " + beijinho.getValor()
				+ "\npeso do coco: " + beijinho.getPesoCoco());
	}
}
