package src;
import java.util.Scanner;

public class Parametros {
    Scanner scanner = new Scanner(System.in);
    private int maxFila1;
    private int maxFila2;
    private int maxCadastro;
    private int maxEspera;
    private float salarioMinimo;
    public void parametros(){
        System.out.println("Digite o valor do salario minimo: ");
        salarioMinimo = scanner.nextFloat();

        System.out.println("Digite o máximo de moradores na FAIXA 1: ");
        maxFila1 = scanner.nextInt();

        System.out.println("Digite o máximo de moradores na FAIXA 2: ");
        maxFila2 = scanner.nextInt();

        System.out.println("Digite o máximo de moradores na lista de espera: ");
        maxEspera = scanner.nextInt();

        maxCadastro = maxFila1 + maxFila2;
        
        System.out.println("Salario: " + salarioMinimo + "\nF1: " + maxFila1 + "\nF2: " + maxFila2 + "\nEspera: " + maxEspera + "\nMax cadastro: " + maxCadastro);
    }
}