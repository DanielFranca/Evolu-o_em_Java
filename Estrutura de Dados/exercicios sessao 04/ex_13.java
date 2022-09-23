import java.util.Scanner;

/*
 Faça um algoritmo que calcule a média ponderada das notas de 3 provas. A primeira e a segunda prova
 tem peso 1 e a terceira tem peso 2. Ao final, mostrar a média do aluno e indicar se o aluno foi aprovado
 ou reprovado. A nota para aprovação deve ser igual ou superior a 6 pontos.
 */


public class ex_13 {
    public static void main(String[] args) {
        Scanner provas = new Scanner(System.in);
        float p1;
        float p2;
        float p3;
        float media;

        for(int i = 1; i <= 3; i++)
        System.out.println("Por favor digite a nota das suas 3 provas: ");
        p1 = provas.nextFloat();
        System.out.println("Prova 1, ok.");
        p2 = provas.nextFloat();
        System.out.println("Prova 2, ok.");
        p3 = provas.nextFloat();
        System.out.println("Prova 3, ok.");
        
        media = ((p1 * 1) + (p2 * 1) + (p3 * 2));
        media = media / 4;
        
        if(media < 6){
            System.out.println("Deu ruim. Você foi reprovado! A sua média é: " + media);
        }else if(media > 6){
            System.out.println("Parabéns! Você foi aprovado! A sua média é: " + media);
        }
        
    }
}
