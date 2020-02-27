import java.util.Random;

public class Exercicio6 {
	public static void main(String[] args) {
	    Random random = new Random();
	    double pi = 3.14;
	    double area;
	    for(float i=1;i<=10;i+=0.1){
	           area = 2 * pi * i;
	           System.out.println("Valor da area com raio " + i + " e igual a: " + area);     
	    }
	}
}
