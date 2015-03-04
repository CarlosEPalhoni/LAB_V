package br.edu.fameg.taximetro;

public class BandeiraDois extends Bandeira {

	@Override
	public double calcularPreco(Viagem v) {
		valorPorKm = 0.95;
		return VALOR_FIXO + v.getDistancia() * valorPorKm;
	}

}
