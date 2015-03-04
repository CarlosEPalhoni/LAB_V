package br.edu.fameg.taximetro;

public class Taximetro {
	
	public double calcularPreco(Viagem viagem){
		Bandeira band=null;
		
		if(ehBandeiraDois(viagem))
			band = new BandeiraDois();
		if(ehBandeiraUm(viagem))
			band = new BandeiraUm();
		
		return band.calcularPreco(viagem);
		
	}

	private boolean ehBandeiraUm(Viagem viagem2) {
		if (viagem2.getHoraInicial()>=6 && viagem2.getHoraInicial()<=22)
			return true;
		return false;
	}

	private boolean ehBandeiraDois(Viagem viagem2) {
		// duas condições para resolver o problema entre 22 e 06 da manha
		if ((viagem2.getHoraInicial()>=22 && viagem2.getHoraInicial()<=24)||
				(viagem2.getHoraInicial()>=1 && viagem2.getHoraInicial()<=5))
			return true;
		return false;
	}

}
