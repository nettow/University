import java.util.Scanner;
public class Exercicio15 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o numero para calcular seu fatorial: ");
    double n = sc.nextDouble();
    double temp = n;
    double valor = n;
    while(n>1){
        temp=temp*(n-1);
        n--;
    }
    System.out.println("O fatorial de " + valor + " eh igual a: " + temp);
    }
}