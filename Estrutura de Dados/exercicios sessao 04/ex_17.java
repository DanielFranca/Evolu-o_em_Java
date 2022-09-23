import java.io.Console;
import java.util.Scanner;

/*
 Faça um programa que mostre ao usuário um menu com 4 opções de operações matemáticas
  (as básicas, por exemplo). o Usuário escolhe uma das opções e o seu programa então pede
  dois valores numéricos e realiza a operação, mostrando o resultado e saindo.

 */

public class ex_17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        int opcao;
        int adicao;
        int subtração;
        int multiplicação;
        int divisão;

            System.out.println("Informe um numero: ");
            n1 = entrada.nextInt();
            System.out.println("Informe outro numero: ");
            n2 = entrada.nextInt();
            System.out.println("\n");


            System.out.println("\n\n MENU 4 OPERAÇÕES");
            System.out.println("\n       |===========================| ");
            System.out.println("\n       |        1 -  adição        |");
            System.out.println("\n       |                           |");
            System.out.println("\n       |        2 - subtração      |");
            System.out.println("\n       |                           |");
            System.out.println("\n       |        3 - multiplicação  |");
            System.out.println("\n       |                           |");
            System.out.println("\n       |        4 -  divisão       |");
            System.out.println("\n       |                           |");
            System.out.println("\n       | ========================= |\n");

            System.out.println("Informe o número de sua opção: ");
            opcao = entrada.nextInt();
            

            switch (opcao) {
                case 1:
                    adicao = (int) (n1 + n2);
                    System.out.println("A soma dos dois numeros é: " + adicao);
                        break;
                case 2:
                    subtração = (int) (n1 - n2);
                    System.out.println("A subtração dos dois numeros é: " + subtração);
                        break;
                case 3:
                    multiplicação = (int) (n1 * n2);
                    System.out.println("A multiplicação dos dois numeros é: " + multiplicação);
                        break;
                case 4:
                    divisão = (int) (n1 / n2);
                    System.out.println("A divisão dos dois numeros é: " + divisão);
                        break;
                default:
                System.out.println("erro!");
                    
            } 
            System.out.println("Opção: " + opcao);
        }
    }


