package core;

public class Divisao implements Expressao {

	private Expressao expressaoDireita;
	private Expressao expressaoEsquerda;

	public Divisao(Expressao expressaoEsquerda, Expressao expressaoDireita) {
		this.expressaoDireita = expressaoDireita;
		this.expressaoEsquerda = expressaoEsquerda;
	}
	
	@Override
	public double resolver() {
		return expressaoEsquerda.resolver() / expressaoDireita.resolver();
	}

}
