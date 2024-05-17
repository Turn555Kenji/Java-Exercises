package exercicio1;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected Endereco endereco;
	
	public Pessoa(String nome, int idade, String local) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = new Endereco(local);
	}

	public void imprimirDados() {
		System.out.print(	"Nome: " + this.nome + "\n" +
							"Idade: " + this.idade + "\n" +
							"Endereco: " + this.endereco.getLocal() + "\n");
	}
}
