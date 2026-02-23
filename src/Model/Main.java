package Model;

public class Main {

	public static void main(String[]args)
	{
		//sample
		Bank bank= new Bank();
		BankAccount account = new BankAccount("1234","Test");
		bank.addAccount(account);
		
		//DAY 1(BENNET)
		BankAccount acc1 = new BankAccount("12345", "BENNET");
		acc1.deposit(500.00);
		bank.addAccount(acc1);
		
		//DAY 2
		acc1.withdraw(350.00);
		bank.withdraw("12345", 350.00);
		
		BankAccount acc2 = new BankAccount("30022", "JEAN");
		acc2.deposit(400.00);
		bank.addAccount(acc2);
		bank.deposit("30022", 400.00);
		
		BankAccount acc3 = new BankAccount("33211", "AMBER");
		acc3.deposit(100.00);
		bank.addAccount(acc3);
		bank.deposit("33211", 100.00);
		
		BankAccount acc4 = new BankAccount("23222", "TIMMIE");
		acc4.deposit(500.00);
		bank.addAccount(acc4);
		
		
		//DAY 3
		acc3.withdraw(200.00);
		bank.withdraw("33211", 200.00);
		acc4.deposit(400.00);
		
		
		//DAY 4
		bank.getAccount("9977990066");
		
		
	}

}
