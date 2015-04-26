package core;

public class Soma implements Expressao {

	private Expressao expressaoDireita;
	private Expressao expressaoEsquerda;

	public Soma(Expressao expressaoDireita, Expressao expressaoEsquerda) {
		this.expressaoDireita = expressaoDireita;
		this.expressaoEsquerda = expressaoEsquerda;
	}	
	
	@Override
	public double resolver() {
		return expressaoEsquerda.resolver() + expressaoDireita.resolver();
	}

	
}
