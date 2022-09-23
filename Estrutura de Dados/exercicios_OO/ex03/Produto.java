package exercicios_OO.ex03;



public class Produto extends ProdutoTeste {

	private int codProd;
	private String descricaoProd;
	private double precoProd;
	
	public Produto(int cod, String desc, double pr) {
		codProd = cod;
		descricaoProd = desc;
		precoProd = pr;
	}
	
	public Produto() {
	}

	//Métodos de acesso
	public int getCod() {
		return this.codProd;
	}
	
	public String getDesc() {
		return this.descricaoProd;
	}
	
	public double getPreco() {
		return this.precoProd;
	}
	
    //Métodos modificadores
	public void setCod(int codProd) {
		this.codProd = codProd;
	}
	
	public void setDesc(String desc) {
		this.descricaoProd = desc;
	}
	
	public void setPreco(double preco) {
		this.precoProd = preco;
	}
	
	
	public void imprimirProd() {
		System.out.println("Código do produto: " + codProd);
		System.out.println("Descricao do produto: " + descricaoProd);
		System.out.println("Preco do produto: " + precoProd);
	}
	
}
