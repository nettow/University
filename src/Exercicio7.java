import java.util.Scanner;
import java.util.Random;

public class Exercicio7 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      Random random = new Random();
	      double base;
	      double altura;
	      double perimetro;
	      double area;
	      System.out.println("Digite quantos quadrados quer gerar: ");
	      int qtde = sc.nextInt();
	      for (int i=0;i<qtde;i++){
	         altura = random.nextInt(3) + 5;
	         base = random.nextInt(9) + 1;
	         System.out.println("Retangulo " + i+1 + " com altura aleatoria: " + altura);
	         System.out.println("Base aleatoria: " + base);
	         area = base * altura;
	         perimetro = (2*base)+(2*altura);
	         System.out.println("Area gerada: " + area);
	         System.out.println("Perimetro gerado: " + perimetro + "\n");
	         
	      }
	}

}
