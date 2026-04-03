package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CamisetaDAO;
import br.com.fabricaroupa.model.Camiseta;


public class CamisetaAlterar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Camiseta camiseta = new Camiseta();
		CamisetaDAO camisetadao = new CamisetaDAO(con);////////

		
		camiseta.setCor("Vermelho");
		camiseta.setPeso(30);
		
		System.out.println(camisetadao.modificar(camiseta));
		Conexao.fecharConexao(con);
	}

}
