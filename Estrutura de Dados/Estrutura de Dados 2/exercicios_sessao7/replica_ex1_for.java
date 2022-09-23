package exercicios_sessao7;

import java.util.Scanner;

public class replica_ex1_for {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeros [] = new int[6];

        for(int i = 0; i < numeros.length; i++){
        System.out.println("Informe um número: ");
        numeros[i] = entrada.nextInt(); 
       
        }
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        System.out.println(numeros[5]);
        
    }

}
