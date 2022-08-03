package POO_E_ENCAPSULAMENTO;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TesteScanner {
    public static void main(String[] args) {
        int i; //Variável Simples: só declara
        /*Scanner s; //Variável referência de objeto: declara
        s = new Scanner(System.in); // */

        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("digite um inteiro:");
        i = scanner.nextInt();
        System.out.println("Digite um decimal");
        double d = scanner.nextDouble();
        System.out.println("Digite true ou false");
        boolean opcao = scanner.nextBoolean();

        JOptionPane.showMessageDialog(null, "inteiro: " + i + "\ndecimal: " + d + "\nlogico: " + opcao, "meus valores", JOptionPane.INFORMATION_MESSAGE);
    
        System.out.println("Primeira String:");
        String s1 = scanner.next();
        System.out.println("Segunda String: ");
        String s2 = scanner.nextLine();
        System.out.println("Terceira String: ");
        String s3 = scanner.nextLine();

        JOptionPane.showMessageDialog(null, "s1: " + s1 +"\ns2: " + s2 + "\ns3" + s3, "PRESSTENÇAO", JOptionPane.WARNING_MESSAGE);

        scanner.close();//free - evitgar vazamento de memória 
               
    }
}

