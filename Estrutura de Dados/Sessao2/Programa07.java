package Sessao2;
import java.util.Scanner;

/*
* Receba dados do usuário enquanto a idade for maior que 0
*/
//While
public class Programa07 {
    public static void main(String[] args) {

            int idade = 1;
            String nome;
       
            // Para receber dadps do usuário via teclado
            Scanner teclado = new Scanner(System.in);

            while( idade > 0) {

            System.out.println("informe seu nome: ");
            nome = teclado.nextLine(); //next = string com nome unico - nextline = string com dois nomes

            System.out.println("Informe sua idade: ");
            //idade = teclado.nextInt(); //BUG!!!!!!!!!!!!!!!
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome + " tem " + idade + "anos");

            }


            teclado.close();
    }
}
