package br.com.doceria.teste;

import java.sql.Connection;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BeijinhoDAO;
import br.com.doceria.model.Beijinho;



public class BeijinhoAlterar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Beijinho beijinho = new Beijinho();
		BeijinhoDAO beijinhodao = new BeijinhoDAO(con);////////

		beijinho.setNomeDoce("Beijinho light");
		beijinho.setValor(22);
		beijinho.setPesoCoco(20);
		
		System.out.println(beijinhodao.inserir(beijinho));
		Conexao.fecharConexao(con);
	}

}
