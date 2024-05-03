package encapsulamentodados;

public class ContaBancariaTeste {
	public static void main(String[] args) {
		/*ContaBancaria cb1 = new ContaBancaria(111, "Joaozinho");
		
		
		cb1.imprimirSaldo();
		cb1.depositar(500.00);
		cb1.imprimirSaldo();
		cb1.sacar(550.01);
		cb1.imprimirSaldo();
		cb1.depositar(500.00);
		cb1.imprimirSaldo();
		cb1.depositar(50.00);
		cb1.imprimirSaldo();
		
		cb1.sacar(330);
		cb1.imprimirSaldo();
		cb1.sacar(331);*/
		
		Banco banco1 = new Banco("abc", "def");
		
		banco1.criarNovaConta(123, "who");
		banco1.criarNovaConta(125, "e");
		banco1.criarNovaConta(451234, "ok");
		
		banco1.verificarSaldoConta(125);
		banco1.realizarDepositoConta(125, 500);
		banco1.verificarSaldoConta(123);
		banco1.verificarSaldoConta(125);
		banco1.realizarSaqueConta(125, 550);
		banco1.realizarSaqueConta(125, -1);
		
		banco1.realizarDepositoConta(0, 0);
		
		banco1.removerConta(125);
		banco1.removerConta(125);
	}
}
