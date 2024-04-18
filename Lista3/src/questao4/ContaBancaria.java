/*4. Um banco deseja automatizar o processo nas contas de seus clientes. Sabendo que uma
conta é formada por um número da agência, número da conta e saldo, e devem ser
inicializados no momento da criação da conta. Desenvolva um sistema para criar e realizar
transações (saque, depósito e verificação de saldo) em uma conta. Para isso, no momento da
invocação do método responsável por realizar o saque e/ou depósito, passe por parâmetro o
valor a ser sacado e/ou depositado. Sabe-se que um saque não pode ser autorizado se o
valor a ser sacado superar o valor de saldo. Além disso, o saldo não pode ser alterado de
outra maneira que não seja pelos métodos sacar e depositar.*/

package questao4;

public class ContaBancaria {
	
	private int numeroAgencia;
	private int numeroConta;
	private double saldo;
	
	
	public ContaBancaria(int numeroAgencia, int numeroConta) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}

	public void sacar(double valor) {
		if(valor > this.saldo) {
			System.out.println("Saldo insuficiente");
		}
		else {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso");
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Deposito feito com sucesso");
	}
		
	public void mostrarSaldo() {
		System.out.println("Saldo: " + this.saldo);
	}
}
