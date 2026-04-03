package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CamisetaDAO;
import br.com.fabricaroupa.model.Camiseta;


public class CamisetaInserir {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Camiseta camiseta = new Camiseta();
		CamisetaDAO camisetadao = new CamisetaDAO(con);////////

		camiseta.setTipoTecido("Couro dois");
		camiseta.setCor("Verde");
		camiseta.setPeso(30);
		camiseta.setTipoManga("Curta");
		System.out.println(camisetadao.inserir(camiseta));
		Conexao.fecharConexao(con);
	}

}
