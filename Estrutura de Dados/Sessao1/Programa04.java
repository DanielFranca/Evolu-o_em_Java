package Sessao1;
//if, else, if, else if
public class Programa04 {
    public static void main(String[] args){
        //Declarando e inicializando uma variável
        int numero = 4;

        // Se número for maior que 5 então  execute o que está aqui dentro
        if(numero > 5 ) {
            System.out.println("O numero " + numero + " é maior que 5");
        }else if(numero == 5) {
            System.out.println("o numero " + numero + " é igual 5");
        }else if(numero % 2 == 0) { // VERIFICANDO SE O NÚMERO É PAR
            System.out.println("O número " + numero + " é par");
        }else{
            System.out.println("Não, o número " + numero + " Não é maior que 5");
        }
    }
}
