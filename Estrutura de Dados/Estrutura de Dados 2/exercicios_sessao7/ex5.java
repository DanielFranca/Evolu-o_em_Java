package exercicios_sessao7;

/*
 Leia um vetor de 10 posições. Contar e escrever quantos valores pares eles possuem.
 */
public class ex5{
    public static void main(String[] args) {
        int vetor[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int cont = 0;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                cont++;
            }
        }
        System.out.println("Temos o total de " + cont + "números pares!");
    }
}