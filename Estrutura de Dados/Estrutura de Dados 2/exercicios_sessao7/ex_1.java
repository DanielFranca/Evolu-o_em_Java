/*
 Faça um programa que possua um vetor denominado A que armazene 6 números inteiros.
 O programa deve executar os seguintes passos:

 - atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7;
 - armazene em uma variável inteira (simples) a soma entre os valores das posições
 A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
 - modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
 - mostre na tela cada vetor A, um em cada linha.
 */

package exercicios_sessao7;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int A[] = {1, 0, 5, -2, -5, 7};
         int soma;

         soma = (A[0] + A[1] + A[2] + A[3] + A[4] + A[5]);
         A[4] = 100;
         soma = (A[0] + A[1] + A[2] + A[3] + A[4] + A[5]);


         System.out.println("A soma dos números das posições dos vetores é: " + soma);
        
        
        System.out.println(A[0]);
        System.out.println(A[1]);
        System.out.println(A[2]);
        System.out.println(A[3]);
        System.out.println(A[4]);
        System.out.println(A[5]);
        System.out.println(A[6]);
    }
    
}
