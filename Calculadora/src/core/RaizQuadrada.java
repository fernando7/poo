package core;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;

	public RaizQuadrada(Expressao valor) {
		this.expressao = valor;
	}
	
	@Override
	public double resolver() {
		return Math.sqrt(expressao.resolver());
	}

}
