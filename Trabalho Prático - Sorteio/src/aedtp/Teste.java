package aedtp;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Você precisa definir os parametros !");
		System.out.println("Qual o valor do salário minimo atual? ");
		float salarioMinimo = sc.nextFloat();
		
		System.out.println("Valor máximo da faixa 1: ");
		int faixa1 = sc.nextInt();
		
		System.out.println("Valor máximo da faixa 2: ");
		int faixa2 = sc.nextInt();
		
		System.out.println("Valor máximo da fila de espera: ");
		int filaEspera = sc.nextInt();
		CadastrarMorador cadastro = new CadastrarMorador(salarioMinimo,faixa1,faixa2,filaEspera);
		
		cadastro.dadosMorador();
		sc.close();
	}

}
