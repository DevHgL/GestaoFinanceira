package App;

import Conta.Usuario;

import java.util.Date;
// Definindo a Classe Transação e importando a Classe Usuário
public class Transacao extends Usuario {
    // Atributos da Classe
    private Date data;
    private double valor;
    private String descricao;
    private Usuario usuario;

    public Transacao( Date data, double valor, String descricao, Usuario usuario){
        super();
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    // Retorna a data da transação
    public Date getData() {
        return this.data;
    }

    // Define a data da transação
    public void setData(Date data) {
        this.data = data;
    }

    // Retorna o valor da transação
    public double getValor() {
        return this.valor;
    }

    // Define o valor da transação
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Retorna a descrição da transação
    public String getDescricao() {
        return this.descricao;
    }

    // Define a descrição da transação
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Retorna o usuário da transação
    public Usuario getUsuario() {
        return this.usuario;
    }

    // Define o usuário da transação
    public void setUsuario(Usuario usuario) {
        this.usuario= usuario;
    }

    // @todo Implementar métodos.

}
