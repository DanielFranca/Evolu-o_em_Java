package POO_E_ENCAPSULAMENTO;
//Classes

//Atributos

/*
- O nome das classes inicia  com letra maiúscula;
- O nome não deve conter: Acentuação, Caracteres especiais, espaço
- Nas classes Java, não existe a implementação da função main()
- Toda classe Java possui a seguinte forma:
- O nome da classe Java deve ser o mesmo nome do arquivo Java
public class NomeDaClasse{
    

}
- Tudo que estiver dentro das Chaves {} faz parte da classe.

//Atributos
- São as características da classe/molde/modelo de dados;
- Podemos entender atributos como variáveis da classe;
- Uma outra forma de nomenclatura para os atributos são estados;
- Os atributos são nomeados em letras minúsculas, sem espaços, sem caracteres especiais, sem acentuação

//Métodos
- Podemos entender os métodos como a ação que é realizada por um objeto da classe;
- Podemos entender também que os métodos são comportamentos da nossa classe ou dos objetos da classe;
- Mesmo requisitos para funções:
  A) Tipo um retorno (Tipo de dados que a função vai retornar);
  B) Nome- Corresponde a ação que a função realiza;
  C) Parâmetros/Argumentos de entrada (Opcional);
  D) Retorno (Opcional - depende do tipo de retorno);

*/

public class Produto {
    String nome;  
    float preco;
    float desconto;
    
    //Método para aumentar o preço do produto em 10
    void aumentar_preco(float valor){
        this.preco = this.preco + valor;
    }

    
}
