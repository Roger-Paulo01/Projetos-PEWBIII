package br.com.fabricaroupa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fabricaroupa.model.Calca;


public class CalcaDAO {
	
	private Connection con = null;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public CalcaDAO(Connection con) {
		setCon(con);
	}
	
	public String inserir(Calca calca) {
		String sql = "insert into calca(tipotecido, cor, peso, quantidadebotao) values (?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, calca.getTipoTecido());
			ps.setString(2, calca.getCor());
			ps.setDouble(3, calca.getPeso());
			ps.setInt(4, calca.getQuantidadeBotao());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Update
	

	public String modificar(Calca calca) {
		String sql = "update calca set cor = ? where quantidadebotao = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			ps.setString(1, calca.getCor());
			
			ps.setInt(2, calca.getQuantidadeBotao());
			
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	//UpdateDois
	

	public String modificarDois(Calca calca) {
		String sql = "update calca set tipotecido = ? where peso = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			ps.setString(1, calca.getTipoTecido());
			
			ps.setDouble(2, calca.getPeso());
			
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Selecionar
	
	public ArrayList<Calca> selecionar() {
		String sql = "select * from calca";
		ArrayList<Calca> retornarCalca = new ArrayList<Calca>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Calca calca = new Calca();
					calca.setTipoTecido(rs.getString(1));
					calca.setCor(rs.getString(2));
					calca.setPeso(rs.getDouble(3));
					calca.setQuantidadeBotao(rs.getInt(4));
					retornarCalca.add(calca);
				}
				return retornarCalca;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}	
		//return retornarCalca;
	} //Fim do método selecionar
	

}
