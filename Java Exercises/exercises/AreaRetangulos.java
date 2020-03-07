import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
	      Scanner sc = new  Scanner(System.in);
	      for(int i=0;i<10;i++){
	         System.out.println("Retangulo numero " + (i+1));
	         System.out.println("Digite a base: ");
	         double base = sc.nextDouble();
	         System.out.println("Digite a altura: ");
	         double altura = sc.nextDouble();
	         double area = base*altura;
	         double perimetro = (2*base) + (2*altura);
	         System.out.println("Area: " + area);
	         System.out.println("Perimetro: " + perimetro + "\n");
	      }
	}
}
