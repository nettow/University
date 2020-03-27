import java.util.Scanner;

public class CalculadoraIMC {
	private double peso, altura, imc;
	
	public CalculadoraIMC(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public void calcular() {
		this.imc = peso / (altura*altura);
	}
	
	public boolean comSobrePeso() {
		return (imc > 25);
	}
	
	public double getImc() {
		return this.imc;
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		float altura;
		float peso;
		System.out.print("Digite a altura: ");
		altura = sc.nextFloat();
		System.out.print("Digite o peso: ");
		peso = sc.nextFloat();
		CalculadoraIMC calcImc = new CalculadoraIMC(peso,altura); // valores
			calcImc.calcular();
			
			System.out.println("O IMC eh: " + calcImc.getImc());
			
			if (calcImc.comSobrePeso()) {
				System.out.println("Tem sobrepeso.");
			}
		}
}