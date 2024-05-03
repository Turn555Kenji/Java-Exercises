package exercicio2;

public class TesteEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa("alguma coisa", 123, UnidadeFederativa.MINAS_GERAIS);
		
		System.out.println(empresa.toString());
	}
}
