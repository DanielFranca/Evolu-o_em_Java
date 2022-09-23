import java.util.Scanner;



/*  Leia um número fornecido pelo usuário. Se esse número for positivo, calcule a raiz quadrada do número. Se o número
for negativo, mostre uma mensagem dizendo que o número é inválido.
*/

public class ex_02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero;

        
        System.out.printf("Digite um número: " + "\n");
        numero = scanner.nextInt();
        System.out.println("Seu numero é " + numero + "\n");

        if(numero < 0){
            System.out.println("o numero " + numero + "é negativo" + "\n");
            
        }else{
            System.out.println("o numero" + numero + "é positivo" + "\n");
            System.out.println("Raiz de" + numero + "é = " + Math.sqrt(numero) + "\n");
        }
    }

    
    
}
