package br.com.primeiroprojetocadastropessoa.teste;

import br.com.primeiroprojetocadastropessoa.model.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		
		Professor professor = new Professor();
		
		professor.setNome("Rafael");
		professor.setIdade(40);
		professor.setSalario(1000);
		
		System.out.println("Nome do professor: " +
				professor.getNome() + 
				"\nidade do professor: " +
				professor.getIdade() +
				"\nsalário do professor:" +
				professor.getSalario()
				);
	}
}
