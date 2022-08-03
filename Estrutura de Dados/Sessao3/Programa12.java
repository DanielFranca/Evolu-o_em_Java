package Sessao3;
//Tipos de dados
//Numéricos (Inteiros e Reais)

public class Programa12 {

    public static void main(String[] args) {
    //Tipos Primários/Primitivos
    //Por padrão, os números reais em Java são considerados double
    float preco1 = 23.4f; // ocupa menos espaço na memória
    double preco2 = 23.4; // ocupa um espaço maior na memória

    //Tipos não primários e não primitivcos
    Float preco3 = 44.5f;
    Double preco4 = 44.5;

    System.out.println("float - > preco1 = " + preco1);
    System.out.println("double - > preco2 = " + preco2);
    System.out.println("float - > preco3 = " + preco3);
    System.out.println("double - > preco4 = " + preco4);

    System.out.println("Valor Min float/Float " + Float.SIZE + " bits ");
    System.out.println("Valor Max double/Double " + Double.SIZE + " bits");

    System.out.println("Valor Min float/Float " + Float.MIN_VALUE);
    System.out.println("Valor Max float/Float " + Float.MAX_VALUE);

    System.out.println("Valor Min double/Double " + Double.MIN_VALUE);
    System.out.println("Valor Max double/Double " + Double.MAX_VALUE);

    }
}
