import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("ax^2 + bx + c = Y");
	      System.out.println("Digite o valor de A: ");
	      double a = sc.nextDouble();
	      System.out.println(a + "x^2 + bx + c = Y");
	      System.out.println("Digite o valor de B: ");
	      double b = sc.nextDouble();
	      System.out.println(a + "x^2 + " + b + "x + c = Y");
	      System.out.println("Digite o valor de C: ");
	      double c = sc.nextDouble();
	      System.out.println(a + "x^2 + " + b + "x + "+ c + " = Y");
	      System.out.println("Digite o valor de x1: ");
	      double x1 = sc.nextDouble();
	      System.out.println("Digite o valor de x2: ");
	      double x2 = sc.nextDouble();
	      
	      for(double i=x1;i<=x2;i+=1){
	      double result = a * (i*i) + b*i + c;
	      System.out.println("Valor de Y para X variando de " + x1 + " até " + x2 + " é igual a " + result);
	      
	      }
	}

}
