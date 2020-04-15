package src;

public class Principal {
    public static void main(String[] args){
        Morador morador = new Morador();
        Parametros parametros = new Parametros();
        System.out.println("Primeiro voce precisa definir os parametros do sorteio: ");
        parametros.definirParametros();
        System.out.println("Parametros salvos! ");
    }
}