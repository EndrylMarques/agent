package br.com.mariojp.exemplos.ucsal;

public class Caminho {

    private double distancia;
    //private TipoDistanciaEnum tipoDistancia;
    private Ponto pontoOrigem;
    private Ponto pontoDestino;

    public Caminho() {
    }

    public Caminho(double distancia, Ponto pontoOrigem, Ponto pontoDestino) {
        this.distancia = distancia;
        this.pontoOrigem = pontoOrigem;
        this.pontoDestino = pontoDestino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Ponto getPontoOrigem() {
        return pontoOrigem;
    }

    public void setPontoOrigem(Ponto pontoOrigem) {
        this.pontoOrigem = pontoOrigem;
    }

    public Ponto getPontoDestino() {
        return pontoDestino;
    }

    public void setPontoDestino(Ponto pontoDestino) {
        this.pontoDestino = pontoDestino;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caminho caminho = (Caminho) o;
        return Double.compare(caminho.distancia, distancia) == 0 &&
                pontoOrigem.equals(caminho.pontoOrigem) &&
                pontoDestino.equals(caminho.pontoDestino);
    }

    @Override
    public String toString() {
        //todo: de ponto x a ponto y ande w metros
        return "";
    }
}
