
public class Bank {
	public static void main(String[] args) {
		Account p1 = new Account();
		Account p2 = new Account();
		p1.openAccount("nome 1", 123, 'c');
		p2.openAccount("nome 2", 000, 'p');
		
		p1.status();
		p2.status();
		
		p1.deposit(300);
		p2.deposit(500);
		
		p1.status();
		p2.status();
		
		p1.monthlyPayment();
		p2.closeAccount(); // ainda h� dinheiro na conta
		p2.withdrawal("nome 2",001, 650); // senha incorreta 
		p2.closeAccount();
		
		p2.withdrawal("nome 2",000, 650);
		p2.closeAccount();
	}
	
}
