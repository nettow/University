import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Digite um numero: ");
	      int numberInput = sc.nextInt();
	      
	      for (int i=1;i<=10;i++){
	         System.out.println(numberInput + " X " + i +  " = " +  numberInput*i);
	      }
	   }   
}
