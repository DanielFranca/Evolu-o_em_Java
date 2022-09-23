package exercicios_OO.exerciciosFaculdadeOO.abstracts;

public class Filho extends Familia {
    private String faculdade;
    
    public Filho(String nome, int idade, String sexo, String faculdade) {
        super(nome, idade, sexo);
        this.faculdade = faculdade;
    }
    
    public String getfaculdade() {
        return faculdade;
    }
    
    public void setfaculdade(String faculdade) {
        this.faculdade = faculdade;
    }
    
    @Override
    public void falar() {
        System.out.println("Olá, eu sou o " + getNome() + " e tenho " + getIdade() + " anos e faço " + getfaculdade() + ".");
    }
}
