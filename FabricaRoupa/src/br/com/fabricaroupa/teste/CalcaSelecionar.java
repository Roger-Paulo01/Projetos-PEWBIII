package br.com.fabricaroupa.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDAO;
import br.com.fabricaroupa.model.Calca;


public class CalcaSelecionar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		
		CalcaDAO calcadao = new CalcaDAO(con);////////

		//Listar
		ArrayList<Calca> lista = calcadao.selecionar();
		
		if(lista != null) {
			for (Calca calca: lista) {
				System.out.print(calca.getTipoTecido() + " ");
				System.out.print(calca.getCor() + " ");
				System.out.print(calca.getPeso()  + " ");
				System.out.print(calca.getQuantidadeBotao()  + "\n");
			}
		}

		Conexao.fecharConexao(con);
	}

}
