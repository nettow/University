import java.util.Random;

public class Account {
	public int numberAccount;
	protected char typeAccount;
	public String owner;
	public float balanceAccount;
	public boolean open;
	public int monthlyPayment;
	private int password;

	public Account() { // Construct
		this.setBalanceAccount(0);
		this.setOpen(false);
	}
	public void status() {
		System.out.println("Conta: " + this.getNumberAccount());
		System.out.println("Dono: " + this.getOwner());
		System.out.println("Tipo de conta: " + this.getTypeAccount());
		System.out.println("Conta aberta: " + this.isOpen());
		System.out.println("Saldo: " + this.getBalanceAccount());
		System.out.println("\n");
	}

	public void openAccount(String nome,int senha, char typeAccount) {
		Random random = new Random();
		this.setNumberAccount(random.nextInt(1000));
		setOwner(nome);
		setTypeAccount(typeAccount);
		if (typeAccount == 'c') {
			this.setBalanceAccount(50);
			this.setMonthlyPayment(12);
		}
		else {
			this.setBalanceAccount(12);
			this.setBalanceAccount(150);
		}
		this.setSenha(senha);
		this.setOpen(true);
		System.out.println("Conta aberta!");
	}
	
	public void closeAccount() {
		if (this.getBalanceAccount() > 0) {
			System.out.println("Ainda h� R$" + getBalanceAccount() + " na sua conta.");
			return;
		} else if (this.getBalanceAccount() < 0) {
			System.out.println("H� d�bitos de R$ " + getBalanceAccount() * -1 + "na sua conta");
		}else {
			System.out.println("Conta fechada com sucesso.");
			this.setOpen(false);
		}
	}
	
	public void deposit(float depositoValue) {
		if (this.isOpen()) {
			this.setBalanceAccount(this.getBalanceAccount() + depositoValue);
			System.out.println("Deposito realizado na conta de " + this.getOwner());
		} else {
			System.out.println("Essa conta n�o est� aberta");
		}
	}

	public void withdrawal(String dono,int senha, float saqueValue) {
		if (this.isOpen()) {
			if (this.getOwner() == dono && this.getPassword() == senha) {
				if (this.getBalanceAccount() <= saqueValue) {
					this.setBalanceAccount(this.getBalanceAccount() - saqueValue);
					System.out.println("Saque de R$ " + saqueValue + " efetivado.");
				}
				else 
					System.out.println("Essa conta n�o tem dinheiro suficiente");
			} else 
				System.out.println("Essa conta n�o pertence a este dono ou a senha est� incorreta");
		} else
			System.out.println("Essa conta n�o est� aberta");
	}

	public void monthlyPayment() {
		if (this.isOpen())
			this.setBalanceAccount(this.getBalanceAccount() - this.getMonthlyPayment());
		System.out.println("Mensalidade descontada na conta de " + this.getOwner());
	}
	public int getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(int monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public char getTypeAccount() {
		return typeAccount;
	}

	public void setTypeAccount(char typeAccount) {
		this.typeAccount = typeAccount;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public float getBalanceAccount() {
		return balanceAccount;
	}

	public void setBalanceAccount(float BalanceAccount) {
		this.balanceAccount = BalanceAccount;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
	
	private int getPassword() {
		return password;
	}
	private void setSenha(int password) {
		this.password = password;
	}
	
}
