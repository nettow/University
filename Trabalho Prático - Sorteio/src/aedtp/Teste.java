package aedtp;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Voc� precisa definir os parametros !");
		System.out.println("Qual o valor do sal�rio minimo atual? ");
		float salarioMinimo = sc.nextFloat();
		
		System.out.println("Valor m�ximo da faixa 1: ");
		int faixa1 = sc.nextInt();
		
		System.out.println("Valor m�ximo da faixa 2: ");
		int faixa2 = sc.nextInt();
		
		System.out.println("Valor m�ximo da fila de espera: ");
		int filaEspera = sc.nextInt();
		CadastrarMorador cadastro = new CadastrarMorador(salarioMinimo,faixa1,faixa2,filaEspera);
		
		cadastro.dadosMorador();
		sc.close();
	}

}
