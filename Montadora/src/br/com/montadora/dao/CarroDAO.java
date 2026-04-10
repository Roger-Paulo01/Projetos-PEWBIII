package br.com.montadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.doceria.model.Beijinho;

public class CarroDAO {
	private Connection con = null;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public String inserir(Beijinho beijinho) {
		String sql = "insert into beijinho(nomedoce, valor, pesococo) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, beijinho.getNomeDoce());
			ps.setDouble(2, beijinho.getValor());
			ps.setDouble(3, beijinho.getPesoCoco());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
