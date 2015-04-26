package core;

public class Subtracao implements Expressao {

	private Expressao expressaoDireita;
	private Expressao expressaoEsquerda;

	public Subtracao(Expressao expressaoDireita, Expressao expressaoEsquerda) {
		this.expressaoDireita = expressaoDireita;
		this.expressaoEsquerda = expressaoEsquerda;
	}		
	
	@Override
	public double resolver() {
		return expressaoEsquerda.resolver() - expressaoDireita.resolver();
	}

}
