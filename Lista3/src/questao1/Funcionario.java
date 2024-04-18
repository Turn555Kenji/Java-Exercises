/*1. Uma empresa precisa automatizar o processo de cadastro de seus funcionários. Desenvolva
uma aplicação que realiza o processo de cadastro, sabendo que um funcionário possui seu
número de registro, nome completo, data de nascimento, sexo, setor em que trabalha,
telefone e endereço. O endereço é formado pelo nome da rua, número, bairro, cidade e
estado. Deve ser possível emitir um relatório com os dados do funcionário. Utilize uma classe
de teste para instanciar os funcionários, bem como atribuir valores aos seus dados e invocar
os métodos a fim de testá-los.*/

package questao1;

public class Funcionario {
	private int numeroRegistro;
	private String nomeCompleto;
	
	private int dia;
	private int mes;
	private int ano;
	
	private String sexo;
	private String setorTrabalho;
	private String telefone;
	
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Funcionario(	int numeroRegistro, String nomeCompleto, int dia, int mes, int ano, String sexo,
						String setorTrabalho, String telefone, String rua, int numero, String bairro, String cidade, String estado) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.nomeCompleto = nomeCompleto;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.sexo = sexo;
		this.setorTrabalho = setorTrabalho;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Funcionario: " + numeroRegistro + "\nNome Cmpleto: " + nomeCompleto + "\nData de Nascimento: " + dia
				+ "/" + mes + "/" + ano + "\nSexo: " + sexo + "\nSetor de Trabalho: " + setorTrabalho
				+ "\nTelefone: " + telefone + "\nRua:" + rua + "\nNumero: " + numero + "\nBairro: " + bairro + "\nCidade: "
				+ cidade + "\nEstado: " + estado;
	}
	
	
	
}
