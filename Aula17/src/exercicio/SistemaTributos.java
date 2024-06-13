package exercicio;

public class SistemaTributos {
	private double valor;
	private Imposto imposto;

	public SistemaTributos(double valor, Imposto imposto) {
		this.valor = valor;
		this.imposto = imposto;
	}
	
	public double retornarSoma() {
		return (this.valor+this.imposto.calcularImposto(this.valor));
	}
	
}
