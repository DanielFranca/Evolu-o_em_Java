package Sessao3;


//Operações Matemáticas
public class Programa15 {
    public static void main(String[] args) {
        int num1 = 5,  num2 = 9, res;
        float res2;

        //Soma
        res = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + "é " + res);

        //Subtração
        res = num2 - num1;
        System.out.println("A substração de" + num2 + " - " + num1 + " é " + res);

        //Multiplicação
        res = num1 * num2;
        System.out.println("A multiplicação" + num1 + " * " + num2 + " é " + res);

        //Divisão (Inteira)
        res = num2 / num1;
        System.out.println("A multiplicação de " + num2 + " / " + "é" + res);

        //Divisão (Real)
        res2 = (float)num2 / (float)num1; //cast
        System.out.println("A multiplicação de " + num2 + " / " + num1 + "é" + res2);

        //Módulo 
        res = num1 % 2; //Verifica se o número é par ou impar
        System.out.println("O resto da divisão de " + num1 + " por 2 é " + res);

        res =  num2 % 3;
        System.out.println(num2 + "é divisivel por 3?" + res);
        
    }
}
