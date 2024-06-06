package exercicio1;

public final class Retangulo extends Quadrilatero {
	private double altura;
	private double base;
	
	
	
	protected Retangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}



	@Override
	public final void calcularArea() {
		System.out.println(this.altura*this.base);
	}
}
