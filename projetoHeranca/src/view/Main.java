/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Aluno;

/**
 *
 * @author willian.santos
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner leia = new  Scanner(System.in);
        Aluno a = new  Aluno();
        
        System.out.print("-|--------------------------|- \n"
                       + " | RG: ");
        a.setRg(leia.next());
        System.out.print(" | Nome: ");
        a.setNome(leia.next());
        System.out.print(" | Idade: ");
        a.setIdade(leia.nextByte());
        System.out.print("-|--------------------------|- \n"
                       + " | Nota 1: ");
        a.setNota1(leia.nextFloat());
        System.out.print(" | Nota 2: ");
        a.setNota2(leia.nextFloat());
        System.out.print("-|--------------------------|-");
        
        System.out.println("\n\n"
                        + "-|--------------------------|- \n"
                        + " |--------------------------|  \n"
                        + " |  Nome: " + a.getNome() + "\n"
                        + " | ------------------------ |\n"
                        + " |  Nota 1: " + a.getNota1() + "\n"
                        + " |  Nota 2: " + a.getNota2() + "\n"
                        + " | ------------------------ |  \n"
                        + " |  Média: " + a.calcularMedia() +  " \n"
                        + " |  Conceito: " + a.calcularConceito()+ " \n"
                        + " |--------------------------| \n"
                        + "-|--------------------------|-");
    }
}
