package br.com.doceria.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BeijinhoDAO;
import br.com.doceria.model.Beijinho;




public class BeijinhoSelecionar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

	
		BeijinhoDAO beijinhodao = new BeijinhoDAO(con);////////

		// Listar
				ArrayList<Beijinho> lista = beijinhodao.selecionar();

				if (lista != null) {
					for (Beijinho beijinho : lista) {
						System.out.print(beijinho.getNomeDoce() + " ");
						System.out.print(beijinho.getValor() + " ");
						System.out.print(beijinho.getPesoCoco() + "\n");
					}
				}

				Conexao.fecharConexao(con);
			}

		}
