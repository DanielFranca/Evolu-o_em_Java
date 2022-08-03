package Sessao6;


/*


*/

public class heranca {
 public static void main(String[] args) {
     pessoa p1 = new pessoa("Daniel França \n",  2003, "danielfranca.tech@gmail.com");
     System.out.println(p1);
     System.out.println("\n");

     aluno a1 = new aluno("Daniel leite \n", 2003, "daniel.leite@outlook.com", "1458546845");
     System.out.println(a1);
     System.out.println("\n");


     professor prof1 = new professor("Daniel Anunciação\n", 2021, "ABC987", "daniel.anunciacao21@gmail.com");
     System.out.println(prof1);
     System.out.println("\n");

     
 }
}
