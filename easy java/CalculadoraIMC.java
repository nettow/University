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
		CalculadoraIMC calcImc = new CalculadoraIMC(70,1.70);
			calcImc.calcular();
			
			System.out.println("O IMC eh: " + calcImc.getImc());
			
			if (calcImc.comSobrePeso()) {
				System.out.println("Tem sobrepeso.");
			}
		}
}
