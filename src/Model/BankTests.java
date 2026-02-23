package Model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BankTests {
	
	//SOLUTION!!!
	Bank bank;
	ArrayList<BankAccount> expectedList;
	
	@BeforeEach
	void init() {
		double amount[] = {150, 400, 100, 500};
		String accountNumbers[] = {"12345", "30022", "33211", "23222"};
		String accountNames[] = {"BENNET", "JEAN", "AMBER", "TIMMIE"};
		
		bank = new Bank();
		expectedList = new ArrayList<>();
		for(int i = 0; i < amount.length; i++) {
			BankAccount account = new BankAccount(accountNumbers[i], accountNames[i]);
			bank.addAccount(account);
			account.deposit(amount[i]);
			
			expectedList.add(account);
		}
		
		BankAccount acc = new BankAccount("13224", "PIERRO");
		acc.deposit(800);
		expectedList.add(acc);
		
			
	
	}
	
	//TASK 1
	@Test
	void testNumberofAccounts() {
		init();
		int expectedNumber = 4;
		assertEquals(expectedNumber, bank.getNumberOfAccounts());
	}
	
	@Test
	void testBankLedger() {
		init();
		assertIterableEquals(expectedList, bank.getAccounts());
	}
	
	
	//TASK2
	@Test
	void testImposter() {
		init();
		assertNull(bank.getAccount("9977990066"));
	}
	
	
	
	

//	@Test
//	void testBankLedger() {
//		Bank bank = new Bank();
//		BankAccount acc1 = new BankAccount("12345", "BENNET");
//		BankAccount acc2 = new BankAccount("30022", "JEAN");
//		BankAccount acc3 = new BankAccount("33211", "AMBER");
//		BankAccount acc4 = new BankAccount("23222", "TIMMIE");
//		
//		bank.addAccount(acc1);
//		bank.addAccount(acc2);
//		bank.addAccount(acc3);
//		bank.addAccount(acc4);
//		
//		Bank actual = new Bank();
//		BankAccount acc5 = new BankAccount("13224", "PIERRO");
//		actual.addAccount(acc5);
//		actual.addAccount(acc1);
//		actual.addAccount(acc2);
//		actual.addAccount(acc3);
//		actual.addAccount(acc4);
//			
//		
//		assertEquals(4, bank.getNumberOfAccounts());
//		//assertEquals(bank, actual);
//		assertNotEquals("13224", bank.getAccount("13224"));
//		
//	}
//	
//	@Test
//	void testBankDay4(){
//		Bank bank = new Bank();
//		//BankAccount acc1 = new BankAccount("12345", "BENNET");
//				
//		//assertThrows(NullPointerException.class, () -> bank.getAccount("9977990066").getAccountNumber());
//		assertNull(bank.getAccount("9977990066"));
//	}
//	
//	@Test 
//	//Technically correct but not really coz we are missing the states at the top
//	void testBankWithdraw(){
//		Bank bank = new Bank();
//		BankAccount acc3 = new BankAccount("33211", "AMBER");
//		bank.addAccount(acc3);
//		bank.deposit("33211", 100);
//		
//		assertThrows(IllegalArgumentException.class, () -> bank.withdraw("33211", 200));
//		
//	}
//	
//	@Test
//	void testBankNewAccount() {
//		Bank bank = new Bank();
//		BankAccount acc6 = new BankAccount("13456", "JOHN");
//		bank.addAccount(acc6);
//		bank.deposit("13456", 500);
//		
//		//assertEquals("13456", bank.getAccount("13456").getAccountNumber());
//		//assertTrue(acc6.equals(bank.getAccounts().get(0)));
//		//assertFalse(acc6.getBalance()== 0); //weak testing
//		
//		//Test that balance == 500
//		//Verify that number of accounts increased
//		assertEquals(1, bank.getNumberOfAccounts());
//		assertEquals(500, bank.getAccount("13456").getBalance());
//		
//	}
//	
//	@Test
//	void testBankRemove() {
//		//test both withdrawal and removal(JEAN)
//		Bank bank = new Bank();
//		BankAccount acc2 = new BankAccount("30022", "JEAN");
//		bank.addAccount(acc2);
//		acc2.deposit(400.00);
//		bank.withdraw("30022", 400);
//		
//		assertTrue(acc2.getBalance() == 0);
//		bank.removeAccount("30022");
//		
//		assertNull(bank.getAccount("30022"));
//		assertEquals(0, bank.getNumberOfAccounts());
//		
//	}
//	
//	
//	@Test
//	void testBankBalance() {
//		Bank bank =  new Bank();
//		BankAccount acc4 = new BankAccount("23222", "TIMMIE");
//		bank.addAccount(acc4);
//		bank.deposit("23222", 500.00);
//		bank.deposit("23222", 400.00);
//		
//		
//		
//		assertEquals( 500, bank.getAccount("23222").getBalance());
//	}
	
	
}
