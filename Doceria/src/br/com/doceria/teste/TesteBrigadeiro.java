package br.com.doceria.teste;

import javax.swing.JOptionPane;

import br.com.doceria.model.*;

public class TesteBrigadeiro {

	public static void main(String[] args) {
		 Brigadeiro doce = new Brigadeiro();
		 
		 doce.setNomeDoce(JOptionPane.showInputDialog("Digite o nome do Doce: "));
		 
		 doce.setPesoChocolate(Double.parseDouble(JOptionPane
					 .showInputDialog("Digite seu peso em gramas: ")));
		 doce.setValor(Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do Doce: ")));

	}

}
