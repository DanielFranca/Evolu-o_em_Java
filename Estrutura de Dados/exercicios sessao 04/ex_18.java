/*
 * Leia a idade e o tempo de serviço de um trablahador e escreva se ele pode ou não se aposentar. As condições para aposentadoria são:
 * Ter pelo menos 65 anos;
 * Ou ter trabalhado pelo enos 30 anos;
 * Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos.
 */


import java.util.Scanner;

public class ex_18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;
        int tempoServico;

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Digite seu Tempo de serviço: ");
        tempoServico = entrada.nextInt();

        if(idade == 65){
            System.out.println("Deferido a aposentadoria!");
        } else if (tempoServico == 30){
            System.out.println("Deferido a aposentadoria!");
        } else if((idade == 60) && (tempoServico == 25)){
            System.out.println("Deferido a aposentadoria!");
        } else {
            System.out.println("Indeferido! Você ainda não atingiu os requisitos de aposentadoria.");
        }


    }
}
