package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDAO;
import br.com.fabricaroupa.model.Calca;


public class CalcaInserir {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Calca calca = new Calca();
		CalcaDAO calcadao = new CalcaDAO(con);////////

		calca.setTipoTecido("Couro dois");
		calca.setCor("Verde");
		calca.setPeso(400);
		calca.setQuantidadeBotao(2);
		System.out.println(calcadao.inserir(calca));
		Conexao.fecharConexao(con);
	}

}
