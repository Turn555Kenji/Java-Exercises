package exercicio;

public class Teste {
	public static void main(String[] args) {
		SistemaTributos compra1 = new SistemaTributos(130, new IRPF());
		SistemaTributos compra2 = new SistemaTributos(100, new INSS());
		SistemaTributos compra3 = new SistemaTributos(100, new IPVA());
		SistemaTributos compra4 = new SistemaTributos(100, new IOF());
		
		System.out.println("IRPF: " + compra1.retornarSoma());
		System.out.println("INSS: " + compra2.retornarSoma());
		System.out.println("IPVA: " + compra3.retornarSoma());
		System.out.println("IOF: " + compra4.retornarSoma());
		
		
	}
}
