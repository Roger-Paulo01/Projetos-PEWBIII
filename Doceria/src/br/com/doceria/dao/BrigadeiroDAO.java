package br.com.doceria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.doceria.model.*;


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
	
	public String inserir(Brigadeiro doce) {
		String sql = "insert into prateleira(nomedoce, peso, valor) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, doce.getNomeDoce());
			ps.setDouble(2, doce.getPesoChocolate());
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
			String sql = "delete from prateleira";
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
		
		// deletar com condição (where)
		
		
		public String deletarWhere(Brigadeiro doce) {
			String sql = "delete from prateleira where valor =(?)";
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

