package br.com.doceria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.doceria.model.Beijinho;



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
	
	
	//Método deletar
	
	
	public String deletar() {
		String sql = "delete from beijinho";
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
	
	
		public String deletarWhere(Beijinho beijinho) {
			String sql = "delete from beijinho where valor = (?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setDouble(1, beijinho.getValor());
				if (ps.executeUpdate() > 0) {
					return "Deletado com sucesso";
				} else {
					return "Erro ao deletar";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}
	
	
		public String alterar(Beijinho beijinho) {
			String sql = "update beijinho set valor = ? where nomedoce = ?";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setDouble(1, beijinho.getValor());
				ps.setString(2, beijinho.getNomeDoce());
				
				if (ps.executeUpdate() > 0) {
					return "Alterado com sucesso";
				} else {
					return "Erro ao alterar";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}

		
		//Selecionar

		public ArrayList<Beijinho> selecionar() {
			String sql = "select * from beijinho";
			ArrayList<Beijinho> retornarBeijinho = new ArrayList<Beijinho>();
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				if (rs != null) {
					while (rs.next()) {
						Beijinho beijinho = new Beijinho();
						beijinho.setNomeDoce(rs.getString(1));
						beijinho.setValor(rs.getDouble(2));
						beijinho.setPesoCoco(rs.getDouble(3));
					
						retornarBeijinho.add(beijinho);
					}
					return retornarBeijinho;
				} else {
					return null;
				}
			} catch (SQLException e) {
				return null;
			}	
			//return retornarBeijinho;
		} //Fim do método selecionar
	}

