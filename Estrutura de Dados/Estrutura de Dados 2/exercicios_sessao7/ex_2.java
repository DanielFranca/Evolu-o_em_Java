/*
 Faça um programa que leia dois vetores 10 elementos. Crie um vetor que seja a intersecção entre os 2 vetores anteriores, ou seja, que contém 
 apenas os números que estão em ambos os vetores. Não deve conter números repetidos.

 */
package exercicios_sessao7;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];

        for(int i = 0; i < A.length; i++){
        System.out.println("Insira um números: ");
        A[i] = entrada.nextInt();
        }
        for(int count = 0; count < A.length; count++){
            System.out.println(A[count]);
        }
        
        for(int k = 0; k < B.length; k++){
            System.out.println("Insira um número: ");
            B[k] = entrada.nextInt();
        }
        for(int cont = 0; cont < B.length; cont++){
            System.out.println(B[cont]);
        }

        int C[] = new int[10];

        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < A.length; j++){
                A[i] = C[j];
            }
            for(int k = 6; k < 10; k++){
                for(int l = 6; l < B.length; l++){
                C[i] = B[l];
            }
        }
            System.out.println(C[0]);
            System.out.println(C[1]);
            System.out.println(C[2]);
            System.out.println(C[3]);
            System.out.println(C[4]);
            System.out.println(C[5]);
            System.out.println(C[6]);
            System.out.println(C[7]);
            System.out.println(C[8]);
            System.out.println(C[9]);
            System.out.println(C[10]);
            
        }

        }
        


    }
    


