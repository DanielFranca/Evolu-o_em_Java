package exercicios_sessao7;

import java.util.Scanner;

/*
 Faça um programa que receba do usuário um vetor com 10 posições. Em seguida deverá
 ser impresso o maior e o menor  elemento do vetor.
 */
public class ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] =  new int[10];
        int maior;
        int menor;
    

        maior = vetor[0];
        menor = vetor[0];
        
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Adicione um número neste vetor: ");
            vetor[i] = entrada.nextInt();
            if(vetor[i] > maior){
                maior = vetor[i];

            }if (vetor[i] < menor){
                menor = vetor[i];

            }
        }
        System.out.println("O maior nuúmero do array é: " + maior + " e o menor número do array é: " + menor);

        
    }
    
}
