package br.com.doceria.deletar;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BeijinhoDAO;
import br.com.doceria.model.Beijinho;

public class BeijinhoDeletarWhere {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		Beijinho doce = new Beijinho();
		BeijinhoDAO docedao = new BeijinhoDAO(con);
		
		doce.setValor(Double.parseDouble(JOptionPane.showInputDialog
						("Digite o valor na qual quer Apagar: ")));
		
		
		System.out.println(docedao.deletarWhere(doce));
		Conexao.fecharConexao(con);
	}

}
