package Model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BankAccountTests {
	
	BankAccount account;
	
	@BeforeEach
	void init() {
		account = new BankAccount("33211", "AMBER");
		account.deposit(100);
	}
	//TASK 3
	@Test
	void testWithdraw() {
		init();
		
		assertThrows(IllegalArgumentException.class, () -> account.withdraw(200) );
	}


}
