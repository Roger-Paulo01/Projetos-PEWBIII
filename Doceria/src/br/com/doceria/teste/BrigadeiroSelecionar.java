package br.com.doceria.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.doceria.conexao.Conexao;
import br.com.doceria.dao.BrigadeiroDAO;
import br.com.doceria.model.Brigadeiro;




public class BrigadeiroSelecionar {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

	
		BrigadeiroDAO brigadeirodao = new BrigadeiroDAO(con);////////

		// Listar
				ArrayList<Brigadeiro> lista = brigadeirodao.selecionar();

				if (lista != null) {
					for (Brigadeiro brigadeiro : lista) {
						System.out.print(brigadeiro.getNomeDoce() + " ");
						System.out.print(brigadeiro.getValor() + " ");
						System.out.print(brigadeiro.getPesoChocolate() + "\n");
					}
				}

				Conexao.fecharConexao(con);
			}

		}
