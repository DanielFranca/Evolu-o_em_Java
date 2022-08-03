package Sessao3;
//Tipos de dados alfanuméricos
//Caracteres e Strings
public class Programa13 {

    public static void main(String[] args) {
        //Tipos Primitivos
        char letra1 = 'a'; //Aspas simples
        char letra2 = 97; //97 em  decimal é igual a letra A na Tabela ASC
        //char letra4 = "b"; //ERRADO 

        System.out.println("Letra2 " + letra2);

        letra2 = (char) (letra2 + 1); //cast
 
        System.out.println("Letra1 " + letra1);
        System.out.println("Letra2 " + letra2);


        //Tipos não primitivos

        Character letra3 = 'A';
        String nome = "Daniel Franca";

        System.out.println("Letra3 " + letra3);

        System.out.println("char/Character" + Character.SIZE + "bits");

        System.out.println("Valor Min char/Character " + Character.MIN_VALUE); //0
        System.out.println("Valor Max char/Character " + Character.MAX_VALUE); //65535

        System.out.println("nome" + nome);

        System.out.println("Tamnho da string: " + nome.length());

        System.out.println("String " + (Character.SIZE * nome.length()) + "bits"); //nome.length devolve o tamanho da string NOME = Daniel Franca


    }
    
}
