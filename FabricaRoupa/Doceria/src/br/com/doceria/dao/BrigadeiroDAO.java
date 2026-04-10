package br.com.doceria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.doceria.model.Brigadeiro;


public class BrigadeiroDAO {
	
	private Connection con = null;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public BrigadeiroDAO(Connection con) {
		setCon(con);
	}
	
	public String inserir(Brigadeiro brigadeiro) {
		String sql = "insert into brigadeiro(nomedoce, valor, pesochocolate) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, brigadeiro.getNomeDoce());
			ps.setDouble(2, brigadeiro.getValor());
			ps.setDouble(3, brigadeiro.getPesoChocolate());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Método deletar
	
	
	public String deletar() {
		String sql = "delete from brigadeiro";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Método deletar com where
	
	
	public String deletarWhere(Brigadeiro brigadeiro) {
		String sql = "delete from brigadeiro where valor = (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, brigadeiro.getValor());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}


}
