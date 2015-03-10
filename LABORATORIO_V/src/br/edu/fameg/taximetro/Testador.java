package br.edu.fameg.taximetro;

public class Testador {

	public static void main(String[] args) {
		
		
		Viagem viagem = new Viagem(16,12,3);
		
		Taximetro taximetro = new Taximetro();
		
		System.out.println(taximetro.calcularPreco(viagem));

	}

}
