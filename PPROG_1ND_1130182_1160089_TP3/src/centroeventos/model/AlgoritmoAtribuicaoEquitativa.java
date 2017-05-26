package centroeventos.model;

import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;


/**
 *
 * @author Daniel Dias & José Gonçalves
 */
public class AlgoritmoAtribuicaoEquitativa implements AlgoritmoAtribuicao {

    private String nomeAlgoritmo;
    private Evento evento;
    
    public AlgoritmoAtribuicaoEquitativa(String nomeAlgoritmo, Evento evento){
        this.nomeAlgoritmo=nomeAlgoritmo;
        this.evento=evento;
    }
    
    /**
     * @return the nomeAlgoritmo
     */
    @Override
    public String getNomeAlgoritmo() {
        return nomeAlgoritmo;
    }

    /**
     * @return the evento
     */
    public Evento getEvento() {
        return evento;
    }

    /**
     * @param nomeAlgoritmo the nomeAlgoritmo to set
     */
    public void setNomeAlgoritmo(String nomeAlgoritmo) {
        this.nomeAlgoritmo = nomeAlgoritmo;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

       
    @Override
    public List<Pair<Candidatura, FAE>> atribui() {
        List<FAE> listaFaeEvento = evento.getListaFaeEvento();
        List<Candidatura> listaCandidaturaEvento = evento.getListaCandidaturasEvento();
        List<Pair<Candidatura, FAE>>listaAtribuicoes = new ArrayList();
        
        int nrFAEPorCandidatura = listaFaeEvento.size() / listaCandidaturaEvento.size(); //numero total de Fae a atribuir por candidatura
        int n = 0; //contador de ajuda a atribuição

        for (int i = 0; i < listaCandidatura.size(); i++) {
            for (int j = 0; j < listaFae.size(); j++) {
                while (n != quantosFAE) {
                    if (listaAtribuicoes.contains(new AtribuicaoCandidatura(listaFae.get(j), listaCandidatura.get(i).getIdCandidatura()))) {
                        j++;
                    } else {
                        listaAtribuicoes.add(new AtribuicaoCandidatura(listaFae.get(j), listaCandidatura.get(i).getIdCandidatura()));
                    }
                }
            }

        }
            return listaAtribuicoes;
    }

    
}
