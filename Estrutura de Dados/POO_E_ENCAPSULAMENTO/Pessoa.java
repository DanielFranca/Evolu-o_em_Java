package POO_E_ENCAPSULAMENTO;
//Classes

/*
- O nome das classes inicia  com letra maiúscula;
- O nome não deve conter: Acentuação, Caracteres especiais, espaço
- Nas classes Java, não existe a implementação da função main()
- Toda classe Java possui a seguinte forma:
- O nome da classe Java deve ser o mesmo nome do arquivo Java
- Tudo que estiver dentro das Chaves {} faz parte da classe.
public class NomeDaClasse{
    

}

//Atributos
- São as características da classe/molde/modelo de dados;
- Podemos entender atributos como variáveis da classe;
- Uma outra forma de nomenclatura para os atributos são estados;

//Métodos
- Podemos entender os métodos como a ação que é realizada por um objeto da classe;
- Podemos entender também que os métodos são comportamentos da nossa classe ou dos objetos da classe;
- Mesmo requisitos para funções:
  A) Tipo um retorno (Tipo de dados que a função vai retornar);
  B) Nome- Corresponde a ação que a função realiza;
  C) Parâmetros/Argumentos de entrada (Opcional);
  D) Retorno (Opcional - depende do tipo de retorno);
*/

public class Pessoa {
    String nome, email;  
    int ano_nascimento;

    //Construtor vazio
    public Pessoa() {}

    //Construtor com parâmetros
    public Pessoa(String nome, String email, int ano_nascimento) {
        //This == Este objeto
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprime_informacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Ano de Nascimento: " + this.ano_nascimento);
    }
    }

    



    

