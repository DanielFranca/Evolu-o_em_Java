package exercicios_OO.exerciciosFaculdadeOO.aula11;

public class paciente {
    private String nome;
    private double peso;
    private double altura;
    
    public paciente(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        if (validarNome(nome) == true) {

            this.nome = nome;

        }

    }

    public double getPeso() {

        return peso;

    }

    public void setPeso(double peso) {

        if (validarPeso((Double.toString(getPeso()))) == true) {

            this.peso = peso;

        }

    }

    public double getAltura() {

        return altura;

    }

    public void setAltura(double altura) {

        if (validarAltura((Double.toString(getAltura()))) == true) {

            this.altura = altura;

        }

    }
    
    public paciente(){

    }

    public boolean validarNome(String nome){
        
        if((nome.length() > 3) && (nome.length() <= 50 )){
            System.out.println("Nome válido " + nome);
            return true;
        }else{
            System.out.println("Nome inválido! ");
            return false;
        }

    }

    public boolean validarPeso(String peso){
        double pesoDouble = Double.parseDouble(peso);
        if(pesoDouble > 0.0 && pesoDouble < 350.0){
            System.out.println("Peso válido" + peso);
            return true;
        }else{
            System.out.println("Peso inválido!");
            return false;
        }

    }
    public boolean validarAltura(String altura){
        double alturaDouble = Double.parseDouble(altura);
        if((alturaDouble > 0.0) && (alturaDouble <= 2.5)){
            System.out.println("Altura válida! " + altura);
            return true;
        }
        System.out.println("Altura inválida!");
        return false;
    }

    public double calcularIMC(){
        double IMC = (this.peso / (this.altura * this.altura));
        return IMC;
    }

    public String classificarIMC(){
        double verImc = calcularIMC();
        String classe;

        if(verImc < 18.5){
            classe = "Abaixo do peso! ";
        }else if(verImc >= 18.5 && verImc <= 24.9){
            classe = "peso normal! ";
        }else if(verImc >= 25.0 && verImc <= 29.9){
            classe = "Sobrepeso!";
        }else if(verImc >= 30.0 && verImc <= 34.9){
            classe = "Obesidade Grau 1";
        }else if(verImc >= 35.0 && verImc <= 39.9){
            classe = "Obesidade Grau 2";
        }else{
            classe = "Obesidade Grau 3";
        }
    return classe;
}

    public String recuperarResultado(){
        System.out.println("Nome " + this.nome);
        System.out.println("Altura" + this.altura);
        System.out.println("Peso " + this.peso);
        System.out.println("Imc " + calcularIMC());
        System.out.println("Classificação do iMC" + classificarIMC());
    
        return null;
    }


}

