package br.com.doceria.teste;
import javax.swing.JOptionPane;

import br.com.doceria.model.*;

public class TesteDoceria {

	public static void main(String[] args) 
	{
		Brigadeiro brigadeiro = new Brigadeiro();
		
		brigadeiro.setNomeDoce		(JOptionPane.showInputDialog("Digite o Nome do Doce: "));
		brigadeiro.setValor			(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor dele: ")));
		brigadeiro.setPesoChocolate	(Double.parseDouble(JOptionPane.showInputDialog
									("Digite o Peso: ")));
		
		System.out.println	("Doce: " + brigadeiro.getNomeDoce() + 
							"\nValor: R$ " + brigadeiro.getValor() +
							"\nPeso: " + brigadeiro.getPesoChocolate()+" gramas");

	}

}
