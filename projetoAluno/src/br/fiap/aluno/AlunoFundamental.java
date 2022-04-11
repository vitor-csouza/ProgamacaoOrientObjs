package br.fiap.aluno;

public class AlunoFundamental extends Aluno {
	
	//atributos específicos da classe
	private int serie;

	public double calcularMedia() {
		return (prova1+prova2)/2;
	}
}
