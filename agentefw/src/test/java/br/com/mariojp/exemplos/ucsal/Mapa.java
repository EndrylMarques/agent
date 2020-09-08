package br.com.mariojp.exemplos.ucsal;

import java.util.ArrayList;
import java.util.List;

public class Mapa {

    private List<Ponto> pontos = new ArrayList<>();
    private List<Caminho> caminhos = new ArrayList<>();

    public Mapa() {
        cargaPontos();
        cargaCaminhos();
    }

    private void cargaPontos() {
        try {
            Ponto ponto = new Ponto("Lami 1", 4, 'B', TipoPontoEnum.SALA, true);
            pontos.add(ponto);
            ponto = new Ponto("Lami 2", 4, 'B', TipoPontoEnum.SALA, true);
            pontos.add(ponto);
            ponto = new Ponto("Lami 3", 4, 'B', TipoPontoEnum.SALA, true);
            pontos.add(ponto);
            ponto = new Ponto("Banheiro Feminino", 4, 'B', TipoPontoEnum.BANHEIRO_FEMININO, true);
            pontos.add(ponto);
            ponto = new Ponto("Banheiro Masculino", 4, 'B', TipoPontoEnum.BANHEIRO_MASCULINO, true);
            pontos.add(ponto);
            ponto = new Ponto("Em frente a Escada", 4, 'B', TipoPontoEnum.CORREDOR, false);
            pontos.add(ponto);
            ponto = new Ponto("Escada", 4, 'B', TipoPontoEnum.ESCADA, true);
            pontos.add(ponto);
            ponto = new Ponto("NAU", 4, 'B', TipoPontoEnum.BANHEIRO_MASCULINO, true);
            pontos.add(ponto);
            ponto = new Ponto("Bebedouro", 4, 'B', TipoPontoEnum.BEBEDOURO, true);
            pontos.add(ponto);

            //todo: isso ai
            /*
            p = new Ponto("Lami 4", 4, 'B', TipoPontoEnum.SALA, true);
            pontos.add(p);
            p = new Ponto("Lami 5", 4, 'B', TipoPontoEnum.SALA, true);
            pontos.add(p);
            p = new Ponto("Lami 6", 4, 'B', TipoPontoEnum.SALA, true);
            pontos.add(p);
            p = new Ponto("Escada", 4, 'B', TipoPontoEnum.SALA, true);
            pontos.add(p);*/


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargaCaminhos() {
        try {
            Caminho caminho = new Caminho(1.5, getPontoPorDescricao("Lami 1"), getPontoPorDescricao("Lami 2"));
            caminhos.add(caminho);
            caminho = new Caminho(4, getPontoPorDescricao("Lami 2"), getPontoPorDescricao("Lami 3"));
            caminhos.add(caminho);
            caminho = new Caminho(2, getPontoPorDescricao("Lami 3"), getPontoPorDescricao("Banheiro Feminino"));
            caminhos.add(caminho);
            caminho = new Caminho(0.5, getPontoPorDescricao("Banheiro Feminino"), getPontoPorDescricao("Banheiro Masculino"));
            caminhos.add(caminho);
            caminho = new Caminho(3, getPontoPorDescricao("Banheiro Masculino"), getPontoPorDescricao("Em frente a Escada"));
            caminhos.add(caminho);
            caminho = new Caminho(3, getPontoPorDescricao("Em frente a Escada"), getPontoPorDescricao("Bebedouro"));
            caminhos.add(caminho);
            caminho = new Caminho(4, getPontoPorDescricao("Em frente a Escada"), getPontoPorDescricao("NAU"));
            caminhos.add(caminho);
            caminho = new Caminho(4, getPontoPorDescricao("Em frente a Escada"), getPontoPorDescricao("Escada"));
            caminhos.add(caminho);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //todo: getPontoPorId
    public Ponto getPontoPorDescricao(String desc) {
        for (Ponto ponto : pontos) {
            if (ponto.getDescricao().equals(desc))
                return ponto;
        }
        return null;
    }

    public List<Ponto> getPontos() {
        return pontos;
    }

    public List<Caminho> getCaminhos() {

        return caminhos;
    }

    public List<Ponto> pontosAdjacentes(String pontoDesc){
        List<Ponto> pontosAdjacentes = new ArrayList<>();
        for (Caminho caminho: caminhos ){
            if(caminho.getPontoOrigem().getDescricao() == pontoDesc){
                pontosAdjacentes.add(caminho.getPontoDestino());
            }
        }
        return pontosAdjacentes;
    }
}
