package encapsulamentodados;

import java.util.List;
import java.util.ArrayList;

public class Banco {
	private String cnpj;
	private String nomeBanco;
	private List <ContaBancaria> contas;
	
	public Banco(String cnpj, String nomeBanco) {
		super();
		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contas = new ArrayList<ContaBancaria>();
	}
	
	public void criarNovaConta(int numeroConta, String titular) {
		this.contas.add(new ContaBancaria(numeroConta, titular));
		
	}
	
	public void verificarSaldoConta(int numeroConta) {
		for(ContaBancaria contaBancaria : contas) {
			if(contaBancaria.getNumeroConta() == numeroConta) {
				contaBancaria.imprimirSaldo();
				return;
			}
		}
		System.out.println("Conta Inexistente");
	}
	
	public void realizarSaqueConta(int numeroConta, double valor) {
		if(valor < 0) {
			System.out.println("Por favor insira valor valido");
			return;
		}
		for(ContaBancaria contaBancaria : contas) {
			if(contaBancaria.getNumeroConta() == numeroConta) {
				contaBancaria.sacar(valor);
				return;
			}
		}
		System.out.println("Conta Inexistente");
	}
	
	public void realizarDepositoConta(int numeroConta, double valor) {
		if(valor < 0) {
			System.out.println("Por favor insira valor valido");
			return;
		}
		for(ContaBancaria contaBancaria : contas) {
			if(contaBancaria.getNumeroConta() == numeroConta) {
				contaBancaria.depositar(valor);
				return;
			}
		}
		System.out.println("Conta Inexistente");
	}
	
	public void removerConta(int numeroConta) {
		for(int i=0;i!=this.contas.size();i++) {
			ContaBancaria contaBancaria = this.contas.get(i);
			if(contaBancaria.getNumeroConta() == numeroConta) {
				this.contas.remove(i); //Poderia utilizar a outra logica
				System.out.println("Conta removida");
				return;
			}
		}
		System.out.println("Conta Inexistente");
	}
}