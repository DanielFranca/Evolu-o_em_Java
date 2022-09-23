import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

/*
 Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia da semana
 correspondente a este numero. Isto é, domingo se 1, segunda-feira se 2, e assim por diante.
 */
public class ex_15 {
    public static void main(String[] args) {
       Scanner sr = new Scanner(System.in);
       String dia;
       int numero;

       System.out.println("Digite um dia: ");
       numero = sr.nextInt();
       
       switch (numero) {
        case 1:
            dia = "Domingo";
            break;
        case 2:
           dia = "Segunda-Feira";
            break;
        case 3:
            dia = "Terça-Feira";
            break;
        case 4:
            dia = "Quarta-Feira";
            break;
        case 5:
            dia = "Quinta-Feira";
            break;
        case 6:
            dia = "Sexta-Feira";
            break;
        case 7:
            dia = "Sábado";
            break;
        default:
            dia = "Dia inválido";
            break;
    }
    System.out.println("Dia da semana: " + dia);
    sr.close();
    }
}
