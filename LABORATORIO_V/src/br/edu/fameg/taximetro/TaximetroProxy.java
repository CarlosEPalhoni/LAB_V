/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fameg.taximetro;

/**
 *
 * @author 02052348956
 */
public class TaximetroProxy {
    public static final double VALOR_ADICIONAL_POR_PESSOA=0.1;
    private Viagem viagem;
    
    public TaximetroProxy(Viagem viagem){
        this.viagem = viagem;
    }
    
    
    public double calcularValorAdicional(){
        double valorAdicional = 0;
        if(existePassageiroExtra()){
            valorAdicional=viagem.getDistancia()*(viagem.getNroPessoas()-1)*
                    VALOR_ADICIONAL_POR_PESSOA;
        }
        return valorAdicional;
    }
    
    
    private boolean existePassageiroExtra() {
        return viagem.getNroPessoas()>1;
        
        
                    
    }
}
