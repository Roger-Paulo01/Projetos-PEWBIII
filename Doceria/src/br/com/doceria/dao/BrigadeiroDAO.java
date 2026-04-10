package br.com.doceria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

	
	//Alterar set = valor -- where = nomedoce
	
	public String alterar(Brigadeiro brigadeiro) {
		String sql = "update brigadeiro set valor = ? where nomedoce = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			ps.setDouble(1, brigadeiro.getValor());
			ps.setString(2, brigadeiro.getNomeDoce());
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Selecionar

	public ArrayList<Brigadeiro> selecionar() {
		String sql = "select * from brigadeiro";
		ArrayList<Brigadeiro> retornarBrigadeiro = new ArrayList<Brigadeiro>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Brigadeiro brigadeiro = new Brigadeiro();
					brigadeiro.setNomeDoce(rs.getString(1));
					brigadeiro.setValor(rs.getDouble(2));
					brigadeiro.setPesoChocolate(rs.getDouble(3));
				
					retornarBrigadeiro.add(brigadeiro);
				}
				return retornarBrigadeiro;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}	
		//return retornarBrigadeiro;
	} //Fim do método selecionar
}
