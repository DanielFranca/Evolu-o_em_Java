import java.util.Scanner;
//@Daniel França 
/*
 A nota final de um estudante é calculada a partir de três notas atríbuidas entre o intervalo 
 0 até 10, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. 
 A média das três notas mencionadas anteriormente obedece aos pesos: Trabalho de laboratório: 2;
 Avaliação Semestral: 3; Exame Final: 5; De acordo com o resultado, mostre na tela se o aluno está 
 reprovado (média entre 0 e 2,9) de recuperação (entre 3 e 4,9) ou se foi aprovado. Faça todas as
 verificações necessárias.
  */

public class ex_14 {
    public static void main(String[] args) {
        Scanner provas = new Scanner(System.in);
        float TrabalhoLab;
        float AvaliacaoSemestral;
        float ExameFinal;
        float media;

        for(int i = 1; i <= 3; i++)
        System.out.println("Por favor digite a nota das suas 3 provas: ");
        TrabalhoLab = provas.nextFloat();
        System.out.println("Prova 1, ok.");
        AvaliacaoSemestral = provas.nextFloat();
        System.out.println("Prova 2, ok.");
        ExameFinal = provas.nextFloat();
        System.out.println("Prova 3, ok.");
        
        media = ((TrabalhoLab * 2) + (AvaliacaoSemestral * 3) + (ExameFinal * 5));
        //System.out.println(media); *verificando a consistência do código
        media = media / 10;

        
        if((media == 3 || 3 >= 4.9) ){
            System.out.println("Calma aí. Você ainda tem uma chance, está na recuperação! A sua média é: " + media);
        }else if((media <= 2.9)){
            System.out.println("Deu ruim. Você foi reprovado! A sua média é: " + media);
        }else if((media > 4.9)){
            System.out.println("Parabéns! Você foi aprovado! A sua média é: " + media);
        }
    }
}
