/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio1;

import java.util.Scanner;

/**
 *
 * @author adrie
 */
public class Exercicio1 {

    public static void main(String[] args) {

        
        String[] unid = {"zero", "um","dois", "três", "quatro", "cinco", "seis", 
        "sete", "oito", "nove"};
        
        String[] dezen = {"","dez","vinte", "trinta", "quarenta", "cinquenta", 
        "sessenta", "setenta", "oitenta", "noventa"};

        String [] cent ={"", "cento", "duzentos", "trezentos", "quatrocentos", 
        "quinhetos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
        
        String [] outros ={"", "onze", "doze", "treze", "quatorze", "quinze", 
        "dezesseis", "dezessete", "dezoito", "dezenove"};
        
        String [] cem = {"", "cem"};
        
        int[] num = new int [3];
        
        //Recebendo os valores
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a centena: ");
        num[0] = sc.nextInt();
        
        System.out.print("Digite a dezena: ");
        num[1] = sc.nextInt();
        
        System.out.print("Digite a unidade: ");
        num[2] = sc.nextInt();
        
        
        //condicional
        
        if((num[1] == 0) & (num[0] == 0)){
            System.out.println(unid[num[2]]);
        }
        else if(num[1] == 0){
            System.out.print(cent[num[0]] + " e " + unid[num[2]]);
        }
        else if((num[0] == 1) & (num[1] == 0) & (num[2] == 0)){
            System.out.println(cem[num[0]]);
        }
        else if((num[2] == 0) & (num[1] == 0)){
            System.out.println(cent[num[0]]);
        }
        else if(num[2] == 0){
            System.out.println(cent[num[0]] + " e " + dezen[num[1]]);
        }
        else if((num[1] == 1) & (num[2] == 1)){
            System.out.println(cent[num[0]] + " e " + outros[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 2)){
            System.out.println(cent[num[0]] + " e " + outros[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 3)){
            System.out.println(cent[num[0]] + " e " + outros[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 4)){
            System.out.println(cent[num[0]] + " e " + outros[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 5)){
            System.out.println(cent[num[0]] + " e " + outros[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 6)){
            System.out.println(cent[num[0]] + " e " + outros[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 7)){
            System.out.println(cent[num[0]] + " e " + outros[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 8)){
            System.out.println(cent[num[0]] + " e " + outros[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 9)){
            System.out.println(cent[num[0]] + " e " + outros[num[2]]);
        }
        else if(num[0] > 9){
            System.out.println("O valor da centena é invalido");
        }
        else if(num[1] > 9){
            System.out.println("O valor da dezena é invalido");
        }
        else if(num[2] > 9){
            System.out.println("O valor da unidade é invalido");
        }
        else{
            System.out.println(cent[num[0]] + " e " 
        + dezen[num[1]] + " e " + unid[num[2]]);
        }
        
    }
}
