package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDAO;
import br.com.fabricaroupa.model.Calca;


public class CalcaAlterar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Calca calca = new Calca();
		CalcaDAO calcadao = new CalcaDAO(con);////////


		calca.setCor("Azul");
		calca.setQuantidadeBotao(2);
		System.out.println(calcadao.modificar(calca));
		Conexao.fecharConexao(con);
	}

}
