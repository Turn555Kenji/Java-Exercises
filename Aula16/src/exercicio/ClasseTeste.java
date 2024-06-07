package exercicio;

public class ClasseTeste {
	public static void main(String[] args) {
		FormaGeometrica quadrado = new Quadrado(Cor.VERMELHO, 1.2);
		FormaGeometrica retangulo = new Retangulo(Cor.VERDE, 3.5, 7.4);
		FormaGeometrica circulo = new Circulo(Cor.CARRO, 8);
		
		System.out.println(quadrado.calcularArea() + " " + quadrado.calcularPerimetro());
		System.out.println(retangulo.calcularArea() + " " + retangulo.calcularPerimetro());
		System.out.println(circulo.calcularArea() + " " + circulo.calcularPerimetro());
	}
}
