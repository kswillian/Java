package model;

/**
 *
 * @author Willian Kaminski dos Santos
 * @since 18-10-2018 12:38
 * @version 1.0
 */
public class Aluno extends Pessoa{
    
    private String serie;
    private float nota1;
    private float nota2;
    private float media;

    public Aluno() {
    }

    public Aluno(String serie, float nota1, float nota2, float media) {
        this.serie = serie;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    public Float calcularMedia(){
        return this.media = (this.nota1 + this.nota2) / 2;
    }
    
    public String calcularConceito(){
        
        if(this.media > 8.50){
            return "A";
            
        }else if(this.media >= 7.0){
            return "B";
            
        }else if(this.media >= 5.0){
            return "C";
            
        }else if(this.media > 0.0){
            return "D";
        }
        
        return "E";
    }
}
