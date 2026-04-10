package br.com.doceria.teste;

import java.sql.Connection;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BeijinhoDAO;
import br.com.doceria.model.Beijinho;




public class BeijinhoDeletarWhere {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Beijinho beijinho = new Beijinho();
		BeijinhoDAO beijinhodao = new BeijinhoDAO(con);////////
		
		beijinho.setValor(11);
		
		System.out.println(beijinhodao.deletarWhere(beijinho));
		Conexao.fecharConexao(con);
	}

}
