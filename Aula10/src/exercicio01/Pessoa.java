package exercicio01;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	private String estadoCivil;
	private Endereco endereco;
	
	
	public Pessoa(String nome, String dataNascimento, String sexo, String email, String estadoCivil, String logradouro, int numero, String bairro, String cidade, String uf) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, uf);
	}
	
	/*public Pessoa(String nome, String dataNascimento, String sexo, String email, String estadoCivil, Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
	}*/
	//Endereco precisa ser declarado antes na main.

	public void imprimirDados() {
		System.out.println(this.nome);
		System.out.println(this.dataNascimento);
		System.out.println(this.sexo);
		System.out.println(this.email);
		System.out.println(this.estadoCivil);
		
		System.out.println(this.endereco.logradouro);
		System.out.println(this.endereco.numero);
		System.out.println(this.endereco.bairro);
		System.out.println(this.endereco.cidade);
		System.out.println(this.endereco.uf);
	}

}
