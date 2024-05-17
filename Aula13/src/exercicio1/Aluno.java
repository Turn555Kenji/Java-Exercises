package exercicio1;

public class Aluno extends Pessoa {
	private String curso;

	public Aluno(String nome, int idade, String local) {
		super(nome, idade, local);
		this.curso = "Nenhum";
	}
	
	public void realizarMatricula(String curso) {
		this.curso = curso;
		System.out.println("Matricula realizada");
	}
	
	public void imprimirDadosAluno() {
		super.imprimirDados();
		System.out.println("Curso: " + this.curso + "\n");
		
		//Could also use this.nome and this.idade directly
	}
}
