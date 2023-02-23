package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando Coleções", 25));

		Aluno a1 = new Aluno("Rodrigo Turuni", 34762);
		Aluno a2 = new Aluno("Paulo Silveira", 65789);
		Aluno a3 = new Aluno("Mauricio Aniche", 34978);

		javaColecoes.matrucula(a1);
		javaColecoes.matrucula(a2);
		javaColecoes.matrucula(a3);

		System.out.println("Todos os alunos matriculados: ");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
			
			
		//javaColecoes.getAlunos().forEach(a -> {
		//	System.out.println(a);
		//});
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno paulo = new Aluno("Paulo Silveira", 65789);
		System.out.println("E esse Paulo está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(paulo));
		System.out.println("O a2 equals ao Paulo?");
		System.out.println(a2.equals(paulo));
		
		// Obrigatoriamene o seguinte é true
		
		System.out.println(a2.hashCode() == paulo.hashCode());
	}

}
