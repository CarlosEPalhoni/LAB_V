package br.edu.fameg.taximetro;

public class Testador {

	public static void main(String[] args) {
		
		
		Viagem viagem = new Viagem(2,12);
		
		Taximetro taximetro = new Taximetro();
		
		System.out.println(taximetro.calcularPreco(viagem));

	}

}
