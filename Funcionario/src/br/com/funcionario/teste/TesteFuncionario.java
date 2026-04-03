package br.com.funcionario.teste;

import javax.swing.JOptionPane;

import br.com.funcionario.model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("oi " );
		Funcionario func = new Funcionario();
		
		func.setNome(JOptionPane.showInputDialog("digite o nome:"));
		func.setIdade(Integer.parseInt(JOptionPane.showInputDialog("digite o idade:")));
		func.setSalario(Double.parseDouble(JOptionPane.showInputDialog("digite o salario:")));
		
		System.out.printf(func.getNome() +" de "+ func.getIdade()+ " de " + func.getSalario());
	}

}
