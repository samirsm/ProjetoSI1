package sistemas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import models.Carona;
import models.Notificacao;
import models.TipoNotificacao;
import models.Usuario;

public class SistemaNotificacao {

    private static final SistemaNotificacao INSTANCIA = new SistemaNotificacao();
    private List<Notificacao> notificacoes;

    private SistemaNotificacao() {
        notificacoes = new ArrayList<>();
    }

    public static SistemaNotificacao getInstance() {
        return INSTANCIA;
    }


    public void geraNotificacaoRejeicao(Usuario passageiro, Carona carona) {
        notificaPassageiro(passageiro, carona, TipoNotificacao.REJEICAO);
    }

    public void geraNotificacaoAceitacao(Usuario passageiro, Carona carona) {
        notificaPassageiro(passageiro, carona, TipoNotificacao.ACEITACAO);

    }



    public void geraNotificacaoPedido(Carona carona, Usuario passageiro) {
        notificaMotorista(passageiro, carona, TipoNotificacao.PEDIDO);
    }

    private void notificaMotorista (Usuario passageiro, Carona carona, TipoNotificacao tipo){
        Notificacao notificacao = new Notificacao(passageiro, carona, tipo);
        carona.getMotorista().recebeNotificacao(notificacao);

    }

    private void notificaPassageiro(Usuario passageiro, Carona carona, TipoNotificacao tipo) {
        Notificacao notificacao = new Notificacao(carona.getMotorista(), carona, tipo);
        passageiro.recebeNotificacao(notificacao);
    }


    private int buscarIndiceCaronaPorId(Long id) {
        for (int i = 0; i < notificacoes.size(); i++){
            if (notificacoes.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public Notificacao buscarCaronaPorId(Long id){
        int i = buscarIndiceCaronaPorId(id);
        return notificacoes.get(i);
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }


    //PP CLASS

    public void geraNotificacaoRejeicao(Notificacao pedido) {
        notificaPassageiro(pedido.getCarona(), TipoNotificacao.REJEICAO, pedido.getUsuarioOrigem());
    }

    public void geraNotificacaoAceitacao(Notificacao pedido) {
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();

        notificaPassageiro(pedido.getCarona(), TipoNotificacao.ACEITACAO, pedido.getUsuarioOrigem());

    }

    public void geraNotificacaoCancelamento(Carona carona) {
        List<Usuario> passageiros= carona.getPassageiros();
        for (Usuario passageiro: passageiros){
            notificaPassageiro(carona, TipoNotificacao.CANCELAMENTO, passageiro);
        }
    }

    public void geraNotificacaoPedido(Carona carona) {
        notificaMotorista(carona, TipoNotificacao.PEDIDO);
        solicitaCarona(carona);
    }

    private void notificaMotorista (Carona carona, TipoNotificacao tipo){
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();

        Notificacao notificacao = new Notificacao(usuarioLogado, carona, tipo);
        carona.getMotorista().recebeNotificacao(notificacao);

    }

    private void solicitaCarona(Carona carona){
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        Notificacao solicitacao = new Notificacao(usuarioLogado, carona, TipoNotificacao.PEDIDO);
        carona.adicionaSolicitante(usuarioLogado);
        usuarioLogado.recebeSolicitacao(solicitacao);
    }

    private void notificaPassageiro(Carona carona, TipoNotificacao tipo, Usuario passageiro) {
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        Notificacao notificacao = new Notificacao(usuarioLogado, carona, tipo);
        passageiro.recebeNotificacao(notificacao);
    }

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

    public void leNotificacao(Notificacao notificacaoNaoLida){
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        usuarioLogado.leNotificacao(notificacaoNaoLida);
    }

    public List<Notificacao> getNotificacoesLidas() {
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        return usuarioLogado.getNotificacoesLidas();
    }

    public List<Notificacao> getNotificacoesNaoLidas() {
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();

        return usuarioLogado.getNotificacoesNaoLidas();
    }

    public void leTodasNotificacoes(){
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        usuarioLogado.leTodasNotificacoes();
        notificacoes = new ArrayList<>();
    }

}
