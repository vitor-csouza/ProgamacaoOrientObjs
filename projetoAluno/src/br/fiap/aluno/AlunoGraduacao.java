package br.fiap.aluno;

public class AlunoGraduacao extends Aluno{
	
	private String curso;
	private double trabalho;
	
	public AlunoGraduacao(long rm, String nome, double prova1, double prova2, String curso, double trabalho) {
		super(rm, nome, prova1, prova2);
		this.curso = curso;
		this.trabalho = trabalho;
	}
	
	public double calcularMedia() {
		return (prova1+prova2)/2*0.7+trabalho*03;
	}


}
