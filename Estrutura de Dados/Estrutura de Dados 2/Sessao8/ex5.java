package Sessao8;
//@Daniel França Leite
/*
 Crie um programa que receba três valores (obrigatoriamente maiores que zero), representando 
 as medidas dos três lados de um triângulo. Elabore uma função para:

 (a) Determinar se esses lados formam um triângulo, sabendo que:
    - O comprimento de cada lado de um triângulo é menor do que a soma dos outros
    dois lados.
    
 (b) Determinar e mostrar o tipo de triângulo, caso as medidas formem um triângulo.
    Sendo que:

    - Chama-se equilátero o triângulo que tem três lados iguais.
    - Denominam-se isósceles o triângulo que tem o comprimento de dois lados iguais.
    - Recebe o nome  de escaleno o triângulo que trem os três lados diferentes.
 */

import java.util.Scanner;

public class ex5{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int valor1;
       int valor2;
       int valor3;
         
       System.out.println("Escreva o primeiro valor :");
       valor1 = entrada.nextInt();
       System.out.println("Escreva o segundo valor: ");
       valor2 = entrada.nextInt();
       System.out.println("Escreva o terceiro valor: ");
       valor3 = entrada.nextInt();
       
        forma_triangulo(valor1, valor2, valor3);
        nome_triangulo(valor1, valor2, valor3);
    }


    public static void forma_triangulo(int valor1, int valor2, int valor3){

        int soma1;
        int soma2;
        int soma3;

        for(int i = 0; i<1; i++){
        soma1 = (valor2 + valor3);
        soma2 = (valor1 + valor3);
        soma3 = (valor2 + valor1);

        if(valor1 < soma1 && valor2 < soma2 && valor3 < soma3 ){
        System.out.println("Os lados correspondem a um triângulo");
            } else if ((valor1 == valor2) || (valor2 == valor3)) {
                System.out.println("Os lados não correspondem a um triângulo");
            }

        }
    }
        public static void nome_triangulo(int valor1, int valor2, int valor3){
                int count = 0;
            if(valor1 == valor2){
                count++;
            }if(valor2 == valor3){
                count++;
            }if (valor3 == valor1){
                    count++;
            }if(count == 2){
                    System.out.println("Triângulo isósceles!");
                    }else if(count == 3){
                            System.out.println("Triângulo equilátero");
                        }if(valor1 != valor2) {
                        count++;
                        }if(valor2 != valor3){
                        count++;
                        }if(valor3 != valor1);
                        count++;
                        if(count == 3){
                            System.out.println("Triângulo Escaleno");
                        }
                        
                    }
                }
           
     


    

