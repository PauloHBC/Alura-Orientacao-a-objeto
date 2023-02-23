
public abstract class Funcionario { // nao pode mais instanciar dessa classe pq é abstrata
	
	
	private String nome;
	private String cpf;
	private double salario;
	
	public abstract double getBonificacao(); //metodo sem corpo
	//nao ha implementação
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
