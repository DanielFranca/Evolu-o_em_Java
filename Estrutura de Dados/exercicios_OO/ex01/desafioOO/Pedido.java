package exercicios_OO.desafioOO;

public class Pedido {
	private int numeroPed;
	private String dataPed;
	private double valorPed;
	
	public Pedido (int numero, String data, double valor) {
		numero = numeroPed;
		data = dataPed;
		valor = valorPed;
	}
	
	public Pedido() {

	}
	
	public int getnumeroPed() {
		return this.numeroPed;
	}
	
	public String getdataPed() {
		return this.dataPed;
	}
	
	public double getvalorPed() {
		return this.valorPed;
	}

	
	public void setnumeroPed(int numero) {
		this.numeroPed = numero;
	}
	
	public void setdataPed(String data) {
		this.dataPed = data;
	}
	
	public void setvalorPed(double valor) {
		this.valorPed = valor;
	}
	
	
	public void imprimirPedido() {
		System.out.println("Numero do pedido: " + numeroPed);
		System.out.println("Data do pedido: " + dataPed);
		System.out.println("Valor do pedido: " + valorPed);
	}
}
