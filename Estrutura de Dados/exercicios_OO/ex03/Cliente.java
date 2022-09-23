package exercicios_OO.ex03;



public class Cliente extends ProdutoTeste {

	private int codCli;
	private String nomeCli;
	private String enderecoCli;
	private String telefoneCli;
	
	public Cliente(int cod, String nome, String endereco, String telefone) {
		cod = codCli;
		nome = nomeCli;
		endereco = enderecoCli;
		telefone = telefoneCli;
	}
	
	public Cliente() {
	}

    // Método de acesso]
	public int getCod() {
		return this.codCli;
	}
	
	public String getNomeCli() {
		return this.nomeCli;
	}
	
	public String getEnderecoCli() {
		return this.enderecoCli;
	}
	
	public String getTelefoneCli() {
		return this.telefoneCli;
	}
	
	public void setCod(int cod) {
		this.codCli = cod;
	}
	
	public void setNomeCli(String nome) {
		this.nomeCli = nome;
	}
	
	public void setEndereco(String endereco) {
		this.enderecoCli = endereco;
	}
	
	public void setTelefone(String telefone) {
		this.telefoneCli = telefone;
	}
	
	public void imprimirCliente() {
		System.out.println("Nome do cliente: " + nomeCli);
		System.out.println("Cod do cliente: " + codCli);
		System.out.println("Endereco do cliente: " + enderecoCli);
		System.out.println("Tel do cliente: " + telefoneCli);
	}
}
