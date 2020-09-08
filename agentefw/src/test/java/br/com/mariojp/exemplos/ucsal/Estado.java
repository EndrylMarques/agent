package br.com.mariojp.exemplos.ucsal;

import br.com.mariojp.ai.agent.AbstractState;

import java.util.Objects;

public class Estado extends AbstractState {

    private Ponto ponto;

    public Estado() {
    }

    public Estado(Ponto ponto) {
        this.ponto = ponto;
    }

    public Object clone() {
        Estado copia = new Estado();
        copia.setPonto(this.ponto);

        return copia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estado)) return false;
        Estado estado = (Estado) o;
        return Objects.equals(getPonto(), estado.getPonto());
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "ponto=" + ponto +
                '}';
    }
}
