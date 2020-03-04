
public class Aplicacao {

	public static void main(String[] args) {
		Data dt = new Data(7,2,2020);
		System.out.println(dt.Datha());
		dt.proximoDia();
		System.out.println(dt.Datha());
		dt.getDia(2);
		System.out.println(dt.Datha());
		dt.adicionaDias(30);
		System.out.println(dt.Datha());
	}

}
