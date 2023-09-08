/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiojavaexercicio05salario;

import java.util.Scanner;

/**
 *Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
 *a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM =
 *R$788,00)

 * @author mesaq
 */
public class DesafioJavaExercicio05Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tecla = new Scanner(System.in);
        System.out.print("Informe o valor do salário: ");
        double salario = tecla.nextDouble();
        
        double salMin = 788;
        //int quantSalMin = (int) salario / (int)salMin;
        double quantSalMin =  salario / salMin;
        
        int qs = (int) quantSalMin;
        if (salario < salMin){
            System.out.println("O salario do usuário está abaixo do salario mínimo");
        } else{
            System.out.println("O salário do usuário corresponde a " + qs + " salário(s) mínimo(s)");
            
        }
    }
    
}
