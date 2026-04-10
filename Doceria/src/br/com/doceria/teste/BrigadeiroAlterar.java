package br.com.doceria.teste;

import java.sql.Connection;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BrigadeiroDAO;
import br.com.doceria.model.Brigadeiro;



public class BrigadeiroAlterar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Brigadeiro brigadeiro = new Brigadeiro();
		BrigadeiroDAO brigadeirodao = new BrigadeiroDAO(con);////////

		brigadeiro.setNomeDoce("Brigadeiro light");
		brigadeiro.setValor(44);

		
		System.out.println(brigadeirodao.alterar(brigadeiro));
		Conexao.fecharConexao(con);
	}

}
