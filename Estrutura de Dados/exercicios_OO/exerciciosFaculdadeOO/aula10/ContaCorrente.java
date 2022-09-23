package exercicios_OO.exerciciosFaculdadeOO.aula10;

public class ContaCorrente extends Conta {

    protected int numeroCartao;
    protected double limiteCartao = 400.00;

    public ContaCorrente(int numeroConta, double saldo, String titular, int numeroCartao) {
        super(numeroConta, saldo, titular);
        this.numeroCartao = numeroCartao;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public boolean comprarCartao (double valor) {
        if(this.limiteCartao >= valor) {
            this.limiteCartao -= valor;
            System.out.println("\nCompra no credito autorizada!");
            return true;
        } else {
            System.out.println("\nCompra no credito nao autorizada!");
            return false;
        }
    }

    public void tarifaMensal (double taxa) {
        this.saldo -= taxa;
        System.out.println("\nFoi descontado R$10,00 pela taxa da conta.");
        System.out.print("Saldo: R$" + this.saldo + "\n");
    }

    public void imprimirContaCorrente() {
        imprimeConta();
        System.out.println("\nDados da conta corrente");
        System.out.println("Numero do cartão: " + this.numeroCartao);
        System.out.println("Limite do cartão: " + this.limiteCartao + "\n");
    }

    @Override
    public void sacar (double valor) {
        if(this.saldo > valor) {
            this.saldo -= valor;
            this.saldo -= 1;
            System.out.println("\nSaque realizado com sucesso!");
        } else {
            System.out.println("\nSaldo insuficiente!");
        }
    }



}

