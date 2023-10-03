package Modelos;

public class Titulo {

    private String nome;

    private int anoDeLancamento;

    private int duracaoEmMinutos;

    private int totalDeAvaliacoes;

    private double somaDeAvaliacoes;

    private boolean incluidoNoPlano;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double getSomaDeAvaliacoes() {
        return somaDeAvaliacoes;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void avalia(double nota){
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }


}
