package src;
import java.util.Scanner;

public class Parametros {
    Scanner scanner = new Scanner(System.in);
    private int maxFaixa1;
    private int maxFaixa2;
    private int maxCadastros;
    private int maxEspera;
    private float salarioMinimo;

    public void definirParametros(){
        System.out.println("Digite o valor do salario minimo: ");
        this.salarioMinimo = scanner.nextFloat();

        System.out.println("Digite o máximo de moradores na FAIXA 1: ");
        this.maxFaixa1 = scanner.nextInt();

        System.out.println("Digite o máximo de moradores na FAIXA 2: ");
        this.maxFaixa2 = scanner.nextInt();

        System.out.println("Digite o máximo de moradores na lista de espera: ");
        this.maxEspera = scanner.nextInt();

        this.maxCadastros = maxFaixa1 + maxFaixa2;
        
        System.out.println("Salario: " + salarioMinimo + "\nF1: " + maxFaixa1 + "\nF2: " + maxFaixa2 + "\nEspera: " + maxEspera + "\nMax cadastro: " + maxCadastros);
    }
    public int getMaxFaixa1(){
        return maxFaixa1;
    }

    public int getMaxFaixa2(){
        return maxFaixa2;
    }

    public int getMaxCadastros(){
        return maxCadastros;
    }

    public int getMaxEspera(){
        return maxEspera;
    }

    public float getSalarioMinimo(){
        return salarioMinimo;
    }
}