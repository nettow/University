import java.util.Random;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Deseja gerar quantas funcoes? ");
		int op = sc.nextInt();
		
		for (int i=0;i<op;i++) {
			int x = random.nextInt(5) + 1;
			int y = random.nextInt(6) + 1;
			int h = random.nextInt(3) + 1;
			double result = (0.75 * x) + 5*y - 7*h;
			System.out.println("3/4*" + x +" + "+ " 5*" + y + " - 7" + h + " = " + result);
		}
	}
}
