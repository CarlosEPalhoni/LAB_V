package br.edu.fameg.taximetro;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Taximetro {

    private boolean cobrancaPorPassageiroExtra = false;

    public Taximetro() {
        
        cobrancaPorPassageiroExtra = this.cobrarPorPassageiroExtra();
    }

    public double calcularPreco(Viagem viagem) {
        Bandeira band = null;
        
        if (ehBandeiraDois(viagem)) {
            band = new BandeiraDois();
        } else // bandeira um
        {
            band = new BandeiraUm();
        }
        
        if(cobrancaPorPassageiroExtra){
            TaximetroProxy tp = new TaximetroProxy(viagem);
            
            return band.calcularPreco(viagem)+tp.calcularValorAdicional();
             
        }
        return band.calcularPreco(viagem);

    }

    private boolean ehBandeiraUm(Viagem viagem2) {
        if (viagem2.getHoraInicial() >= 6 && viagem2.getHoraInicial() <= 22) {
            return true;
        }
        return false;
    }

    private boolean ehBandeiraDois(Viagem viagem2) {
        // duas condições para resolver o problema entre 22 e 06 da manha
        if ((viagem2.getHoraInicial() >= 22 && viagem2.getHoraInicial() <= 24)
                || (viagem2.getHoraInicial() >= 1 && viagem2.getHoraInicial() <= 5)) {
            return true;
        }
        return false;
    }

    
    private boolean cobrarPorPassageiroExtra(){
        FileInputStream file = null;
        Properties props =  new Properties();
        try {
            
            file = new FileInputStream("./file.properties");
            props.load(file);
        } catch (IOException ex) {
            Logger.getLogger(Taximetro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Taximetro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return Boolean.valueOf(props.getProperty("cobrancaPorPassageiro"));
    }
}
