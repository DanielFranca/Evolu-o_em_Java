import java.util.Scanner;

/*
  Leia o salário de um trabalhador e o valor da prestação de um empréstimo. Se a prestação 
  for maior que 20% do salário imprima: "Empréstimo não concedido, caso contrário imprima:
  "Empréstimo concedido";
 */

public class ex_10 {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);
        float salario;
        float prestação;
        float calcular;

        System.out.println("Digite seu salário: " );
        salario = verifica.nextFloat();
        System.out.println("Digite a parcela da prestação do empréstimo: ");
        prestação =  verifica.nextFloat();

        calcular = (prestação * 100 / salario);
        System.out.println("Sua prestação equivale a " + calcular + "% do seu salário!");
        if(calcular > 20){
            System.out.println("Empréstimo não concedido!");
        }else{
            System.out.println("Empréstimo concedido!");
        }
    }
}
