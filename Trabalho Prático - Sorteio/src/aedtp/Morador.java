package aedtp;

import java.util.Scanner;

public class Morador {
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	private float renda;
	private int dependentes;
	private int faixa;
	private boolean espera;

	private int qtdFaixa1 = 0, qtdFaixa2 = 0, qtdEspera = 0;
	private int maxFaixa1,maxFaixa2,maxFilaEspera;
	private float salarioMinimo;
	
	private CDicionario save = new CDicionario();
	
	public Morador(float salarioMinimo, int faixa1, int faixa2, int filaEspera) {
		this.salarioMinimo = salarioMinimo;
		this.maxFaixa1 = faixa1;
		this.maxFaixa2 = faixa2;
		this.maxFilaEspera = filaEspera;
	}
	
	public void dadosMorador() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		
		System.out.print("\nDigite o telefone (Apenas numeros): ");
		String telefone = sc.nextLine();
		
		System.out.print("\nDigite o CPF (Apenas números): ");
		String cpf = sc.nextLine();
		
		System.out.print("\nDigite a renda familiar: ");
		float renda = sc.nextFloat();
		
		System.out.print("\nDigite quantos dependem da sua renda: ");
		int dependentes = sc.nextInt();
		
		//System.out.print("\nDigite o endereço completo : ");
		String endereco = "Rua fodase do moonmento";
		cadastraMorador(nome,cpf,telefone,endereco,renda,dependentes);
	}
	
	public void cadastraMorador(String nome, String cpf, String telefone, String endereco, float renda, int dependentes) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setTelefone(telefone);
		this.setEndereco(endereco);
		this.setRenda(renda);
		this.setDependentes(dependentes);
		if (this.getRenda() < this.getSalarioMinimo()) // renda < salario minimo
			this.setFaixa(1);
		else if (this.getRenda() > this.getSalarioMinimo() && this.getRenda() < this.getSalarioMinimo() * 3)//  renda > salario minimo & renda < salario minimo * 3
			this.setFaixa(2);
		else {
			System.out.println("Renda inválida para os parametros do sorteio!");
			return;
		}
		salvaMorador();
	}
	
	public void salvaMorador() {
		if (this.getFaixa() == 1 && qtdFaixa1 < maxFaixa1) { // Morador é faixa 1 ? tem espaço na faixa 2?
			this.setEspera(false);
			this.setQtdFaixa1(this.getQtdFaixa1() + 1);
			System.out.println("Morador " + this.getNome() + " cadastrado na faixa 1");
		} else if (this.getFaixa() == 2 && qtdFaixa2 < maxFaixa2) {// Morador é faixa 2? tem espaço na faixa 2 ?
			this.setEspera(false);
			this.setQtdFaixa2(this.getQtdFaixa2() + 1);
			System.out.println("Morador " + this.getNome() + " cadastrado na faixa 2!");
		} else {
			this.setEspera(true);
			this.setQtdEspera(this.getQtdEspera() + 1);
			System.out.println("Morador " + this.getNome() + " cadastrado na lista de espera!");
		}
		// Converti alguns dados para STRING para poder salvar no dicionario um array de strings
		String rendaStr = Float.toString(this.getRenda()); 
		String dependentesStr = Integer.toString(this.getDependentes());
		String faixaStr = Integer.toString(this.getFaixa());
		String isEsperaStr = Boolean.toString(this.isEspera());
 		String[] data = {this.getNome(),this.getCpf(),this.getTelefone(),this.getEndereco(),rendaStr,dependentesStr,faixaStr,isEsperaStr};
		//salva os dados como array de strings no dicionario, a chave é o cpf do morador.
 		save.adicionaMorador(this.getCpf(), data);
	}
	
	public void procurarCpf() {
		Scanner sc = new Scanner(System.in);
		String cpf = sc.nextLine();
		save.procuraCpf(cpf);
	}
	public void imprimirLista() {
		save.imprimirListagemSimples();
	}
	
	public void imprimirListaCompleta() {
		save.imprimirListagemCompleta();
	}
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

	public float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		this.renda = renda;
	}

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

	public int getFaixa() {
		return faixa;
	}

	public void setFaixa(int faixa) {
		this.faixa = faixa;
	}

	public boolean isEspera() {
		return espera;
	}

	public void setEspera(boolean espera) {
		this.espera = espera;
	}

	public int getQtdFaixa1() {
		return qtdFaixa1;
	}

	public void setQtdFaixa1(int qtdFaixa1) {
		this.qtdFaixa1 = qtdFaixa1;
	}

	public int getQtdFaixa2() {
		return qtdFaixa2;
	}

	public void setQtdFaixa2(int qtdFaixa2) {
		this.qtdFaixa2 = qtdFaixa2;
	}

	public int getQtdEspera() {
		return qtdEspera;
	}

	public void setQtdEspera(int qtdEspera) {
		this.qtdEspera = qtdEspera;
	}

	public int getMaxFaixa1() {
		return maxFaixa1;
	}

	public void setMaxFaixa1(int maxFaixa1) {
		this.maxFaixa1 = maxFaixa1;
	}

	public int getMaxFaixa2() {
		return maxFaixa2;
	}

	public void setMaxFaixa2(int maxFaixa2) {
		this.maxFaixa2 = maxFaixa2;
	}

	public int getMaxFilaEspera() {
		return maxFilaEspera;
	}

	public void setMaxFilaEspera(int maxFilaEspera) {
		this.maxFilaEspera = maxFilaEspera;
	}

	public float getSalarioMinimo() {
		return salarioMinimo;
	}

	public void setSalarioMinimo(float salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}

	
}
