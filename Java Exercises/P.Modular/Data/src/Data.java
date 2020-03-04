
public class Data {
	private int dia,mes,ano;
	
	public Data(int dia,int mes,int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String Datha() {
		return "Today is: " + dia + "/" + mes + "/" + ano;
	}
	
	public int getDia(int d) {
		this.dia = d;
		return dia;
	}
	
	public int getMes(int m) {
		this.mes = m;
		return mes;
	}
	
	public int getAno(int a) {
		this.ano = a;
		return ano;
	}
	
	public void adicionaDias(int dias) {
		dia += dias;
		if (dia > 30) {
			dia -= 30;
			mes++;
		}
	}
	
	public String diaDaSemana() {
		String diaString;
		diaString = "Segunda-feira";
		return (diaString);
	}
	
	public void proximoDia() {
		dia++;
	}
}
