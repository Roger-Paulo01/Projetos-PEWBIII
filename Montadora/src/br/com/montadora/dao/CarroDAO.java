package br.com.montadora.dao;

import java.sql.Connection;

public class CarroDAO {
	private Connection con = null;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
}
