/*3. Desenvolva um sistema de calculadora. Cada calculadora é identificada por sua marca,
modelo, tipo (básica, financeira, científica, etc.) e memória interna (em megabytes). Uma vez
iniciado os atributos, os mesmos não poderão ser alterados, ou seja, não podem possuir os
métodos setters. Além disso, uma calculadora que seja capaz de realizar as quatro operações
básicas: soma, subtração, multiplicação e divisão. Para testá-la, utilize uma classe de teste e,
ao invocar os métodos da calculadora, passe por parâmetro dois valores para realizar o
cálculo*/

package questao3;

public class Calculadora {
	private String marca;
	private String modelo;
	private String tipo;
	private int memoriaInterna;
	
	public Calculadora(String marca, String modelo, String tipo, int memoriaInterna) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoriaInterna = memoriaInterna;
	}

	private String getMarca() {
		return marca;
	}

	private String getModelo() {
		return modelo;
	}

	private String getTipo() {
		return tipo;
	}

	private int getMemoriaInterna() {
		return memoriaInterna;
	}
	
	
	public double soma(double x, double y) {
		return x + y;
	}
	
	public double sub(double x, double y) {
		return x - y;
	}

	public double mult(double x, double y) {
		return x * y;
	}

	public double div(double x, double y) {
		return x / y;
	}
	
}
