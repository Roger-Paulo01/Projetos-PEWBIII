package br.com.doceria.inserir;

import java.sql.Connection;
import javax.swing.JOptionPane;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.*;
import br.com.doceria.model.*;

public class BeijinhoInserir {

public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Beijinho doce = new Beijinho();
		BeijinhoDAO docedao = new BeijinhoDAO(con);////////
		doce.setNomeDoce(JOptionPane.showInputDialog("Digite o nome do Doce: "));
		 
		doce.setPesoCoco(Double.parseDouble(JOptionPane
				 .showInputDialog("Digite seu peso em gramas: ")));
		doce.setValor(Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do Doce: ")));
		System.out.println(docedao.inserir(doce));
		Conexao.fecharConexao(con);
	}

}
