import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double resultado = 0;
		System.out.println("Digite um numero real: ");
		double real = sc.nextDouble();
		System.out.println("Digite um numero inteiro: ");
		int inteiro = sc.nextInt();
		for (int i=0;i<inteiro;i++) {
			resultado *= real;
		}
		System.out.println("Resultado de real^inteiro: " + resultado);

	}

}
