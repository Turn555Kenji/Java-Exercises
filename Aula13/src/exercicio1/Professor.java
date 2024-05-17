package exercicio1;

public class Professor extends Pessoa {
	private double salarioBase;
	private double salarioTitulacao;
	
	public Professor(String nome, int idade, double salarioBase, double salarioTitulacao, String local) {
		super(nome, idade, local);
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
	}
	
	public double calcularSalario(){
		double salario = this.salarioBase + this.salarioTitulacao;
		System.out.println("Salario: " + salario + "\n");
		return salario;
	}
	
	public void imprimirDadosProfessor() {
		super.imprimirDados();	//se fosse imprimirDadosProfessor na Pessoa, ia funcionar tambem.
		System.out.println(	"Salario base: " + this.salarioBase + "\n" +
							"Salario titulacao: " + this.salarioTitulacao + "\n");
		
		//Could also use this.nome and this.idade directly
	}
}
