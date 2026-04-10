package br.com.doceria.teste;

import java.sql.Connection;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BeijinhoDAO;




public class BeijinhoDeletar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		//Beijinho beijinho = new Beijinho();
		BeijinhoDAO beijinhodao = new BeijinhoDAO(con);////////
		
		System.out.println(beijinhodao.deletar());
		Conexao.fecharConexao(con);
	}

}
