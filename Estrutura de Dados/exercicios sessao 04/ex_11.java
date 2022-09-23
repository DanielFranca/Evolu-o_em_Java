import java.util.Scanner;

/*
 Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu peso ideal, utilizando
 as seguintes fórmulas (onde h corresponde a altura).
 */
public class ex_11 {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);
        String sexo;
        double altura;
        double pesoIdeal;

        System.out.println("Qual seu sexo?: ");
        sexo = verifica.next();
        System.out.println("Qual sua altura?: ");
        altura = verifica.nextDouble();

        if(sexo.contains("Masculino")){ //.contains é usado para verificar uma sequencia de caracteres recebida na variavel.
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        }else if(sexo.contains("Feminino")){
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        }
        System.out.println("Fim!");
    }
    
}
