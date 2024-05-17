package exercicio1;

public class PessoaTeste {
	public static void main(String[] args) {
		//Aluno e Professor é um tipo de Pessoa, Endereco nao.
		Aluno aluno1 = new Aluno("aluno1", 15, "Sao Paulo");
		Aluno aluno2 = new Aluno("aluno2", 21, "bee");
		
		aluno1.imprimirDados();
		aluno1.imprimirDadosAluno();
		
		Professor professor1 = new Professor("professor1", 18, 29.50, 90, "A");
		
		professor1.imprimirDadosProfessor();
		professor1.imprimirDados();
		
		professor1.calcularSalario();
	}
	
	
}
