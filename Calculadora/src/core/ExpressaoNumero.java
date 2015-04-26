package core;

public class ExpressaoNumero implements Expressao {

	private double numero;

	public ExpressaoNumero(double numero) {
		this.numero = numero;
	}
	
	@Override
	public double resolver() {
		return numero;
	}
}
