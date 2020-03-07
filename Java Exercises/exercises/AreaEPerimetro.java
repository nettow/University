import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	      Scanner sc = new  Scanner(System.in);
	      System.out.println("Digite a base: ");
	      double base = sc.nextDouble();
	      
	      while(base>0){
	         System.out.println("Digite a altura: ");
	         double altura = sc.nextDouble();
	         
	         double area = base*altura;
	         double perimetro = (2*base) + (2*altura);
	         
	         System.out.println("Area: " + area);         
	         System.out.println("Perimetro: " + perimetro);         
	         System.out.println("Digite a base: ");
	         base = sc.nextDouble();
	      }
	      System.out.println("Base menor que zero!\nFechando...");

	}

}
