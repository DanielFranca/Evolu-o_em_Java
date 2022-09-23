package exercicios_OO.desafioOO;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto = new Produto();
		produto.setCod(1);
		produto.setDesc("Mouse");
		produto.setPreco(56.7);	
		produto.imprimirProd();

		System.out.println("\n");
		
		Cliente cliente = new Cliente();
		cliente.setCod(2);
		cliente.setNomeCli("Daniel");
		cliente.setEndereco("Augusto fernandes 320");
		cliente.setTelefone("11970375247");
		cliente.imprimirCliente();

		System.out.println("\n");

		Pedido pedido = new Pedido();
		pedido.setnumeroPed(5);
		pedido.setdataPed("09/09/2022");
		pedido.setvalorPed(56.7);
		pedido.imprimirPedido();

	}

}
