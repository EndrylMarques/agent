package br.com.mariojp.exemplos.ucsal;


public class Ponto {

    //TODO: TALVEZ UM ID
    private String descricao;
    //TODO: DEIXA NIVEL MAIS EXPLICITO NUM + DESC
    private int nivel;
    private char predio;
    private TipoPontoEnum tipo;
    private boolean acessivel;

    public Ponto(String descricao, int nivel, char predio, TipoPontoEnum tipo, boolean acessivel) {
        this.descricao = descricao;
        this.nivel = nivel;
        this.predio = predio;
        this.tipo = tipo;
        this.acessivel = acessivel;
    }

    public Ponto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public char getPredio() {
        return predio;
    }

    public void setPredio(char predio) {
        this.predio = predio;
    }

    public TipoPontoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoPontoEnum tipo) {
        this.tipo = tipo;
    }

    public boolean isAcessivel() {
        return acessivel;
    }

    public void setAcessivel(boolean acessivel) {
        this.acessivel = acessivel;
    }


}
