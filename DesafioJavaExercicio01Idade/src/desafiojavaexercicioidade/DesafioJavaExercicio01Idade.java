/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiojavaexercicioidade;

import java.util.Scanner;

/**
 *Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dia se
 *mostre-a expressa em dias.
 *Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias =
 *1170 dias.)
 * @author mesaq
 */
public class DesafioJavaExercicio01Idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anos, meses, dias, idadeDias;
        
        Scanner tecla = new Scanner(System.in);
        System.out.print("Quantos anos tem a pessoa em questão? ");
        anos = tecla.nextInt();
        System.out.print(anos + " anos e quantos meses? ");
        meses = tecla.nextInt();
        System.out.print(anos + " anos, " + meses + " meses e quantos dias? ");
        dias = tecla.nextInt();        
        
        idadeDias = (anos * 365) + (meses * 30) + dias;
        
        System.out.println( anos + " anos, " + meses + " meses e " + dias 
                + " = " + idadeDias + " dias.");
    }
    
}
