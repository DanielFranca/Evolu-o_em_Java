package Sessao2;
import java.util.Scanner;

/*
Receba os dados do usuário enquanto a idade for maior que 0
*/

// Do While

public class Programa08 {
    public static void main(String[] args) {

        int idade = 1;
        String nome;
   
        // Para receber dados do usuário via teclado
        Scanner teclado = new Scanner(System.in);

        //Primeiro executa o bloco depois faz a checagem
        do {
            System.out.println("informe seu nome: ");
            nome = teclado.nextLine(); //next = string com nome unico - nextline = string com dois nomes

            System.out.println("Informe sua idade: ");
            //idade = teclado.nextInt(); //BUG!!!!!!!!!!!!!!!
            idade = Integer.parseInt(teclado.nextLine());
            
            if(idade > 0) {
            System.out.println(nome + " tem " + idade + "anos");
            }
        } while (idade > 0);


        teclado.close();
}
}


