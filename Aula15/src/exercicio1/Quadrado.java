package exercicio1;

public final class Quadrado extends Quadrilatero {
	private double lado;
	
	
	
	protected Quadrado(double lado) {
		super();
		this.lado = lado;
	}



	@Override
	public final void calcularArea() {
		System.out.println(this.lado*this.lado);
	}
}
