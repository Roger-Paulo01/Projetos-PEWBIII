package br.com.doceria.deletar;

import java.sql.Connection;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BrigadeiroDAO;

public class BrigadeiroDeletar {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		BrigadeiroDAO docedao = new BrigadeiroDAO(con);
		
		System.out.println(docedao.deletar());
		Conexao.fecharConexao(con);
	}

}
