package br.fiap.aluno;

public class AlunoGraduacao extends Aluno{
	
	private String curso;
	private double trabalho;
	
	public double calcularMedia() {
		return ((prova1+prova2)/2)*0.7+trabalho*03;
	}

}
