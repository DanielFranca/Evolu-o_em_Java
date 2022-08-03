package Sessao1;
//Operador ternário

//Se você precisar criar a função Main() //Programa java
// --> Digitar Main e no teclado pressionar CTRL + Espaço

public class Programa05 {
    
    public static void main(String[] args) {
        int valor = -3, numero;

        /*
        if(valor > 0) {
            numero = valor;
        }else {
            numero = 7;

        }
        */

        //Operador ternário
        numero = (valor > 0) ? valor : 7;

        System.out.println(numero);
    }
    
}
