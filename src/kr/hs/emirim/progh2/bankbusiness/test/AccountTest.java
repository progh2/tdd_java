package kr.hs.emirim.progh2.bankbusiness.test;

import kr.hs.emirim.progh2.bankbusiness.main.Account;

public class AccountTest {
	public void testCreateAccount() throws Exception{
		Account account = new Account();
		if(account == null){
			throw new Exception("계좌생성 실패!");
		}
	}
	
	public static void main(String[] args){
		AccountTest test = new AccountTest();
		try {
			test.testCreateAccount();
		} catch (Exception e) {
			System.out.println("실패(X)");
			e.printStackTrace();			
			return ;
		}
		System.out.println("성공(O)");
	}
}
