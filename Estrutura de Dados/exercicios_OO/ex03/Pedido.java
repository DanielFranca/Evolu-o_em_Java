package exercicios_OO.ex03;



public class Pedido extends ProdutoTeste {
	private int numeroPed;
	private String dataPed;
	private double valorPed;
	
	public Pedido (int numero, String data, double valor) {
		numero = numeroPed;
		data = dataPed;
		valor = valorPed;
	}
	
	public Pedido() {}
	
	public int getNumeroPed() {
		return this.numeroPed;
	}
	
	public String getDataPed() {
		return this.dataPed;
	}
	
	public double getValorPed() {
		return this.valorPed;
	}
	
	public void imprimirPedido() {
		System.out.println("Numero do pedido: " + numeroPed);
		System.out.println("Data do pedido: " + dataPed);
		System.out.println("Valor do pedido: " + valorPed);
	}
}
