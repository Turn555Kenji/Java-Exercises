/*Desenvolva um sistema para manter cadastro de
cliente de um determinado estabelecimento. O cliente
é identificado por: código, nome, data de nascimento e
estado civil. O estado civil pode ser: solteiro, casado, divorciado e viúvo.*/

package exercicio1;

public class Cliente {
	private int codigo;
	private String nome;
	private int dataNascimento;
	private EstadoCivil status;
	
	public Cliente(int codigo, String nome, int dataNascimento, EstadoCivil status) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", status="
				+ status + "]";
	}
	
	
}
