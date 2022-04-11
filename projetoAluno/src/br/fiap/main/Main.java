package br.fiap.main;

import br.fiap.aluno.Aluno;
import br.fiap.aluno.AlunoFundamental;
import br.fiap.aluno.AlunoGraduacao;
import br.fiap.aluno.AlunoPosGraduacao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno []  alunos = new Aluno[10];

		alunos[0] = new AlunoFundamental();
		alunos[1] = new AlunoGraduacao();
		alunos[2] = new AlunoPosGraduacao();
		
		

	}

}
