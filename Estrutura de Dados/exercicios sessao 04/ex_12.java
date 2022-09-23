import java.util.Scanner;

/*
 Escreva um programa que leia um número inteiro maior do que zero e devolva, na tela, a soma de todos
 os seus algarismos. Por exemplo, ao número 251 corresponderá o valor 8(2 + 5 + 1). Se o número lido
 não for maior do que zero, o programa terminará com a mensagem "Número inválido"
 */

public class ex_12 {
    public static void main(String[] args) {
        Scanner guarda = new Scanner(System.in);
        int numero; 
        int soma = 0;

        System.out.println("Digite um número: ");
        numero = guarda.nextInt();
        
        if(numero > 0) {   
            soma += (numero % 10);
            numero = (numero / 10);
            System.out.println("O valor da soma dos algarismo é: " + soma);
        }else if(numero <= 0){
            System.out.println("Número inválido");
        }

        System.out.println("A soma de todos seus algarismos é: " + soma);
    }
}
