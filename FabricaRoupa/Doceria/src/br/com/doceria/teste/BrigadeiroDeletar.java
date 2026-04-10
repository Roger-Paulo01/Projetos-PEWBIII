package br.com.doceria.teste;

import java.sql.Connection;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BrigadeiroDAO;
import br.com.doceria.model.Brigadeiro;



public class BrigadeiroDeletar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		//Brigadeiro brigadeiro = new Brigadeiro();
		BrigadeiroDAO brigadeirodao = new BrigadeiroDAO(con);////////
		
		System.out.println(brigadeirodao.deletar());
		Conexao.fecharConexao(con);
	}

}
