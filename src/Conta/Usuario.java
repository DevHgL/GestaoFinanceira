package Conta;

// Definindo a classe Usuário.
public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;


    public Usuario(){

        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Retorna o nome do usuário
    public String getNome() {
        return this.nome;
    }

    // Define o nome do usuário
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o e-mail do usuário
    public String getEmail() {
        return this.email;
    }

    // Define o e-mail do usuário
    public void setEmail(String email) {
        this.email = email;
    }

    // Retorna a senha do usuário
    public String getSenha() {
        return this.senha;
    }

    // Define a senha do usuário
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // @todo Implementar métodos.
}
