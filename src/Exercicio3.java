import java.util.Scanner;
import java.util.Random;
public class Exercicio3 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);      
	      Random random = new Random();
	      
	      for (int i=0;i<90;i++){
	         int aleatorio = (random.nextInt(90) + 10);
	         double area = 3.14 * (aleatorio*aleatorio);
	         System.out.println("Area " + (i+1) + " com o raio " + aleatorio + " eh igual a: " + area);
	      }
		
	}
}
