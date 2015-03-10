package br.edu.fameg.taximetro;

public class Viagem {

    private int distancia;
    private int horaInicial;
    private int nroPessoas=1;

    public Viagem(int distancia, int horaInicial, int nroPessoas) {
        this(distancia, horaInicial);
        this.nroPessoas = nroPessoas;
    }

    public Viagem(int distancia, int horaInicial) {

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

    public int getNroPessoas() {
        return nroPessoas;
    }

    public void setNroPessoas(int nroPessoas) {
        this.nroPessoas = nroPessoas;
    }

}
