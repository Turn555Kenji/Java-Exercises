package exercicio;

public final class Circulo extends FormaGeometrica {

	protected double raio;
	
	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public final double calcularArea() {
		return (3.14*raio*raio);
	}

	@Override
	public final double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (2*raio*3.14);
	}

}
