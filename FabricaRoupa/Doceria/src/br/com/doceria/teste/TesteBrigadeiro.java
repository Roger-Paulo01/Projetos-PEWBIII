package br.com.doceria.teste;

import javax.swing.JOptionPane;

import br.com.doceria.model.Brigadeiro;

public class TesteBrigadeiro {

	public static void main(String[] args) {
		
		Brigadeiro brigadeiro = new Brigadeiro();
		
		brigadeiro.setNomeDoce(JOptionPane.showInputDialog("Digite o nome do doce:"));
		brigadeiro.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:")));
		brigadeiro.setPesoChocolate(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do chocolate:")));
		
		System.out.println("Nome do doce:" + 
		brigadeiro.getNomeDoce() +
		"\nvalor: " +
		brigadeiro.getValor() +
		"\npeso do chocolate: " +
		brigadeiro.getPesoChocolate()
				);

	}

}
