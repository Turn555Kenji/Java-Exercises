/*Construa a classe Data com os seguintes métodos:
• Construtor recebendo todos os parâmetros (dia, mês e ano) inteiros.
• Construtor recebendo como parâmetros valor para mês e ano, e então chamar o construtor anterior passando o dia com o valor default 1.
• Construtor recebendo somente o valor do dia.
	• Chamar o construtor completo, passando por parâmetro o valor do dia recebido, além dos valores default 1 para mês e 2010 para ano.
• Construtor não recebendo parâmetros.
	• Chamar o construtor completo, passando os valores:
		• Dia = 1;
		• Mês = 1;
		• Ano = 2010.
• Método toString( ) que retorna uma String com os valores de Data, no seguinte formato:
	• “dia/mês/ano”.*/

package sobrecargaconstrutores;

public class Data {
	int dia;
	int mes;
	int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int mes, int ano) {
		this(1, mes, ano);
	}
	
	public Data(int dia) {
		this(dia, 1, 2010);
	}
	
	public Data() {
		this(1, 1, 2010);
	}

	@Override
	public String toString() {
		return 	dia + "/" +
				mes + "/" +
				ano;
	}
	
	
}
