package encapsulamentodados;

public class ContaBancariaTeste {
	public static void main(String[] args) {
		ContaBancaria cb1 = new ContaBancaria(111, "Joaozinho");
		
		
		cb1.imprimirSaldo();
		cb1.depositar(500.00);
		cb1.imprimirSaldo();
		cb1.sacar(550.01);
		cb1.imprimirSaldo();
		/*cb1.depositar(500.00);
		cb1.imprimirSaldo();
		cb1.depositar(50.00);
		cb1.imprimirSaldo();
		
		cb1.sacar(330);
		cb1.imprimirSaldo();
		cb1.sacar(331);*/
	}
}
