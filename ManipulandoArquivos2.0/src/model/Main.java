package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        try {
            
            String aux;

            Pessoa p = new Pessoa();

            aux = JOptionPane.showInputDialog(null, "Informe o CPF: ");
            p.setCpf(aux);

            aux = JOptionPane.showInputDialog(null, "Informe o NOME: ");
            p.setNome(aux);

            aux = JOptionPane.showInputDialog(null, "Informe o IDADE: ");
            p.setIdade(Byte.parseByte(aux));

            Gravar(p);
            Ler();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi posivel cadastrar a pessoa!");
        }
    }

    public static void Gravar(Pessoa p) {
        try {

            FileOutputStream f = new FileOutputStream("pessoas.txt");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(p);
            s.flush();
            System.out.println("Gravação realizada com sucesso!");
            System.err.println("Arquivo pessoas.txt criado!!!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Ler() {
        try {

            String file;
            file = JOptionPane.showInputDialog(null, "Informe o nome do arquivo: ");

            FileInputStream f = new FileInputStream(file + ".txt");
            ObjectInputStream s = new ObjectInputStream(f);
            Pessoa p = (Pessoa) s.readObject();

            System.out.println("CPF: " + p.getCpf());
            System.out.println("NOME: " + p.getNome());
            System.out.println("IDADE: " + p.getIdade());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
