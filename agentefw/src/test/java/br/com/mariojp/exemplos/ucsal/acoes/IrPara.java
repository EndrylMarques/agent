package br.com.mariojp.exemplos.ucsal.acoes;

import br.com.mariojp.ai.agent.IState;
import br.com.mariojp.ai.agent.action.AbstractAction;
import br.com.mariojp.ai.agent.exception.ImpossibleActionException;

import br.com.mariojp.exemplos.ucsal.Estado;
import br.com.mariojp.exemplos.ucsal.Mapa;
import br.com.mariojp.exemplos.ucsal.Ponto;

import java.util.ArrayList;
import java.util.List;

public class IrPara extends AbstractAction {

    public List<IState> execute(IState arg0) throws ImpossibleActionException {
        List<IState> estados = new ArrayList<IState>();
        Estado e = (Estado) arg0;
        Ponto ponto = e.getPonto();

        Mapa mapa = new Mapa();

//        for (Ponto p : mapa.getPontos()) {
//            Ponto novoEstado = (Ponto) p.clone();
//
//            estados.add(p);
//
//        }

        return null;
    }


}
