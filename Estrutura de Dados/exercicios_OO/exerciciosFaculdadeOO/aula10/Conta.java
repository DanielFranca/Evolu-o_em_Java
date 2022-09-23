package exercicios_OO.exerciciosFaculdadeOO.aula10;

public class Conta {
    protected int numeroConta;
    protected double saldo;
    protected String titular;
    
    public Conta() {
        this.numeroConta = 0;
        this.saldo = 0.0;
        this.titular = "";
    }
    
    public Conta(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    
    public String getTitular() {
        return titular;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public boolean depositar (double valor) {
        this.saldo += valor;
        return true;
    }

    public void sacar (double valor) {
        if(this.saldo > valor) {
            this.saldo -= valor;
            taxaSaque();
            System.out.println("Saque realizado com sucesso\n");
        }
    }

    public double taxaSaque () {
        return this.saldo -= 4.00;
    }

    public void imprimeConta() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Saldo da conta: " + this.saldo);
    }
}
