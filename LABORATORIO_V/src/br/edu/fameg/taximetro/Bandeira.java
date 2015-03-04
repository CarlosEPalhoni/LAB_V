package br.edu.fameg.taximetro;

public abstract class Bandeira {
	
	public static double VALOR_FIXO = 4.95;
	
	protected double valorPorKm;
	
	public abstract double calcularPreco(Viagem viagem);

}
