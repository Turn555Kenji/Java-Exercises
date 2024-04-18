/*5. A equipe UTForce e-Racing da UTFPR Ponta Grossa está trabalhando em seu novo projeto,
automatizar a troca de marchas de seu carro elétrico. Para isso, a equipe fez uma parceria
com os alunos do curso de Análise e Desenvolvimento de Sistemas. Como requisito, o câmbio
possui 5 marchas (desconsiderando a marcha ré). O carro deve permanecer no neutro (ponto
morto) enquanto o carro esteja com velocidade 0. Ao ser acelerado e/ou freado, o carro
aumentará e/ou diminuirá a sua velocidade em 5 km/h e trocará de marcha de acordo com as
velocidades atingidas (sem interferência do piloto). Sabe-se que o carro possui velocidade
máxima de 130 km/h. A fim de economia de combustível, a equipe UTForce e-Racing fez um
estudo e passou aos programadores a seguinte tabela, que deve ser respeitada na definição
da marcha em relação a velocidade. Note que a velocidade e a marcha não poderão ser
alterados externamente, ou seja, apenas as funcionalidade de acelerar e frear o carro podem
manipular essas variáveis.

Marcha 		Velocidade
Neutro 		0 km/h
1ª Marcha 	1 – 19 km/h
2ª Marcha 	20 – 39 km/h
3ª Marcha 	40 – 59 km/h
4ª Marcha 	60 – 89 km/h
5ª Marcha 	90 km/h – limite do carro*/

package questao5;

public class Cambio {
	private int marcha;
	private int velocidade;
	
	public Cambio() {
		super();
		this.marcha = 0;
		this.velocidade = 0;
	}
	
	public void acelerar() {
		if(this.velocidade + 5 <= 130) {
			this.velocidade += 5;
			this.verificarMarcha();
			System.out.println("Acelerado, velocidade atual: " + this.velocidade + "km/h, " + this.marcha + "º marcha engatada.");
		}
		else {
			System.out.println("Carro no limite de velocidade!");
		}
	}
	
	public void frear() {
		if(this.velocidade - 5 >= 0) {
			this.velocidade -= 5;
			this.verificarMarcha();
			System.out.println("Freado, velocidade atual: " + this.velocidade + "km/h, " + this.marcha + "º marcha engatada.");
		}
		else {
			System.out.println("Carro ja esta parado");
		}
	}
	
	private void verificarMarcha() {
		if(velocidade > 89) {
			this.marcha = 5;
		}else
		if(velocidade > 59) {
			this.marcha = 4;
		} else
		if(velocidade > 39) {
			this.marcha = 3;
		} else
		if(velocidade > 19) {
			this.marcha = 2;
		} else
		if(velocidade > 1) {
			this.marcha = 1;
		} else
		if(velocidade == 0) {
			this.marcha = 0;
		} 
		
	}
}
