package Model;

public class BankAccount {

	private String accountNumber;
	private String accountName;
	private double balance;
	private MathUtils util;
	
	public BankAccount(String accountNumber,String accountName)
	{
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = 0;
		util = new MathUtils();
	}

	//Deposit	
	public void deposit(double amount)
	{
		balance = util.add(balance,amount);
	}
	
	
	//Withdraw
	public void withdraw(double amount)
	{
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient balance");
		}
	
		balance = util.subtract(balance,amount);
	}
	
	//Get account balance
	public double getBalance() {
		return balance;
	}
	
	//Get account number
	public String getAccountNumber() {
		return accountNumber;
	}
	
	//Get account number
	public String getAccountName() {
		return accountName;
	}
	
	//Check for the same bank account details
	public boolean equals(Object obj){
        BankAccount acc = (BankAccount) obj;
        boolean status = false;
        if(this.accountName.equals(acc.accountName)
                && this.accountNumber.equals(acc.accountNumber) 
                && this.balance == acc.balance){
            status = true;
        }
        return status;
    }
	

}
