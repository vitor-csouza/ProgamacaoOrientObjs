package br.fiap.aluno;

public abstract class Aluno {
	
	//atributos que serão compartilhados
	protected long rm;
	protected String nome;
	protected double prova1;
	protected double prova2;
	
	public Aluno(long rm, String nome, double prova1, double prova2) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.prova1 = prova1;
		this.prova2 = prova2;
	}

	public abstract double calcularMedia();
	
	@Override
	public String toString() {
		String mensagem = "";
		mensagem += "RM: " + rm + "\n";
		mensagem += "Nome: " + nome + "\n";
		mensagem += "Média: " + calcularMedia() + "\n";
		return mensagem;
	}

}
