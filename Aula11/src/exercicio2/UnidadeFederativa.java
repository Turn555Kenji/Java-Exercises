/*Implemente um sistema para manter os dados de uma
empresa. A empresa é identificada pela sua Razão Social, cnpj e
unidade federativa que encontra-se sua matriz. 

A unidade federativa será a classe enumeration e em cada indicador
deverá armazenar os valores: nome da unidade federativa, sigla
e nome da capital. 

Cadastre apenas as unidades federativas da
região sul e sudeste. Implemente uma classe de teste para instanciar as empresas e
atribuir os valores a elas, bem como imprimir seus dados em console.*/

package exercicio2;

public enum UnidadeFederativa {
	PARANA("Parana", "PR", "Curitiba"),
	SANTA_CATARINA("Santa Catarina", "SC", "Florianopolis"),
	RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre"),
	ESPIRITO_SANTO("Espirito Santo", "ES", "Vitoria"),
	MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"),
	SAO_PAULO("Sao Paulo", "SP", "Sao Paulo");
	
	private String nomeUF;
	private String sigla;
	private String nomeCapital;
	
	private UnidadeFederativa(String nomeUF, String sigla, String nomeCapital) {
		this.nomeUF = nomeUF;
		this.sigla = sigla;
		this.nomeCapital = nomeCapital;
	}

	public String getNomeUF() {
		return nomeUF;
	}

	public String getSigla() {
		return sigla;
	}

	public String getNomeCapital() {
		return nomeCapital;
	}
	
}
