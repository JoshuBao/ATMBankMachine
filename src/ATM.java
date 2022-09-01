import java.util.HashMap;
public class ATM {
	
	//for future ref-hasmap doesnt take primitive data types
	HashMap<Integer,Double> accounts;
	public ATM()
	{
		accounts = new HashMap<Integer,Double>();
	}
	
	public void openAccount(int accountNum)
	{
		if (!accounts.containsKey(accountNum))
		{
			accounts.put(accountNum,0.0);
		}
		
	}
	public void openAccount(int accountNum, double initialDeposit)
	{
		if (!accounts.containsKey(accountNum))
		{
			accounts.put(accountNum, initialDeposit);
		}
	}
	public void closeAccount(int accountID)
	{
		//if no balance-close account
		accounts.remove(accountID, 0.0);
		
	}
	public double checkBalance(int accountID)
	{
		//check account id, if doesnt exist return 0.0
		if (accounts.containsKey(accountID))
		{
			return Math.round(accounts.get(accountID) * 10000) / 10000.0;
	
		}
		else
		{
			return 0.0;
		}
	}
	public boolean depositMoney(int accountID, double amount)
	{
		if (accounts.containsKey(accountID) && amount >= 0)
		{
			accounts.put(accountID, accounts.get(accountID) + amount);
			return true;
		}
		else
		{
		return false;
		}
	}
	public boolean withdrawMoney(int accountID, double amount)
	{	
		if(amount < 0)
		{
			return false;
		}
		else if (accounts.containsKey(accountID) && checkBalance(accountID) >= amount)
		{
		accounts.put(accountID, accounts.get(accountID) - amount);
		return true;
		}
		else {
			return false;
		}
	
	}
	public void printAccounts()
	{
		for (Integer name: accounts.keySet()) {
		    String key = name.toString();
		    String value = accounts.get(name).toString();
		    System.out.println(key + " " + value);
		}
	}
	
	
}
