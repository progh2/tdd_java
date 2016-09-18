package kr.hs.emirim.progh2.bb.main;

public class Account {
	private int mBalance;
	public Account(int money) {
		this.mBalance = money;// TODO Auto-generated constructor stub
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return this.mBalance;
	}

	public void deposit(int money) {
		// TODO Auto-generated method stub
		this.mBalance += money;
	}

	public void withdraw(int money) {
		// TODO Auto-generated method stub
		this.mBalance -= money;
	}

}
