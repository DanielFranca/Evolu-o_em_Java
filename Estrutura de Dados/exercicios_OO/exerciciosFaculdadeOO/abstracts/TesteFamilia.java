package exercicios_OO.exerciciosFaculdadeOO.abstracts;

public class TesteFamilia {
    public static void main(String[] args) {
        Familia pai = new Pai("João", 40, "Masculino", "Analista de Informacoes Gerenciais de RH");
        Familia mae = new Mae("Maria", 35, "Feminino", "Enfermeira");
        Familia filho = new Filho("Pedro", 15, "Masculino", "ADS");
        
        pai.falar();
        mae.falar();
        filho.falar();
    }
}
