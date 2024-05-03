package encapsulamentodados;

public class ContaBancaria {
	
	private int numeroConta;
	private String titular;
	private double saldo;
	
	/*public ContaBancaria(int numeroConta, String titular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	} //utilizado source*/
	
	public ContaBancaria(int numeroConta, String titular) {
		
		this.numeroConta = numeroConta;
		this.setTitular(titular);
		this.saldo = 0.00;
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
		
		//this.calcularRendimento();
	}
	
	public void imprimirSaldo() {
		System.out.println("Numero da Conta: " + this.numeroConta);
		System.out.println("Nome do Titular: " + this.titular);
		System.out.println("Saldo: R$" + this.saldo + "\n");
	}
	
	/*private void calcularRendimento() {
		this.saldo += this.saldo * 0.10;
	}*/

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if(titular!=" ")
			this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
