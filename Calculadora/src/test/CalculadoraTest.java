package test;

import core.Divisao;
import core.ExpressaoNumero;
import core.Fatorial;
import core.Multiplicacao;
import core.Percentual;
import core.RaizQuadrada;
import core.Soma;

public class CalculadoraTest {

	public static void main(String[] args) {
		ExpressaoNumero numero1 = new ExpressaoNumero(15);
		ExpressaoNumero numero2 = new ExpressaoNumero(25);
	
		Soma soma = new Soma(numero1, numero2);
		
		System.out.println(soma.resolver());
		
		Multiplicacao multiplicacao = new Multiplicacao(soma, new ExpressaoNumero(3));
		System.out.println(multiplicacao.resolver());
		
		Divisao divisao = new Divisao(soma, new ExpressaoNumero(10));
		System.out.println(divisao.resolver());
		
		Soma soma2 = new Soma(multiplicacao, new ExpressaoNumero(30));
		System.out.println(soma2.resolver());
		
		Percentual percentual = new Percentual(soma2, 10);
		System.out.println(percentual.resolver());
		
		Multiplicacao multiplicacao2 = new Multiplicacao(new ExpressaoNumero(3), new ExpressaoNumero(10));
		Soma soma3 = new Soma(multiplicacao2, new ExpressaoNumero(6));
		RaizQuadrada raizQuadrada = new RaizQuadrada(soma3);
		System.out.println(raizQuadrada.resolver());
		
		Fatorial fatorial = new Fatorial(raizQuadrada);
		System.out.println(fatorial.resolver());
		
	}
}
