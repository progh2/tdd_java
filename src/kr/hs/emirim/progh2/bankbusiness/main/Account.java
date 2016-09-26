package kr.hs.emirim.progh2.bankbusiness.main;

public class Account {
	private int mMoney;

	public Account(int money) {
		mMoney = money;
	}

	public int getBalance() {
		return mMoney;
	}

	public void deposit(int money) {
		mMoney += money;

	}

	public void withdraw(int money) {
		mMoney -= money;

	}

}
