package Modelos;

import calculos.Classificavel;

public class Serie extends Titulo {
    private int temporada;

    private boolean ativa;

    private int episodiosPorTemporada;

    private int minutosPorEpisodios;


    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    public int getTemporada() {
        return temporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * episodiosPorTemporada * minutosPorEpisodios;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }

}
