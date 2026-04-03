package br.com.fabricaroupa.teste;

import br.com.fabricaroupa.model.Camiseta;

public class TesteCamiseta {

	public static void main(String[] args) {
		
		Camiseta camiseta = new Camiseta();
		
		camiseta.setTipoTecido("Jeans");
		camiseta.setCor("Azul");
		camiseta.setPeso(300);
		camiseta.setTipoManga("Curta");
		
		System.out.println("Características da "
				+ "calça:"
				+ "\nTipo do tecido: "
				+ camiseta.getTipoTecido()
				+ "\ncor: "
				+ camiseta.getCor()
				+ "\npeso: "
				+ camiseta.getPeso()
				+ "\ntipo da manga: "
				+ camiseta.getTipoManga()
				);
	}
}
