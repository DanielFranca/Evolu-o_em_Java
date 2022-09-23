package Sessao8;

/*
 Crie uma função que recebe como parâmetro um número inteiro e devolve o seu dobro.
 */

public class ex1 {
     public static void dobrar_valor(int valor){
        valor = valor + valor;
        System.out.println(valor);
    }
    public static void main(String[] args) {
        
        dobrar_valor(10);        
    }
    

}

