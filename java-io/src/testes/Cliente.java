package testes;


import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 *
 * @author Wagner Herculano
 * @version 0.1
 */
public class Cliente implements Serializable {

    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Profissão: %s", this.nome, this.profissao);
    }
}
