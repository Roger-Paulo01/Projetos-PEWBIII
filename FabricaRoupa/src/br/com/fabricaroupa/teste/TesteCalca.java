package br.com.fabricaroupa.teste;

import br.com.fabricaroupa.model.Calca;

public class TesteCalca {

	public static void main(String[] args) {
		
		Calca calca = new Calca();
		
		calca.setTipoTecido("Jeans");
		calca.setCor("Azul");
		calca.setPeso(300);
		calca.setQuantidadeBotao(1);
		
		System.out.println("Características da "
				+ "calça:"
				+ "\nTipo do tecido: "
				+ calca.getTipoTecido()
				+ "\ncor: "
				+ calca.getCor()
				+ "\npeso: "
				+ calca.getPeso()
				+ "\nquantidade de botão: "
				+ calca.getQuantidadeBotao()
				
				
				);

	}

}
