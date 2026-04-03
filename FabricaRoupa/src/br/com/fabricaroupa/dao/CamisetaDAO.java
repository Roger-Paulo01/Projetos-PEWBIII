package br.com.fabricaroupa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricaroupa.model.Camiseta;


public class CamisetaDAO {
	
	private Connection con = null;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public CamisetaDAO(Connection con) {
		setCon(con);
	}
	
	public String inserir(Camiseta camiseta) {
		String sql = "insert into camiseta(tipotecido, cor, peso, tipomanga) values (?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, camiseta.getTipoTecido());
			ps.setString(2, camiseta.getCor());
			ps.setDouble(3, camiseta.getPeso());
			ps.setString(4, camiseta.getTipoManga());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Alterar um
	
	public String modificar(Camiseta camiseta) {
		String sql = "update camiseta set cor = ? where peso = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			ps.setString(1, camiseta.getCor());
			ps.setDouble(2, camiseta.getPeso());
			
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	
	//Alterar dois
	
	public String modificarDois(Camiseta camiseta) {
		String sql = "update camiseta set tipotecido = ? where peso = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			ps.setString(1, camiseta.getTipoTecido());
			ps.setDouble(2, camiseta.getPeso());
			
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
