import java.util.Scanner;

class FibonacciRecursivo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o n-esimo termo de fibonnaci: ");
        int fib = sc.nextInt();
        System.out.println("O " + fib + " termo de fibonaccié igual a: " + fibonnaciIterativo (fib));
    }
    private static int fibonnaciIterativo(int n){
        int a = 1,b = 0;
        int aux = 1;
        for (int i=0; i < n;i++){
            aux = a;
            a = a+b;
            b = aux;
        }
        return aux;
    }
}