package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDAO;
import br.com.fabricaroupa.model.Calca;


public class CalcaAlterarDois {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Calca calca = new Calca();
		CalcaDAO calcadao = new CalcaDAO(con);////////

		calca.setTipoTecido("Plástico");
		
		calca.setPeso(400);
		
		System.out.println(calcadao.modificarDois(calca));
		Conexao.fecharConexao(con);
	}

}
