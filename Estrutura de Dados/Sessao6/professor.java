package Sessao6;

public class professor extends pessoa {
    private String matricula;


    public professor(String nome, int ano_nascimento, String matricula, String email) {
        super(nome, ano_nascimento, email);
        this.matricula = matricula;
    }

    public String getmatricula(){
        return this.matricula;
    }

    public void setmatricula(String matricula) {
        this.matricula = matricula;
    }

}
