package exercicios_OO.exerciciosFaculdadeOO.aula11;

public class testeIMC {
    public static void main(String[] args) {
        paciente paciente = new paciente();

        paciente.setNome("Daniel");
        paciente.setAltura(1.85);
        paciente.setPeso(80.0);

        paciente.recuperarResultado();
    }
}
