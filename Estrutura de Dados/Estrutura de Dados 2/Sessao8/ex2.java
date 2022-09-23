package Sessao8;

import java.util.Scanner;

/*
 Faça uma função para verificar se um número é positivo ou negativo. Sendo que o valor 
 de retorno será 1 se positivo, -1 se negativo e 0 se for igual a 0;
 */
public class ex2 {
    public static boolean verifica(int numero){
        if(numero < 0){
            System.out.println("-1");
        } else if(numero > 0){
            System.out.println("1");
        } else if(numero == 0){
            System.out.println("0");
        }

       
        return false;
    }

    public static void main(String[] args) {
        verifica(10);
    }
}
        

