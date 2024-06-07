package exercicio;

public abstract class FormaGeometrica {
	
	protected Cor cor;
	
	public FormaGeometrica(Cor cor) {
		this.cor = cor;
	}
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
}
