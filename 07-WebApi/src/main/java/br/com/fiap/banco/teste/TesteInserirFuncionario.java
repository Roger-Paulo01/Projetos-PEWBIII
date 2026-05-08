package br.com.fiap.banco.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.banco.dao.FuncionarioDao;
import br.com.fiap.banco.factory.ConexaoFactory;
import br.com.fiap.banco.factory.ConnectionFactory;
import br.com.fiap.banco.model.Funcionario;


public class TesteInserirFuncionario {

	public static void main(String[] args) {
		Connection con = ConnectionFactory.abrirConexao();
		
		FuncionarioDao funcionarioDao = new FuncionarioDao(con);
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Rafael Ronqui");
		funcionario.setSalario(42424);
		try {
			funcionarioDao.cadastrar(funcionario);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ConnectionFactory.fecharConexao(con);
		
	}
}
