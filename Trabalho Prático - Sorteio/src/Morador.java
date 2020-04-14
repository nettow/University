package src;
import java.util.Scanner;
public class Morador{
    private String CPF;
    private String nome;
    private int dependentes;
    private float rendaFamiliar;
    private int dddTelefone;
    private int telefone;
    private String enderecoCompleto;
    private int count = 0;
    CDicionario dic = new CDicionario();
    Scanner scanner = new Scanner(System.in);

    public void cadastrarMorador(){
        System.out.println("Digite seu CPF: ");
        CPF = scanner.nextLine();
        dic.adiciona("CPF-"+ count, CPF);
        
        System.out.println("Quantos dependentes: ");
        dependentes = scanner.nextInt();
        dic.adiciona("DEPENDENTES-"+ count, dependentes);

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        dic.adiciona("NOME-"+ count, nome);

        System.out.println("Digite a renda familiar: ");
        rendaFamiliar = scanner.nextFloat();
        dic.adiciona("RENDA-"+ count, rendaFamiliar);

        System.out.println("Digite seu DDD: ");
        dddTelefone = scanner.nextInt();
        dic.adiciona("DDD-"+ count, dddTelefone);

        System.out.println("Digite seu telefone: ");
        telefone = scanner.nextInt();
        dic.adiciona("TELEFONE-"+ count, telefone);

        System.out.println("Digite seu enderço: ");
        enderecoCompleto = scanner.nextLine();
        dic.adiciona("ENDERECO-"+ count, enderecoCompleto);
        
        count++;
        scanner.close();
    }
    
    public void procurarMorador(){

    }
}