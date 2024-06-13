package exercicio;

public class INSS implements Imposto {

	@Override
	public double calcularImposto(double valor) {
		return (valor*0.11);
	}

}
