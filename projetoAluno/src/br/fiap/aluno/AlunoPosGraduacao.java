package br.fiap.aluno;

public class AlunoPosGraduacao extends Aluno {

	public double calcularMedia() {
		return prova1*0.4+prova2*0.6;
	}
}
