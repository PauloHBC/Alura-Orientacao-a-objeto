
public class TesteFuncionario {
	public static void main(String[] args) {
		
		EditorDeVideo nico = new EditorDeVideo();
		nico.setNome("Nico Steppot");
		nico.setCpf("2223335564-9");
		nico.setSalario(3000.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getSalario());
		System.out.println(nico.getBonificacao());
	
		
		Gerente g1 = new Gerente();
		g1.setNome("Paulo");
		g1.setCpf("135147896-7");
		g1.setSalario(5000.0);
		
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());

	}
}
