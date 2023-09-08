/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiojavaexercicio04ipi;

import java.util.Scanner;

/**
 *Escrever um programa que lê:
 *- A porcentagem do IPI a ser acrescido no valor das peças
 *- O código da peça 1, valor unitário da peça 1, quantidade de peças 1
 *- O código da peça 2, valor unitário da peça 2, quantidade de peças 2
 *O programa deve calcular o valor total a ser pago e apresentar o resultado.
 *Fórmula: (valor1 * quant1 + valor2 * quant2) * (IPI/100 + 1)
 * @author mesaq
 */
public class DesafioJavaExercicio04IPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tecla = new Scanner(System.in);
        System.out.print("Qual o valor do IPI? ");
        double IPI = tecla.nextDouble();
        System.out.print("Digite o codigo da peça 1: ");
        int codigo1 = tecla.nextInt();
        System.out.print("Digite o preço da peça 1: ");
        double valor1 = tecla.nextDouble();
        System.out.print("Digite a quantidade de peças: ");
        int quant1 = tecla.nextInt();
        System.out.print("Digite o codigo da peça 2: ");
        int codigo2 = tecla.nextInt();
        System.out.print("Digite o preço da peça 2: ");
        double valor2 = tecla.nextDouble();
        System.out.print("Digite a quantidade de peças: ");
        int quant2 = tecla.nextInt();
                     
        double valorTotal = ((valor1 * quant1) + (valor2 * quant2)) * (IPI/100 + 1);
        
        System.out.format("Valor total: R$ %.2f \n",valorTotal);
        
    }
    
}
