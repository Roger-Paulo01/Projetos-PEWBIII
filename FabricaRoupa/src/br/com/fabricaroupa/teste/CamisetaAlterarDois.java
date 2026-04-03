package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CamisetaDAO;
import br.com.fabricaroupa.model.Camiseta;


public class CamisetaAlterarDois {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Camiseta camiseta = new Camiseta();
		CamisetaDAO camisetadao = new CamisetaDAO(con);////////

		
		camiseta.setTipoTecido("Seda");
		camiseta.setPeso(400);
		
		System.out.println(camisetadao.modificarDois(camiseta));
		Conexao.fecharConexao(con);
	}

}
