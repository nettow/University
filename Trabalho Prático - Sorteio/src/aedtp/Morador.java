package aedtp;

public class Morador {
	private String nome;
	private String cpf;
	private float rendaFamiliar;
	private int qtdeDependentes;
	private String telefone;
	private String endereco;
	private int faixa;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getRendaFamiliar() {
		return rendaFamiliar;
	}
	public void setRendaFamiliar(float rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}
	public int getQtdeDependentes() {
		return qtdeDependentes;
	}
	public void setQtdeDependentes(int qtdeDependentes) {
		this.qtdeDependentes = qtdeDependentes;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getFaixa() {
		return faixa;
	}
	public void setFaixa(int faixa) {
		this.faixa = faixa;
	}
	
}
