package br.com.doceria.teste;
import javax.swing.JOptionPane;

import br.com.doceria.model.*;

public class TesteBeijinho {

	public static void main(String[] args) {
		Beijinho beijinho = new Beijinho();
		
		beijinho.setNomeDoce(JOptionPane.showInputDialog("Digite o nome do doce: "));
		beijinho.setPesoCoco(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do doce: ")));
		beijinho.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
		
		System.out.println("O doce é " + beijinho.getNomeDoce() + 
				", o peso é Kg" + beijinho.getPesoCoco() +
				" e o valor deu R$" + beijinho.getValor());

	}

}
