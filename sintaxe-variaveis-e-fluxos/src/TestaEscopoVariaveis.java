
public class TestaEscopoVariaveis {

	public static void main(String[] args) {
		
		int idade = 20;
		int quantidadePessoas = 3;
		//boolean acompanhado = quantidadePessoas >=2;
		
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
			
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("sajá bem vindo");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}
	}

}