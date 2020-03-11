import java.util.Scanner;
import java.util.Random;
public class Exercicio5 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      Random random = new Random();
	      System.out.println("Digite o valor de inicio do raio: ");
	      int x = sc.nextInt();
	      System.out.println("Digite o valor de final do raio: ");
	      int y = sc.nextInt();
	      System.out.println("Digite o valor do incremento: ");
	      int p = sc.nextInt();
	      
	      for (int i=x;i<y;i+=p){
	         double area = 3.14*(i*i);
	         System.out.println("Valor da area de raio " + i + " : " + area);
	      }
	}

}
