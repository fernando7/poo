package core;

public class Fatorial implements Expressao {

	private Expressao expressao;

	public Fatorial(Expressao expressao) {
		this.expressao = expressao;
	}
	
	@Override
	public double resolver() {
		int resolver = (int) expressao.resolver();
		long resultado = resolver;
		for (int i = resolver - 1; i > 1; i--) {
			resultado *= i;
		}

		return resultado;
	}
	

}
