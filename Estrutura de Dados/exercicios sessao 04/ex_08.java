import java.util.Scanner;

/*
 Faça um programa que leia 10 números e escreva o menor valor lido e o maior valor lido.
 */

public class ex_08 {
   
    

    public static void main(String[] args) {
            Scanner verifica = new Scanner(System.in);
                int a, b, c, d, e, f, g, h, i, j;  
                int menor = 0;
                int maior = 0;
                
                for(int k = 0; k < 10; i++){
                System.out.println("Digite 10 numeros: ");
                a = verifica.nextInt();            
                b = verifica.nextInt();           
                c = verifica.nextInt();           
                d = verifica.nextInt();            
                e = verifica.nextInt();            
                f = verifica.nextInt();           
                g = verifica.nextInt();            
                h = verifica.nextInt();            
                i = verifica.nextInt();
                j = verifica.nextInt();
                k++;

                if((a < b) && (a < c) && (a < d) && (a < e) && (a < f) && (a < g) & (a < h) && (a < i) && (a < j)){
                    menor = a;
                }else if((b < a) && (b < c) && (b < d) && (b < e) && (b < f) && (b < g) & (b < h) && (b < i) && (b < j)) {
                    menor = b;
                }else if((c < a) && (c < b) && (c < d) && (c < e) && (c < f) && (c < g) & (c < h) && (c < i) && (c < j)) {
                    menor = c;
                }else if((c < a) && (c < b) && (c < d) && (c < e) && (c < f) && (c < g) & (c < h) && (c < i) && (c < j)) {
                    menor = d;
                }else if((e < a) && (e < b) && (e < c) && (e < d) && (e < f) && (e < g) & (e < h) && (e < i) && (e < j)) {
                    menor = e;
                }else if((f < a) && (f < b) && (f < c) && (f < d) && (f < e) && (f < g) & (f < h) && (f < i) && (f < j)) {
                    menor = f;
                }else if((g < a) && (g < b) && (g < c) && (g < d) && (g < e) && (g < f) & (g < h) && (g < i) && (g < j)) {
                    menor = g;
                }else if((h < a) && (h < b) && (h < c) && (h < d) && (h < e) && (h < f) & (h < g) && (h < i) && (h < j)) {
                    menor = h;
                }else if((i < a) && (i < b) && (i < c) && (i < d) && (i < e) && (i < f) & (i < g) && (i < h) && (i < j)) {
                    menor = i;
                }else if((j < a) && (j < b) && (j < c) && (j < d) && (j < e) && (j < f) & (j < g) && (j < h) && (j < i)) {
                    menor = j;
                }
                System.out.println("o menor é: " + menor);

                if((a > b) && (a > c) && (a > d) && (a > e) && (a > f) && (a > g) & (a > h) && (a > i) && (a > j)){
                    maior = a;
                }else if((b > a) && (b > c) && (b > d) && (b > e) && (b > f) && (b > g) & (b > h) && (b > i) && (b > j)) {
                    maior = b;
                }else if((c > a) && (c < b) && (c > d) && (c > e) && (c > f) && (c > g) & (c > h) && (c > i) && (c > j)) {
                    maior = c;
                }else if((c > a) && (c > b) && (c > d) && (c > e) && (c > f) && (c > g) & (c > h) && (c > i) && (c > j)) {
                    maior = d;
                }else if((e > a) && (e > b) && (e > c) && (e > d) && (e > f) && (e > g) & (e > h) && (e > i) && (e > j)) {
                    maior = e;
                }else if((f > a) && (f > b) && (f > c) && (f > d) && (f > e) && (f > g) & (f > h) && (f > i) && (f > j)) {
                    maior = f;
                }else if((g > a) && (g > b) && (g > c) && (g > d) && (g > e) && (g > f) & (g > h) && (g > i) && (g > j)) {
                    maior = g;
                }else if((h > a) && (h > b) && (h > c) && (h > d) && (h > e) && (h > f) & (h > g) && (h > i) && (h > j)) {
                    maior = h;
                }else if((i > a) && (i > b) && (i > c) && (i > d) && (i > e) && (i > f) & (i > g) && (i > h) && (i > j)) {
                    maior = i;
                }else if((j > a) && (j > b) && (j > c) && (j > d) && (j > e) && (j > f) & (j > g) && (j > h) && (j > i)) {
                    maior = j;
                }
                System.out.println("o maior é: " + maior);
                break;
            }
    }
}


