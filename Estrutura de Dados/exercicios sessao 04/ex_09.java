import java.util.Scanner;

/*
  Faça um programa que leia 2 notas de um aluno, verifique se as notas são válidas e exiba na tela 
  a média destas notas. Uma nota válida deve ser, obrigatoriamente, um valor entre 0.0 e 10.0, 
  onde caso a nota não possua um valor válido, este fato deve ser informado e o programa termina.
 */

public class ex_09 {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);
        double nota1;
        double nota2;

        for(int i = 1; i <= 2; i++){
            System.out.println("Digite a nota "  + i + " : ");
            nota1 = verifica.nextDouble();            
            nota2 = verifica.nextDouble();     
            if((nota1 < 0.0) && (nota2 < 0.0) && (nota1 > 10.0) && (nota2 > 10.0)){
                System.out.println("insira uma nota válida!");
                 }else{
                 System.out.println("As suas notas são: "  + nota1 + " e " + nota2);
            }
            i++;

        }
    }
}
