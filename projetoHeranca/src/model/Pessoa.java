package model;

/**
 *
 * @author Willian Kaminski dos Santos
 * @since 18-10-2018 12:38
 * @version 1.0
 */
public class Pessoa {

    private String rg;
    private String nome;
    private byte idade;

    public Pessoa() {
    }

    public Pessoa(String rg, String nome, byte idade) {
        this.rg = rg;
        this.nome = nome;
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
}
