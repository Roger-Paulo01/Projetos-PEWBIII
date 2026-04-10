package br.com.doceria.teste;

import java.sql.Connection;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BrigadeiroDAO;
import br.com.doceria.model.Brigadeiro;



public class BrigadeiroInserir {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Brigadeiro brigadeiro = new Brigadeiro();
		BrigadeiroDAO brigadeirodao = new BrigadeiroDAO(con);////////

		brigadeiro.setNomeDoce("Brigadeiro light");
		brigadeiro.setValor(22);
		brigadeiro.setPesoChocolate(22);
		
		System.out.println(brigadeirodao.inserir(brigadeiro));
		Conexao.fecharConexao(con);
	}

}
