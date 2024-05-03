package exercicio1;

public class TesteCliente {
	public static void main(String[] args) {
		System.out.println("teste");
		Cliente cliente = new Cliente(123, "ok", 456, EstadoCivil.CASADO);
		System.out.println("teste2");
		System.out.println(cliente.toString());
	}
}
