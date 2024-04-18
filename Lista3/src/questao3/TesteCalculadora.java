package questao3;

public class TesteCalculadora {
	public static void main(String[] args) {
		Calculadora dispositivo = new Calculadora("Alguma marca", "1", "Quantica", 64);
		
		System.out.println(dispositivo.soma(1, 2));
		System.out.println(dispositivo.sub(3.5, 2.3));
		System.out.println(dispositivo.mult(9, 9.21));
		System.out.println(dispositivo.div(1, 4));
	}
}
