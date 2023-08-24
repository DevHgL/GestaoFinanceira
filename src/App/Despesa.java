package App;

import Conta.Usuario;

import java.util.Date;

public class Despesa extends Transacao {
// Definindo os atributos
    private String formaPagamento;
    private String categoria;
    public Despesa(Date data, double valor, String descricao, Usuario usuario) {
        super(data, valor, descricao, usuario);
    }
//    @todo Implemetar os métodos.]

}
