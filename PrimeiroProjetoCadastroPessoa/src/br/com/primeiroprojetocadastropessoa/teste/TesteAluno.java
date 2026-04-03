package br.com.primeiroprojetocadastropessoa.teste;

import br.com.primeiroprojetocadastropessoa.model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Rafael");
		aluno.setIdade(40);
		aluno.setRm(1234);
		
		System.out.println("Nome do aluno: " +
				aluno.getNome() +
				"\nidade do aluno: " +
				aluno.getIdade() +
				"\nRM do aluno: " +
				aluno.getRm()
				);
	}
}
