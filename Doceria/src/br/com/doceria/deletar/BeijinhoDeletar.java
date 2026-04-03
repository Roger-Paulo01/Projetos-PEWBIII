package br.com.doceria.deletar;

import java.sql.Connection;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BeijinhoDAO;

public class BeijinhoDeletar {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		BeijinhoDAO docedao = new BeijinhoDAO(con);
		
		System.out.println(docedao.deletar());
		Conexao.fecharConexao(con);
	}

}
