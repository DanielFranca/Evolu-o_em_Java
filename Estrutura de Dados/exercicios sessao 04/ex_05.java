import java.util.Scanner;

/*
 Faça um programa que peça ao usuário para digitar 10 valores, recebendo um por um,  e some-os.
 */

public class ex_05 {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);
        int v1, v2, v3, v4, v5, v6, v7, v8, v9, v10;  
        int soma;

        // Neste exercício poderia ser feito um laço for, mas como era exigido que recebesse um valor por vez, foram criados diversos sysout para
        // o que foi pedido.
        System.out.println("Digite um valor: ");
        v1 = verifica.nextInt();
        System.out.println("Digite um valor: ");
        v2 = verifica.nextInt();
        System.out.println("Digite um valor: ");
        v3 = verifica.nextInt();
        System.out.println("Digite um valor: ");
        v4 = verifica.nextInt();
        System.out.println("Digite um valor: ");
        v5 = verifica.nextInt();
        System.out.println("Digite um valor: ");
        v6 = verifica.nextInt();
        System.out.println("Digite um valor: ");
        v7 = verifica.nextInt();
        System.out.println("Digite um valor: ");
        v8 = verifica.nextInt();
        System.out.println("Digite um valor: ");
        v9 = verifica.nextInt();
        System.out.println("Digite um valor: ");
        v10 = verifica.nextInt();    
        
        soma = v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10;
        System.out.println("A soma de todos os valores é = " + soma);
    }
}



