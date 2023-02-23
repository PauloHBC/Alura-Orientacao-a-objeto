package br.com.alura;

public class TestaBuscaAlunos {

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
		
		System.out.println("Quem é o aluno com matricula 34762?");
		Aluno aluno = javaColecoes.buscaMatriculado(34762);
		System.out.println("Aluno: " + aluno);
	}

}
