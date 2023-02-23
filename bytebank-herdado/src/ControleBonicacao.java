public class ControleBonicacao {

    private double soma;

    public void registra(Funcionario f) {
    	double boni = f.getBonificacao();
        this.soma += f.getBonificacao();
    }

    public double getSoma() {
        return soma;
    }

}