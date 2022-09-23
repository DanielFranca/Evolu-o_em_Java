import java.util.Scanner;
/*
 Faça um programa que leia 10 inteiros, some-os e imprima sua média no final.
 */

public class ex_06 {
    

        public static void main(String[] args) {
            Scanner verifica = new Scanner(System.in);
            int v1, v2, v3, v4, v5, v6, v7, v8, v9, v10;  
            int soma;
            int media;
            
            for(int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            v1 = verifica.nextInt();            
            v2 = verifica.nextInt();           
            v3 = verifica.nextInt();           
            v4 = verifica.nextInt();            
            v5 = verifica.nextInt();            
            v6 = verifica.nextInt();           
            v7 = verifica.nextInt();            
            v8 = verifica.nextInt();            
            v9 = verifica.nextInt();
            v10 = verifica.nextInt();
            i++;
                
            soma = v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10;
            media = soma / 10;
            System.out.println("A media dos valores é: " + media);
            break;
        }
        
    
    }
}
    