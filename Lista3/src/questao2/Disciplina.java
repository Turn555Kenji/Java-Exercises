/*2. O Departamento Acadêmico de Informática deseja automatizar o processo de criação de
disciplinas para os seus cursos. Desenvolva um sistema que seja capaz de criar novas
disciplinas. Em uma conversa com os coordenadores de cursos foi possível identificar que
uma disciplina é constituída de seu código, nome, modalidade (Presencial ou A Distância),
carga horária (em horas) e conteúdo programático. Cada disciplina pode exibir um relatório
(uma espécie de resumo), ilustrando ao usuário do sistema os valores de seus dados. Para
efetuar a instanciação de cada disciplina, atribuição de valores e invocação dos métodos,
utilize uma classe de teste.*/

package questao2;

public class Disciplina {
	private String codigo;
	private String nome;
	private String modalidade;
	private int cargaHoraria;
	private String conteudoProgramatico;
	
	public Disciplina(String codigo, String nome, String modalidade, int cargaHoraria, String conteudoProgramatico) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.setModalidade(modalidade);
		this.cargaHoraria = cargaHoraria;
		this.conteudoProgramatico = conteudoProgramatico;
	}
	
	public void setModalidade(String modalidade) {
		if(modalidade == "Presencial" || modalidade == "presencial" || modalidade == "Distancia" || modalidade == "distancia")
			this.modalidade = modalidade;
	}

	@Override
	public String toString() {
		return "Codigo da disciplina: " + codigo + "\nNome: " + nome + "\nModalidade: " + modalidade + "\nCarga Horaria: "
				+ cargaHoraria + "\nCounteudo Pragmatico: " + conteudoProgramatico;
	}

	private String getConteudoProgramatico() {
		return conteudoProgramatico;
	}

	private void setConteudoProgramatico(String conteudoProgramatico) {
		this.conteudoProgramatico = conteudoProgramatico;
	}

	private String getCodigo() {
		return codigo;
	}

	private String getNome() {
		return nome;
	}

	private int getCargaHoraria() {
		return cargaHoraria;
	}
	
	
}
