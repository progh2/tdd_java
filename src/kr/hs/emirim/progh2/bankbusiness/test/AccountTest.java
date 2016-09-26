package kr.hs.emirim.progh2.bankbusiness.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import kr.hs.emirim.progh2.bankbusiness.main.Account;

public class AccountTest {
	private Account account;

	@Before
	public void setUp() {
		account = new Account(10000);
	}

	@Test
	public void testCreateAccount() throws Exception {
		setUp();
		assertNotEquals("���»��� ����!", null, account);
	}

	@Test
	public void testGetBalance() throws Exception {
		setUp();
		assertEquals("������ȸ ����!", 10000, account.getBalance());

		account = new Account(1000);
		assertEquals("������ȸ ����!", 1000, account.getBalance());

		account = new Account(500);
		assertEquals("������ȸ ����!", 500, account.getBalance());
	}

	@Test
	public void testDeposit() throws Exception {
		setUp();
		account.deposit(1000);
		assertEquals("�����Ա� ����!", 11000, account.getBalance());
	}

	@Test
	public void testWithdraw() throws Exception {
		setUp();
		account.withdraw(1000);
		assertEquals("������� ����!", 9000, account.getBalance());
	}
}
