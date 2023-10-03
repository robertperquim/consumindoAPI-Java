package calculos;

import Modelos.Titulo;


public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duracao em minutos " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
