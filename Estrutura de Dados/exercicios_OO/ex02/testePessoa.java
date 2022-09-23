package exercicios_OO.ex02;

//Construtor
/*
-  construtor de uma classe Sempre tem o mesmo nome da classe;
- Por padrão a JVM (Java Virtual Machine) cria em tempo de execução um construtor padrão.
- Podemos ter mais de um construtor na classe;
- Sempre um construtor vazio tem a seguinte forma:
Public Nome da classe(){}
obs: mesmo sem criar um construtor a JVM cria uns contrutor com parametro vazio 

*/
public class testePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); // (Método) Construtor sem parâmetros

        pessoa1.nome = "Felicity Jones";
        pessoa1.email = "Felicity@gmail.com";
        pessoa1.ano_nascimento = 2003;

        pessoa1.imprime_informacoes();

        Pessoa pessoa2 = new Pessoa("Angelina Jolie", "angelina@gmail.com", 1976); //Com parâmetros
        pessoa2.imprime_informacoes();

    }
}
