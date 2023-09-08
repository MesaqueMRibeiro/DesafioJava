/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiojavaexercicio03saldo;

import java.util.Scanner;

/**
 * Fazer um programa que informa um saldo e imprimir o saldo com reajuste de 1%.
 * @author mesaq
 */
public class DesafioJavaExercicio03Saldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double s;

        Scanner tecla = new Scanner(System.in);
        System.out.print("Informe o valor investido: ");
        s = tecla.nextDouble();
        
        System.out.printf("Saldo: R$ %.2f \n", s);
        s += (1 * s / 100);
        
        System.out.printf("Saldo com reajuste de 1 por cento: R$ %.2f \n ", s);
                        
    }

}
