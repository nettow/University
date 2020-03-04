import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n-ésimo termo da serie: ");
		int n = sc.nextInt();
		
		int a=0;
		double b=-1;
		double L=0;
		for(int i=0;i<n;i++) {
			
			a +=1;
			b +=2;
			L +=a/Math.sqrt(b); 
		}
		System.out.println("Valor de L apos " + n + " somas da serie:" + L);
	}

}
