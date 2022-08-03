package Sessao6;
//CLASSE BASE PARA CLASSE ALUNO QUE USA A CLASSE PESSOA COMO HERANÇA 

/*
Classe mae
Classe pai
super classe
Classe genérica

*/

public class pessoa {
    private String nome;
    private int ano_nascimento;
    private String email;

    public pessoa(String nome, int ano_nascimento, String email){
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }

    public String getNome(){  //pega e devolve nome
        return this.nome;
    }
    public void setNome(String nome){ // recebe e insere valor 
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return this.ano_nascimento;
    }

    public void setAnoNascimento(int ano_nascimento){
        this.ano_nascimento = ano_nascimento;
    }
    public String email(){
        return this.email();
    }
    public void email(String email){
        this.email = email;
    }
    public String toString(){
        return "Nome: " + this.nome + "Ano nascimento: " + this.ano_nascimento;
    }
}
