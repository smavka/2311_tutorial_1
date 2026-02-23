package Model;

import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> accounts;
	
	public Bank() {
		accounts = new ArrayList<>();
	}
	
	public void removeAccount(String accountNumber)
	{
		BankAccount targetAccount = getAccount(accountNumber);
		if(targetAccount == null)
			throw new IllegalArgumentException("Invalid account number entered");
		removeAccount(targetAccount);
	}
	
	public void addAccount(BankAccount account) {
		accounts.add(account);
	}
	
	private void removeAccount(BankAccount account) {
		accounts.remove(account);
	}
	
	public void deposit(String accountNumber, double amount) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        }
    }

    public void withdraw(String accountNumber, double amount) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        }
    }
	
    public int getNumberOfAccounts() {
    	return accounts.size();
    }
    
	public BankAccount getAccount(String accountNumber)
	{
		for (BankAccount account : accounts) {
			if (account.getAccountNumber().equals(accountNumber))
				return account;
		}
		return null;
	}
	
	public ArrayList<BankAccount> getAccounts()
	{
		return accounts;
	}
}

