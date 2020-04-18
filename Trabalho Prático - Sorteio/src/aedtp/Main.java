package aedtp;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Você precisa definir os parametros !");
		System.out.print("Valor do salário minimo atual : ");
		float salarioMinimo = sc.nextFloat();
		
		System.out.print("Qual o valor máximo da faixa 1 (Renda menor que R$ " + salarioMinimo +") ? ");
		int faixa1 = sc.nextInt();
		
		System.out.print("Qual o valor máximo da faixa 2 (Renda maior que R$ " + salarioMinimo + " e menor que R$ " + 3*salarioMinimo +") ? ");
		int faixa2 = sc.nextInt();
		
		System.out.print("Valor máximo da fila de espera ? ");
		int filaEspera = sc.nextInt();
		Morador m = new Morador(salarioMinimo,faixa1,faixa2,filaEspera);
		
		int option;
		do {
			menu();
			option = sc.nextInt();
			switch (option) {
				case 1: m.dadosMorador(); 
				break;
				case 2: m.imprimirLista();
				break;
				case 3: m.imprimirListaCompleta();
				break;
				case 4: System.out.println("falta fazer");
					break;
				case 5:	System.out.print("Digite o CPF do morador (ex: 100200300789): "); 
						m.procurarCpf();
				break;
				case 6: System.out.print("Digite o CPF do morador (ex: 100200300789): ");
						m.deletarMorador();
				break;
			}
		}while(option != 9);
	}
	
	public static void menu() {
		System.out.println("\nMENU");
		System.out.println("[1] Cadastrar Morador");
		System.out.println("[2] Ver Moradores (Simples)");
		System.out.println("[3] Ver Moradores (Completo)");
		System.out.println("[4] Ver Lista de espera");
		System.out.println("[5] Procurar Morador por CPF");
		System.out.println("[6] Deletador morador");
		System.out.println("[7] Sorteio");		
	}
}
