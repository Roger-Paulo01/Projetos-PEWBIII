package br.com.doceria.deletar;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BrigadeiroDAO;
import br.com.doceria.model.Brigadeiro;


public class BrigadeiroDeletarWhere {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		Brigadeiro doce = new Brigadeiro();
		BrigadeiroDAO docedao = new BrigadeiroDAO(con);
		
		doce.setValor(Double.parseDouble(JOptionPane.showInputDialog
						("Digite o valor na qual quer Apagar: ")));
		
		
		System.out.println(docedao.deletarWhere(doce));
		Conexao.fecharConexao(con);
	}

}
