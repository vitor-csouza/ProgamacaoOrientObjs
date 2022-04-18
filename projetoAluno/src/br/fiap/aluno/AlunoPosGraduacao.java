package br.fiap.aluno;

public class AlunoPosGraduacao extends Aluno {

	public AlunoPosGraduacao(long rm, String nome, double prova1, double prova2) {
		super(rm, nome, prova1, prova2);
	}

	public double calcularMedia() {
		return prova1*0.4+prova2*0.6;
	}
}
