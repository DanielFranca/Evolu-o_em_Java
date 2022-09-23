package exercicios_OO.exerciciosFaculdadeOO.aula10;

public class ContaPoupanca extends Conta {

	protected double taxaRendimento = 0.005;

	public ContaPoupanca(int numeroConta, double saldo, String titular) {
		super(numeroConta, saldo, titular);
	}

	public ContaPoupanca() {}

	public void atualizarConta() {
		this.saldo += this.saldo * this.taxaRendimento;
		System.out.println("\nAtualização realizada com sucesso!");
		System.out.println("A taxa de rendimento chegou, seu saldo foi atualizado para: R$ " + this.saldo + "\n");
	}

	public void imprimirContaPoupanca() {
		imprimeConta();
		System.out.println("\nDados da conta poupança");
		System.out.println("Taxa de rendimento: " + this.taxaRendimento + "\n");
	}
}
