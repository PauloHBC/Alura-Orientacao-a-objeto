package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Rodrigo Turiri");
		alunos.add("Paulo Silveira");
		alunos.add("Paulo Henrique");
		alunos.add("Sergio Lopes");
		alunos.add("Andre Beiçola");
		alunos.add("Wesley");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Wesley");
		System.out.println(pauloEstaMatriculado);

		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
		System.out.println(alunos);
	}

}
