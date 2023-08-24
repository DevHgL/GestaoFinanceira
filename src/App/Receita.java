package App;

import Conta.Usuario;

import java.util.Date;

public class Receita extends Transacao {
    // Definindo atributos da classe
    private String origem;

    public Receita(Date data, double valor, String descricao, Usuario usuario) {
        super(data, valor, descricao, usuario);
    }
}
// @todo Implementar métodos.