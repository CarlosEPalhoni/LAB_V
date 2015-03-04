package br.edu.fameg.taximetro;

public class BandeiraUm extends Bandeira {

	@Override
	public double calcularPreco(Viagem v) {
		valorPorKm = 0.65;
		return VALOR_FIXO + v.getDistancia() * valorPorKm;
	}

}
