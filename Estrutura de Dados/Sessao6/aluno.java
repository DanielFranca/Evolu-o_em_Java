package Sessao6;
/*
Beneficios da Herança
- Evita a manutenção do código;
- Facilita a manutenção do programa;


Aluno é uma pessoa


- Quando uma classe herda de outra classe ela ganha:
        - TODOS os atributos e métodos da classe herdada;


- Classe aluno é conhecida como:
    -Classe especifica
    -Sub-classe
    -Classe filha

*/

public class aluno extends pessoa {
    
    private String ra;
    
    public aluno(String nome, int ano_nascimento,String email, String ra) {
        super(nome, ano_nascimento, email);
        this.ra = ra;
    }
    public String getra(){
        return this.ra;
    }
    public void setra(String ra) {
        this.ra = ra;
    }
    public String toString(){
        return super.toString() + "\nR.A: " + this.ra;
    }
}

