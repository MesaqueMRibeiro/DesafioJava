/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiojavaexercicio06;

import java.util.Scanner;

/**
 *Desenvolva um programa em Java que leia um número inteiro e imprima o seu antecessor e 
 *seu sucessor.
 * @author mesaq
 */
public class DesafioJavaExercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        
        Scanner tecla = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = tecla.nextInt();
     
        System.out.println("Antecessor: " + --n);
        System.out.println("Sucessor: " + (n += 2));   
    }
    
}
