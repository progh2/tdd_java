package kr.hs.emirim.progh2.bankbusiness.test;

import static org.junit.Assert.*;

import org.junit.Test;

import kr.hs.emirim.progh2.bankbusiness.main.Account;

public class AccountTest {
	@Test
	public void testCreateAccount() throws Exception {
		Account account = new Account(10000);
		assertNotEquals("계좌생성 실패!", null, account);
	}

	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		assertEquals("계좌조회 실패!", 10000, account.getBalance());

		account = new Account(1000);
		assertEquals("계좌조회 실패!", 1000, account.getBalance());

		account = new Account(500);
		assertEquals("계좌조회 실패!", 500, account.getBalance());
	}

	@Test
	public void testDeposit() throws Exception {
		Account account = new Account(10000);
		account.deposit(1000);
		assertEquals("계좌입금 실패!", 11000, account.getBalance());
	}

	@Test
	public void testWithdraw() throws Exception {
		Account account = new Account(10000);
		account.withdraw(1000);
		assertEquals("계좌출금 실패!", 9000, account.getBalance());
	}
}
