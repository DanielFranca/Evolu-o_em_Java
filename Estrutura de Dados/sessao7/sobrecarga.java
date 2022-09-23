package sessao7;


//sobrecarga de método

/*
 - conhecido também como overloading 

 Ocorre quando, sobreescrevemos um método na mesma classe de declaração.
 */
public class sobrecarga {

    public class Generos {
        private String nome;
        private int ano_nascimento;
        private String email;

        public Generos(){}

        public Generos(String nome, int ano_nascimento, String email) {
            this.nome = nome;
            this.ano_nascimento = ano_nascimento;
            this.email = email;
        }
    }

    public void mensagem(){
    System.out.println("Esta é uma mensagem...");}
    
}
