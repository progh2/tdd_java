package kr.hs.emirim.progh2.bankbusiness.test;

import static org.junit.Assert.*;

import org.junit.Test;

import kr.hs.emirim.progh2.bankbusiness.main.Account;

public class AccountTest {
	@Test
	public void testCreateAccount() throws Exception {
		Account account = new Account();
		if (account == null) {
			throw new Exception("계좌생성 실패!");
		}
	}
	
	@Test
	public void testGetBalance() throws Exception {
		
	}
}
