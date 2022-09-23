package exercicios_sessao7;
import java.util.Scanner;

/*
 Faça um programa que leia um vetor de 8 posições e, em seguida, leia também dois valores
 X e Y quaisquer correspondentes a duas posições no vetor. Ao final seu programa deverá 
 escrever a soma dos valores encontrados nas respectivas posições X e Y.
 */



public class ex4{
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8};
    int x;
    int y;
    int soma;


    System.out.println("Digite um número: ");
    x = entrada.nextInt();
    System.out.println("Digite um número: ");
    y = entrada.nextInt();

    vetor[2] = x;
    vetor[3] = y;

    soma = x + y;

    System.out.println("A soma dos valores das posições dos vetores x e y é: " + soma);





    

    }
}
