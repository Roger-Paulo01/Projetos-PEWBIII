package br.com.doceria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.doceria.model.*;


public class BeijinhoDAO {
	
	private Connection con = null;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public BeijinhoDAO(Connection con) {
		setCon(con);
	}
	
	public String inserir(Beijinho doce) {
		String sql = "insert into prateleira_beijinho(nomedoce, beijinho_peso, beijinho_valor) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, doce.getNomeDoce());
			ps.setDouble(2, doce.getPesoCoco());
			ps.setDouble(3, doce.getValor());
			
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	// deletar
	
	public String deletar() {
		String sql = "delete from prateleira_beijinho";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	// deletar com where
	
	
	public String deletarWhere(Beijinho doce) {
		String sql = "delete from prateleira_beijinho where beijinho_valor =(?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, doce.getValor());
			
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}

	

