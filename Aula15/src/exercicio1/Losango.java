package exercicio1;

public final class Losango extends Quadrilatero {
	private double diagonal1;
	private double diagonal2;
	
	protected Losango(double diagonal1, double diagonal2) {
		super();
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}

	@Override
	public final void calcularArea() {
		System.out.println((this.diagonal1*this.diagonal2)/2);
	}
}
