package exercicios_OO.ex03;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto = new Produto();
		produto.setCod(1);
		produto.setDesc("Mouse");
		produto.setPreco(56.7);
		
		produto.imprimirProd();
		
		Produto produto2 = new Produto(2, "Teclado", 87.98);
		produto2.imprimirProd();
	}

}
