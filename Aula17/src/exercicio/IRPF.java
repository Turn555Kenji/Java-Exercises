package exercicio;

public class IRPF implements Imposto {

	@Override
	public double calcularImposto(double valor) {
		return (valor*0.075);
	}

}
