/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiojavaexercicio02media;

import java.util.Scanner;

/**
 * Fazer um programa que imprima a média aritmética dos números 8, 9 e 7. A média dos
 *números 4, 5 e 6. A soma das duas médias. A média das médias.
 * @author mesaq
 */
public class DesafioJavaExercicio02Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x1, x2, x3, y1, y2, y3, m1, m2, mm;
        
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite os três valores da primeira média: ");
        x1 = tecla.nextDouble();
        x2 = tecla.nextDouble();
        x3 = tecla.nextDouble();
        
        System.out.println("Digite os três valores da segunda média: ");
        y1 = tecla.nextDouble();
        y2 = tecla.nextDouble();
        y3 = tecla.nextDouble();
        
        m1 = (x1 + x2 + x3) / 3;
        m2 = (y1 + y2 + y3) / 3;
        mm = (m1 + m2) / 2;
        
        System.out.println("Primeira Média: " + m1);
        System.out.println("Segunda Média: " + m2);
        System.out.println("Média das Média: " + mm);
    }
    
}
