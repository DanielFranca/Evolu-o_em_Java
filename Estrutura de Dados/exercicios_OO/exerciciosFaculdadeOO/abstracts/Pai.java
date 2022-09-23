package exercicios_OO.exerciciosFaculdadeOO.abstracts;

public class Pai extends Familia {
    private String profissao;
    
    public Pai(String nome, int idade, String sexo, String profissao) {
        super(nome, idade, sexo);
        this.profissao = profissao;
    }
    
    public String getProfissao() {
        return profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    @Override
    public void falar() {
        System.out.println("Olá, eu sou o " + getNome() + " e tenho " + getIdade() + " anos e trabalho como " + getProfissao() + ".");
    }
}
