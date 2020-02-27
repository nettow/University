import java.util.Scanner;
import java.util.Random;

public class Exercicio8{
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      Random random = new Random();
	      double perimetro;
	      double area;
	      
	      System.out.println("Digite um valor inicial p/ base: ");
	      double base1 = sc.nextDouble();
	      System.out.println("Digite um valor final p/ base: ");
	      double base2 = sc.nextDouble();
	      System.out.println("Digite um valor para o passo: ");
	      double passo1 = sc.nextDouble();
	      System.out.println("Digite um valor inicial p/ altura: ");
	      double altura1 = sc.nextDouble();
	      System.out.println("Digite um valor final p/ altura: ");
	      double altura2 = sc.nextDouble();
	      System.out.println("Digite um valor para o passo: ");
	      double passo2 = sc.nextDouble();
	      System.out.println("Parar passo quando atingir: ");
	      double pararpasso = sc.nextDouble();
	      for (double i=0;i<pararpasso;i+=passo1){
	         //double basef = random.nextDouble(base1) + base2;
	         //double alturaf = random.nextDouble(altura1) + altura2;
	         //System.out.println("Area: " + basef*basef + " e Perimetro " + (2*basef) + (2*alturaf));
	      }
	     
	}
}