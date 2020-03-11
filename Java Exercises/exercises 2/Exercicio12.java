public class Exercicio12{
	public static void main(String[] args) {
		int x=1;
		do {
		for (int i=1;i<=10;i++) {
			System.out.println(x + " X " + i + " = " + i*x);
		}
		System.out.println("");
		x++;
		}while(x<11);
	}
}