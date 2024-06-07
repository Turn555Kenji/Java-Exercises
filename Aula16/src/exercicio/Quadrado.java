package exercicio;

public final class Quadrado extends FormaGeometrica {
	
	private double lado;
	
	public Quadrado(Cor cor, double lado) {
		super(cor);
		this.lado = lado;
	}

	@Override
	public final double calcularArea() {
		// TODO Auto-generated method stub
		return (lado*lado);
	}

	@Override
	public final double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (lado*4);
	}

}
