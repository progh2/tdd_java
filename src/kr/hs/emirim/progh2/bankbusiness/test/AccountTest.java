package kr.hs.emirim.progh2.bankbusiness.test;

import static org.junit.Assert.*;

import org.junit.Test;

import kr.hs.emirim.progh2.bankbusiness.main.Account;

public class AccountTest {
	@Test
	public void testCreateAccount() throws Exception {
		Account account = new Account(10000);
		if (account == null) {
			fail("���»��� ����!");
		}
	}

	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		if (account.getBalance() != 10000) {
			fail("������ȸ ����!");
		}

		account = new Account(1000);
		if (account.getBalance() != 1000) {
			fail("������ȸ ����!");
		}

		account = new Account(500);
		if (account.getBalance() != 500) {
			fail("������ȸ ����!");
		}
	}
}
