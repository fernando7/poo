package core;

public class Percentual implements Expressao {

	private Expressao valor;
	private double percentual;

	public Percentual(Expressao valor, double percentual) {
		this.valor = valor;
		this.percentual = percentual;
	}
	
	@Override
	public double resolver() {
		return valor.resolver() * percentual / 100;
	}

	
}
