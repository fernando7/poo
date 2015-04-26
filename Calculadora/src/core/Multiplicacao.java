package core;

public class Multiplicacao implements Expressao {

	private Expressao expressaoDireita;
	private Expressao expressaoEsquerda;

	public Multiplicacao(Expressao expressaoEsquerda, Expressao expressaoDireita) {
		this.expressaoDireita = expressaoDireita;
		this.expressaoEsquerda = expressaoEsquerda;
	}
	
	@Override
	public double resolver() {
		return expressaoEsquerda.resolver() * expressaoDireita.resolver();
	}
}
