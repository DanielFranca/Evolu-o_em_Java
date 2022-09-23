package exercicios_sessao7;

import java.util.Scanner;
/*
 Escreva um programa que leia 10 números inteiross e os armazene em um vetor. Imprima 
 o vetor, o maior elemento e a posição que ele se encontra.
 */
public class ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] =  new int[10];
        int maior;  
        int p;   

        maior = vetor[0];
        p =0;
            
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Adicione um número neste vetor: ");
            vetor[i] = entrada.nextInt();
            if(vetor[i] > maior){
                maior = vetor[i];
                p = i;     
            }
        }
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);
        System.out.println(vetor[4]);
        System.out.println(vetor[5]);
        System.out.println(vetor[6]);
        System.out.println(vetor[7]);
        System.out.println(vetor[8]);
        System.out.println(vetor[9]);
        
        System.out.println("o maior eelemento é: " + maior + " E a posição onde o maior vetor se encontra é: " + p);
    }

}
