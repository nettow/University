import java.util.Scanner;
import java.util.Random;
public class Exercicio3 {
	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		final Random random = new Random();

		for (int i = 0; i < 90; i++) {
			final int aleatorio = (random.nextInt(90) + 10);
			final double area = 3.14 * (aleatorio * aleatorio);
	         System.out.println("Area " + (i+1) + " com o raio " + aleatorio + " eh igual a: " + area);
	      }
		
	}
}
