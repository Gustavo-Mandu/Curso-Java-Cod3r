package oo.composicao;

import java.util.ArrayList;

public class Aluno {

	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>();

	Aluno(String nome) {
		this.nome = nome;
		// this.cursos = new ArrayList<Curso>(); FINAL!!!
	}

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	Curso obterCursoPorNome(String nome) {
		for (Curso curso : cursos) {
			if (curso.nome.equals(nome)) {
				return curso;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	
	
	
	
	
	
}