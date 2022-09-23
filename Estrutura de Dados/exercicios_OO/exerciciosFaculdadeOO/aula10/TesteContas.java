package exercicios_OO.exerciciosFaculdadeOO.aula10;

public class TesteContas {
	public static void main(String[] args) {
		Conta conta = new Conta(15, 500.00, "João");
		ContaCorrente contaCorrente = new ContaCorrente(16, 500.0, "Maria", 98545);
		ContaPoupanca contaPoupanca = new ContaPoupanca(17, 400.0, "José");

		conta.depositar(100);
		System.out.println("Saldo: " + conta.getSaldo());
		conta.sacar(100);
		System.out.println("Saldo: " + conta.getSaldo());

		contaCorrente.depositar(100);
		System.out.println("Saldo: " + contaCorrente.getSaldo());
		contaCorrente.sacar(100);
		System.out.println("Saldo: " + contaCorrente.getSaldo());

		contaPoupanca.depositar(100);
		System.out.println("Saldo: " + contaPoupanca.getSaldo());
		contaPoupanca.sacar(100);
		System.out.println("Saldo: " + contaPoupanca.getSaldo());
		

		contaCorrente.comprarCartao(400);	
		contaCorrente.comprarCartao(400);
		contaCorrente.tarifaMensal(10);
		contaPoupanca.atualizarConta();

		conta.imprimeConta();
		System.out.println("______________________________________________________\n");
		contaCorrente.imprimirContaCorrente();
		System.out.println("______________________________________________________\n");
		contaPoupanca.imprimirContaPoupanca();
	}
}
