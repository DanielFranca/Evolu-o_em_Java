package exercicios_sessao7;

import java.util.Scanner;

/*
 Faça um programa para ler a nota da prova de 15 alunos e armazene num valor, calcule
 e  imprima a média geral.
 */

public class ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notas;
        double media;
        int cont = 1;

        notas = 0;
        for(int i = 1; i <= 15; i++){
            System.out.println("Digite a nota do Aluno " + cont + " aqui: ");
            notas = entrada.nextDouble();
            System.out.println(notas);
        }
        media = (notas % 15);
        System.out.println("A media de notas dos 15 alunos é: " + media);
    }
}
