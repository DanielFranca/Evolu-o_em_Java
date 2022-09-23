package Sessao8;

/*
 Elabore uma função que receba três notas de um aluno como parâmetros e uma letra.
 Se a letra for A, a função deverá calcular a média aritmética das notas do aluno;
 Se for P, deverá calcular a média ponderada, com pesos: 5, 3 e 2.

 */

 import java.util.Scanner;

 public class ex3{
    public static void  calcular_media(){
        Scanner entrada = new Scanner(System.in);
        Double nota1; Double nota2; Double nota3; String letra; Double media;

        
        System.out.println("Digite sua nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite sua nota 2: ");
        nota2 = entrada.nextDouble();
        System.out.println("Digite sua nota 3: ");
        nota3 = entrada.nextDouble();

        for(int i = 0; i < 1; i++ ){
        System.out.println("Temos duas opções para calcular sua média. Escolha entre: (P)  Calcular sua média com pesos ou (A) Calcula sua média com a média aritmética. Digite sua escolha: ");
        letra = entrada.next();

        if("P".equals(letra)){
            media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2));
            media = media / 10;
            System.out.println("Sua média é: " + media);
             } else if("A".equals(letra)){
             media = (nota1 + nota2 + nota3);
             media = media / 3;
            System.out.println("Sua média é: " + media);
            }
        }
    }

    public static void main(String[] args) {
        calcular_media();
    }
 }