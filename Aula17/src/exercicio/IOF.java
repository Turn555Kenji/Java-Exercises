package exercicio;

public class IOF implements Imposto {

	@Override
	public double calcularImposto(double valor) {
		return (valor*0.06);
	}

}
