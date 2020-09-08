package br.com.mariojp.exemplos.ucsal;

import br.com.mariojp.ai.agent.AgentFactory;
import br.com.mariojp.ai.agent.AgentModel;
import br.com.mariojp.ai.agent.IAgent;
import br.com.mariojp.ai.agent.INode;
import br.com.mariojp.ai.agent.exception.EmptyBorderException;

import java.util.List;

public class Agente {

    public static void main(String[] args) {
        AgentModel agent = new AgentModel();
        Mapa mapa = new Mapa();

        Estado estadoInicial = new Estado();
        estadoInicial.setPonto(mapa.getPontoPorDescricao("Lami 1"));
        agent.setInitState(estadoInicial);

        Estado estadoFinal = new Estado();
        estadoFinal.setPonto(mapa.getPontoPorDescricao("Banheiro Feminino"));
        agent.addObjective(estadoFinal);

        agent.setType(IAgent.BREADTH_FIRST_SEARCH);

        IAgent agente =  AgentFactory.createAgent(agent);

        INode nofinal = null;
        try {
            nofinal = agente.function();
        } catch (EmptyBorderException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        List cam = agente.getPath(nofinal);
        //agente.exibirGrafico(null);
        System.out.println("CAMINHO ::::::");
        System.out.println(cam);
        System.out.println("AGENTE ::::::");
        System.out.println(agente);
        System.out.println("NO FIM ::::::");
        System.out.println(nofinal);
    }


}
