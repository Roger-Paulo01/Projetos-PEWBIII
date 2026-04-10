package br.com.doceria.teste;

import java.sql.Connection;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BrigadeiroDAO;
import br.com.doceria.model.Brigadeiro;




public class BrigadeiroDeletarWhere {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Brigadeiro brigadeiro = new Brigadeiro();
		BrigadeiroDAO brigadeirodao = new BrigadeiroDAO(con);////////
		
		brigadeiro.setValor(12);
		
		System.out.println(brigadeirodao.deletarWhere(brigadeiro));
		Conexao.fecharConexao(con);
	}

}
