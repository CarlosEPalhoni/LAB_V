package br.edu.fameg.taximetro;

public class Viagem {

	private int distancia;
	private int horaInicial;
	
	
	
	public Viagem(int distancia, int horaInicial) {
		super();
		this.distancia = distancia;
		this.horaInicial = horaInicial;
		
	}
	
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public int getHoraInicial() {
		return horaInicial;
	}

	
	
	
	
}
