package Sessao2;
import java.util.Scanner;

//FOR

public class Programa09 {
    public static void main(String[] args) {
        int idade;
        String nome;

        // Para receber dados do usuário via teclado
        Scanner teclado = new Scanner(System.in);

        //Variável de controle; Condição de parada; Forma de Incremento
        //i++  = i + 1
        for (int i = 0; i < 5; i++) {
            System.out.println("informe seu nome: ");
            nome = teclado.nextLine(); //next = string com nome unico - nextline = string com dois nomes

            System.out.println("Informe sua idade: ");
            //idade = teclado.nextInt(); //BUG!!!!!!!!!!!!!!!
            idade = Integer.parseInt(teclado.nextLine());
            
            if(idade > 0) {
            System.out.println(nome + " tem " + idade + "anos");
            }

        teclado.close();
    }
    
}
}
