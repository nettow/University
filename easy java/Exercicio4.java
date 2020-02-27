import java.util.Scanner;
import java.util.Random;
public class Exercicio4 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      Random random = new Random();
	      
	      for (int i=0;i<50;i++){
	          int aleatorio = (random.nextInt(50) + 1);
	               if (aleatorio % 2 !=0){
	            double area = 3.14 * (aleatorio*aleatorio);
	            System.out.println("Area " + (i+1) + " com o raio " + aleatorio + " eh igual a: " + area);
	            }
	      }
	}

}
