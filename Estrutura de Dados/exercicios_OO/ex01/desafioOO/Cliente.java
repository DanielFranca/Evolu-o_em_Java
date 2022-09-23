package exercicios_OO.desafioOO;

public class Cliente {

	private int codCli;
	private String nomeCli;
	private String EnderecoCli;
	private String TelefoneCli;
	
	public Cliente(int cod, String nome, String endereco, String telefone) {
		cod = codCli;
		nome = nomeCli;
		endereco = EnderecoCli;
		telefone = TelefoneCli;
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
		return this.EnderecoCli;
	}
	
	public String getTelefoneCli() {
		return this.TelefoneCli;
	}
	
	public void setCod(int cod) {
		this.codCli = cod;
	}
	
	public void setNomeCli(String nome) {
		this.nomeCli = nome;
	}
	
	public void setEndereco(String endereco) {
		this.EnderecoCli = endereco;
	}
	
	public void setTelefone(String telefone) {
		this.TelefoneCli = telefone;
	}
	
	public void imprimirCliente() {
		System.out.println("Nome do cliente: " + nomeCli);
		System.out.println("Cod do cliente: " + codCli);
		System.out.println("Endereco do cliente: " + EnderecoCli);
		System.out.println("Tel do cliente: " + TelefoneCli);
	}
}
