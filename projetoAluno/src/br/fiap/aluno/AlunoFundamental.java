package br.fiap.aluno;

public class AlunoFundamental extends Aluno {
	
	//atributos específicos da classe
	private int serie;

	public AlunoFundamental(long rm, String nome, double prova1, double prova2, int serie) {
		super(rm, nome, prova1, prova2);
		this.serie = serie;
	}

	public double calcularMedia() {
		return (prova1+prova2)/2;
	}
}
