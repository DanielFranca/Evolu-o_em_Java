import java.util.Scanner;

/*
 Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mês
 correspondente a este número. Isto é, janeiro se 1, fevereiro se 2, e assim por diante.
 */

public class ex_16 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String mes;
        int numero;

       System.out.println("Digite um numero: ");
       numero = sr.nextInt();
       
       switch (numero) {
        case 1:
            mes = "Janeiro";
            break;
        case 2:
            mes = "Fevereiro";
            break;
        case 3:
            mes = "Março";
            break;
        case 4:
            mes = "Abril";
            break;
        case 5:
            mes = "Maio";
            break;
        case 6:
            mes = "Junho";
            break;
        case 7:
            mes = "Julho";
            break;
        case 8:
            mes = "Agosto";
            break;
        case 9:
            mes = "Setembro";
            break;
        case 10:
            mes = "Outubro";
            break;
        case 11:
            mes = "Novembro";
            break;
        case 12:
            mes = "Dezembro";
            break;
        
        default:
            mes = "Mes inválido";
            break;
    }
    System.out.println("Mes: " + mes);
    sr.close();
    }
 }

