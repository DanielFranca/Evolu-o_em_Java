package Sessao8;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

/*
 Faça uma função que receba a distância em km e a quantidade de litros de gasolina
 consumidos por um carro em um percursom calcule o consumo em Km/l e escreva uma mensagem de acordo 
 com a tabela abaixo:
  

 - menor que 8 = venda o carro
 - entre  8 e 14 = economico
 - maior que 12 super economico.
 */

public class ex4 {
    public static void distancia(){
        int km;
        int litros;
        int consumo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos km o seu carro percorreu: ");
        km = entrada.nextInt();
        System.out.println("Quantos litros o seu carro comsumiu: ");
        litros = entrada.nextInt(); 
        
         consumo = (km / litros);

         if(consumo < 8){
            System.out.println("Venda o carro!");
         } else if((consumo >= 8) && (consumo <= 14)){
            System.out.println("Econômico");
         }else if(consumo == 12){
            System.out.println("Super Econômico");
         }        
    }
            public static void main(String[] args) {
             distancia();
            }
}
