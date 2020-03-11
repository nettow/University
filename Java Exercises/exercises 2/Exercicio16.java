import java.util.Scanner;
public class Exercicio16 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o valor de A (inteiro): ");
    int a = sc.nextInt();
    System.out.println("Digite o valor de B (inteiro): ");
    int b = sc.nextInt();
    if (b==0) {
    	System.out.print("Digite outro valor para B que não seja zero");
    	b = sc.nextInt();
    }
    int cont=0;
    int quociente = a;
    do {
    	quociente -= b;
    	cont++;
    }while(quociente !=0);
    System.out.print("A divisao de " + a + " por " + b + " o tem quociente: " + cont);
    }
}