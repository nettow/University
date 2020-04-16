package aedtp;
import java.util.Scanner;
public class CadastrarMorador {
	Morador m = new Morador();
	Scanner sc = new Scanner(System.in);
	CDicionario dic = new CDicionario();
	private int qtdF1 = 0, qtdF2 = 0, qtdEspera = 0;
	private int maxFaixa1,maxFaixa2,maxFilaEspera;
	private float salarioMinimo;
	
	public CadastrarMorador(float salarioMinimo, int faixa1, int faixa2, int filaEspera) {
		this.salarioMinimo = salarioMinimo;
		this.maxFaixa1 = faixa1;
		this.maxFaixa2 = faixa2;
		this.maxFilaEspera = filaEspera;
	}
	
	
	public void dadosMorador(){
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		m.setNome(nome);
		System.out.print("\nDigite o CPF (Apenas números): ");
		String cpf = sc.nextLine();
		m.setCpf(cpf);
		
		System.out.print("\nDigite a renda familiar: ");
		float rendaFamiliar = sc.nextFloat();
		m.setRendaFamiliar(rendaFamiliar);
		
		System.out.print("\nDigite quantos dependem da sua renda: ");
		int dependentes = sc.nextInt();
		m.setQtdeDependentes(dependentes);
		
		System.out.print("\nDigite o telefone: ");
		String telefone = sc.nextLine();
		m.setTelefone(telefone);
		
		System.out.print("\nDigite o endereço completo : ");
		String endereco = sc.nextLine();
		m.setEndereco(endereco);
		
		if (m.getRendaFamiliar() <= salarioMinimo) 
			salvarMoradorFaixa1();
		else if((m.getRendaFamiliar() > salarioMinimo && m.getRendaFamiliar() <= salarioMinimo * 3)) // salarioMinimo < rendaFamiliar < (salarioMinimo * 3) ?
			salvarMoradorFaixa2();
		 	else {
		 		System.out.println("A renda da familia é maior que o permitido para o sorteio !");
		 		System.out.println(salarioMinimo);
		 		System.out.println(m.getRendaFamiliar());
		 	}
		sc.close();
	}
	
	public void salvarMoradorFaixa1() {
		m.setFaixa(1);
		if (qtdF1 >= maxFaixa1) {
			System.out.println("A faixa 1 está cheia! Morador será adicionado na lista de espera.");
			salvarMoradorEspera();
			return;
		}
		String[] data = {m.getNome(),m.getCpf(),Float.toString(m.getRendaFamiliar()),Integer.toString(m.getQtdeDependentes()),m.getTelefone(),m.getEndereco(),Integer.toString(m.getFaixa())};
		qtdF1++;
		dic.adicionaMorador(qtdF1, data);
		System.out.println("Morador adicionado na faixa 1 !");
		dic.imprimeFor();
		dadosMorador();
	}

	public void salvarMoradorFaixa2() {
		m.setFaixa(2);
		if (qtdF2 >= maxFaixa2) {
			System.out.println("A faixa 2 está cheia! Morador será adicionado na lista de espera.");
			salvarMoradorEspera();
			return;
		}
		// talvez passar os dados pro dicionario em um array..?
		String[] data = {m.getNome(),m.getCpf(),Float.toString(m.getRendaFamiliar()),Integer.toString(m.getQtdeDependentes()),m.getTelefone(),m.getEndereco(),Integer.toString(m.getFaixa())};
		qtdF2++;
		dic.adicionaMorador(qtdF2, data);	
		System.out.println("Morador adicionado na faixa 2 !!");
	}

	public void salvarMoradorEspera() {
		if (qtdEspera >= maxFilaEspera) {
			System.out.println("A lista de espera também está cheia :( ");
			return;
		}
		System.out.println("Morador adicionado na fila de espera !");
	}
}
