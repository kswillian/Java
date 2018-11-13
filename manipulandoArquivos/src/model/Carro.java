package model;

/**
 *
 * @author Willian Kaminski dos Santos
 * @since 13-11-2018
 * @version 1.0
 */
public class Carro {
    
    private String marca;
    private String modelo;
    private String placa;
    private String cor;

    public Carro(String marca, String modelo, String placa, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", cor=" + cor + '}';
    }
    
}
