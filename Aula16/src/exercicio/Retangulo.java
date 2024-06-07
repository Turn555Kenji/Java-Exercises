package exercicio;

public final class Retangulo extends FormaGeometrica {
	
	private double altura;
	private double base;
	
	public Retangulo(Cor cor, double altura, double base) {
		super(cor);
		this.altura = altura;
		this.base = base;
	}

	@Override
	public final double calcularArea() {
		// TODO Auto-generated method stub
		return (altura*base);
	}

	@Override
	public final double calcularPerimetro() {
		// TODO Auto-generated method stub
		return ((altura*2)+(base*2));
	}

}
