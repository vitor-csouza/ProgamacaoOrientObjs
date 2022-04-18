package br.fiap.main;

import br.fiap.aluno.Aluno;
import br.fiap.aluno.AlunoFundamental;
import br.fiap.aluno.AlunoGraduacao;
import br.fiap.aluno.AlunoPosGraduacao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno []  alunos = new Aluno[10];

		alunos[0] = new AlunoFundamental(1, "Ana", 10, 10, 2);
		alunos[1] = new AlunoGraduacao(50, "Pedro", 9, 8, "SI", 7);
		alunos[2] = new AlunoPosGraduacao(100, "Maria", 9, 10);
		
		for(int i=0;i<alunos.length;i++) {
			System.out.println(alunos[i]);
			System.out.println();
		}

	}

}
