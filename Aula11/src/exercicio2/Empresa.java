/*Implemente um sistema para manter os dados de uma
empresa. A empresa é identificada pela sua Razão Social, cnpj e
unidade federativa que encontra-se sua matriz. A unidade
federativa será a classe enumeration e em cada indicador
deverá armazenar os valores: nome da unidade federativa, sigla
e nome da capital. 

Cadastre apenas as unidades federativas da
região sul e sudeste. Implemente uma classe de teste para instanciar as empresas e
atribuir os valores a elas, bem como imprimir seus dados em console.*/

package exercicio2;

public class Empresa {
	private String razaoSocial;
	private int cnpj;
	private UnidadeFederativa unidadeFederativa;
	
	public Empresa(String razaoSocial, int cnpj, UnidadeFederativa unidadeFederativa) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.unidadeFederativa = unidadeFederativa;
	}

	@Override
	public String toString() {
		return "Empresa [razaoSocial=" + this.razaoSocial + ", cnpj=" + this.cnpj + ", unidadeFederativa=" + this.unidadeFederativa.getNomeUF() + " " + this.unidadeFederativa.getSigla() + " " + this.unidadeFederativa.getNomeCapital()
				+ "]";
	}
	
	
	
}
