package Sessao5;
/*import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Ordenacao {

    static void geraVetor (int[] v, int n) { //gerar vetor sem repetição
        Random random = new Random();
        for (int i=0; i<n; i++)
            v[0] = random.nextInt(n * 10); //Gera um vetor randômico com valores de 0 a tamanho * 10 - 1
            for (int i=1; i<n; i++) {
                int aux = random.nextInt(n * 10);
                boolean repetir = false;
                int j=1;
                while (i>=0 && !repetir) {
                    if (v[j] == aux)  {
                        repetir = true;
                        i--;
                    }
                    j--;
                }
                if (!repetir) {
                    v[i] = aux;
                }
            }                               // não pode colocar print
    }

    static void exibeVetor (int[] v, int n, String msg) {
        System.out.println("\n" + msg + ":");
        for(int i=0; i<n; i++)
            System.out.println(v[i] + " ");
        System.out.println();
    }
    static void bubblesort (int[] v, int n) {
        int i, j, temp;
        for (i=1; i<n; i++) {
            for (j=0; j<n-1; j++) {
                if (v[j] > v[j+1]) {
                    temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
    }
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    System.out.println("digite o tamanho do vetor (0 encerra): ");
    int n = scanner.nextInt();
    while (n > 0) {
        int [] v = new int[n];
        geraVetor (v, n);
        exibeVetor (v, n, "vetor original");
        Date date1 = new Date();
        long inicio = date1.getTime();
        bubblesort (v, n);
        long fim = new Date().getTime();
        System.out.println("Para n = " + n + "a ordenação demorou " + (fim-inicio) + "ms");
        exibeVetor(v, n, "vetor ordenado");

        System.out.print("digite o novo tamanho do vetor (0 encerra): ");
        n = scanner.nextInt();
    }
    scanner.close();
}
}
*/