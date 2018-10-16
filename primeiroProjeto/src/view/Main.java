package view;

import java.util.Scanner;
import model.Aluno;

/**
 *
 * @author Willian Kaminski dos Santos
 * @since 16-10-2018 13:33
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Aluno a = new Aluno();
        
        System.out.print("-|--------------------------------|- \n"
                         + " |          Dados do Aluno        |  \n"
                         + "-|--------------------------------|- \n"
                         + " | Nome: ");
        a.setNome(leia.next());
        System.out.print(" | Nota1: ");
        a.setN1(leia.nextFloat());
        System.out.print(" | Nota2: ");
        a.setN2(leia.nextFloat());
        
        System.out.print("-|--------------------------------|- \n"
                       + " | Nome: " + a.getNome() + "\n"
                       + " | Nota1: " + a.getN1() + "\n"
                       + " | Nota2: " + a.getN2() + "\n"
                       + " | Média: " + a.calcularMedia(a.getN1(), a.getN2()) + "\n"
                       + "-|--------------------------------|- \n"
                       + " | Conceito: " + a.calcularConceito() + "\n"
                       + "-|--------------------------------|- \n");
    }
}
