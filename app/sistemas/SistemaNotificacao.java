package sistemas;

import java.util.ArrayList;
import java.util.List;

import models.*;

public class SistemaNotificacao {

    private static final SistemaNotificacao INSTANCIA = new SistemaNotificacao();
    private List<Notificacao> notificacoes;

    private SistemaNotificacao() {
        notificacoes = new ArrayList<>();
    }

    public static SistemaNotificacao getInstance() {
        return INSTANCIA;
    }


    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    // Notificar

    public void notificaUsuario(Notificacao notificacao, Usuario usuarioNotificado) {
        usuarioNotificado.recebeNotificacao(notificacao);
    }


    //Buscar no sistema

    public Notificacao buscarNotificacaoPorId(Long id){
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();

        int i = buscarIndiceNotificacaoPorId(id);
        return usuarioLogado.getNotificacoesNaoLidas().get(i);
    }

    private int buscarIndiceNotificacaoPorId(Long id) {
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();

        for (int i = 0; i < usuarioLogado.getNotificacoesNaoLidas().size(); i++){
            if (usuarioLogado.getNotificacoesNaoLidas().get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


    ///Leitura de notificacoes e gets de Lidas/NaoLidas

    public void leNotificacao(Notificacao notificacaoNaoLida){
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        usuarioLogado.leNotificacao(notificacaoNaoLida);
    }

    public void leTodasNotificacoes(){
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        usuarioLogado.leTodasNotificacoes();
        notificacoes = new ArrayList<>();
    }

    public List<Notificacao> getNotificacoesLidas() {
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        return usuarioLogado.getNotificacoesLidas();
    }

    public List<Notificacao> getNotificacoesNaoLidas() {
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();

        return usuarioLogado.getNotificacoesNaoLidas();
    }



}
