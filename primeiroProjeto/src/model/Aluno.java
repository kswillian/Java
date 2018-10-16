package model;

/**
 *
 * @author Willian kaminski dos Santos
 * @since 16-10-2018 13:33
 * @version 1.0
 */
public class Aluno {
    
    private String nome;
    private float n1;
    private float n2;
    private float media;

    public Aluno() {
    }

    public Aluno(String nome, float n1, float n2, float media) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    public float calcularMedia(float n1, float n2){
        this.media = (n1 + n2) / 2;
        return this.media;
    }
    
    public String calcularConceito(){
        
        if(this.media >= 7.0){
            
            return "Aluno Aprovado";
            
        }else if(this.media > 5){
            
            return "Aluno em Recuparação";
        }
        
        return "Aluno Reprovado";
    }
}
