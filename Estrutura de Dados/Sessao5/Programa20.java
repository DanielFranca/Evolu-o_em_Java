package Sessao5;
import java.util.Scanner;


//Criando nossas Próprias Funções

/*
Faça um programa que receba um diversos nomes de frutas do usuário e no final imprima essas frutas
em ordem contrária. O programa deve solicitar ao usuário quantas frutas ele quer informar.

Informa quantas frutas deseja cadastrar:
2

Informe o nome de uma fruta: 
Manga

Informe o nome de uma fruta:
Pêra

Manga
Pêra


*/

public class Programa20 {
    static String frutas[];
    static Scanner teclado = new Scanner(System.in);
    static int i;
    
   
    

    public static void main(String[] args) {
        int qtd;

        System.out.println("Informe a quantidade de frutas para cadastrar: ");
        qtd = Integer.parseInt(teclado.nextLine());

        cadastrar_dados(qtd);

        mostrar_dados(qtd);

        teclado.close();
    }
        /*
        uma função deve ter o seguinte:
        a) tipo de retorno (Tipo de retorno que a função vai retornar);
        b) Nome; CORRRSPONDE A AÇÃO QUE A FUNÇÃO REALIZA
        c) Parametros/Argumentos de entrada (opcional)
        d) Retorno (opcional - depende do tipo de retorno)
        */
        //void = vazio
        static void cadastrar_dados(int quantidade) {
            //Definindo o tamanho do vetor
            frutas = new String[quantidade];

            //3
            //0..2 (0, 1, 2)
            for(i = 0; i < quantidade; i++); {
                System.out.println("Informe a "+ (i + 1) + "fruta: ");
                frutas[i] = teclado.nextLine();
            }
            System.out.println(i);
        }

        static void mostrar_dados(int quantidade) {
            for(i = 2; i >= 0; i--) {
                System.out.println(frutas[i]);
            }
        }
    
    }

