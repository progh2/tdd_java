package kr.hs.emirim.progh2.bankbusiness.test;

import static org.junit.Assert.*;

import org.junit.Test;

import kr.hs.emirim.progh2.bankbusiness.main.Account;

public class AccountTest {
	@Test
	public void testCreateAccount() throws Exception {
		Account account = new Account(10000);
		assertNotEquals("���»��� ����!", null, account);
	}

	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		assertEquals("������ȸ ����!", 10000, account.getBalance());

		account = new Account(1000);
		assertEquals("������ȸ ����!", 1000, account.getBalance());

		account = new Account(500);
		assertEquals("������ȸ ����!", 500, account.getBalance());
	}

	@Test
	public void testDeposit() throws Exception {
		Account account = new Account(10000);
		account.deposit(1000);
		assertEquals("�����Ա� ����!", 11000, account.getBalance());
	}

	@Test
	public void testWithdraw() throws Exception {
		Account account = new Account(10000);
		account.withdraw(1000);
		assertEquals("������� ����!", 9000, account.getBalance());
	}
}
