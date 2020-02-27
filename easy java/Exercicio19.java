import java.util.Scanner;
public class Exercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o n-esimo termo da sequencia H: ");
		int n = sc.nextInt();
		double resultado=0;
		for (int i=0;i<n;i++) {
			resultado = resultado + (1/n);
			
		}
		System.out.println("Resultado da sequencia:  " + resultado);

	}

}