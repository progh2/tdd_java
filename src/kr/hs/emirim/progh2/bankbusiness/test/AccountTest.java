package kr.hs.emirim.progh2.bankbusiness.test;

public class AccountTest {
	public void testCreateAccount(){
		Account account = new Account();
		if(account == null){
			throw new Exception("계좌생성 실패!");
		}
	}
	
	public static void main(String[] args){
		AccountTest test = new AccountTest();
		test.testCreateAccount();
	}
}
