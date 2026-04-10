package br.com.fabricaroupa.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CamisetaDAO;
import br.com.fabricaroupa.model.Camiseta;

public class CamisetaSelecionar {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();

		CamisetaDAO camisetadao = new CamisetaDAO(con);////////

		// Listar
		ArrayList<Camiseta> lista = camisetadao.selecionar();

		if (lista != null) {
			for (Camiseta camiseta : lista) {
				System.out.print(camiseta.getTipoTecido() + " ");
				System.out.print(camiseta.getCor() + " ");
				System.out.print(camiseta.getPeso() + " ");
				System.out.print(camiseta.getTipoManga() + "\n");
			}
		}

		Conexao.fecharConexao(con);
	}

}
