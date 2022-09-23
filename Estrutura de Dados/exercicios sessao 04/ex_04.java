/*
 Escrva um programa que declare um inteiro, inicialize-o com 0, e incremente-0 de 1000
 em 1000, imprimindo seu valor na tela, até que seu valor seja 100.000(cem mil).

 */


public class ex_04 {
    public static void main(String[] args) {
        int cont = 0;

        while(cont < 100000){
            cont = cont + 1000;
            System.out.println(cont);
        }
    }
}
