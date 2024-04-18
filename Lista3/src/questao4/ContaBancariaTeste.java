package questao4;

public class ContaBancariaTeste {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(123, 555);
		
		conta.depositar(500);
		conta.sacar(380);
		conta.sacar(1000);
		conta.mostrarSaldo();
	}
}
