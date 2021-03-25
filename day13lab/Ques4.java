package day13lab;

import java.util.HashMap;
import java.util.Map;

public class Ques4 {
	public static void main(String [] args) {
		
		AccountManager am=new AccountManager();
			am.setBalance("ajith",100);
			am.setBalance("raj", 10000);
			System.out.print(am.getBalance("ajith"));
	}
}

class AccountManager
{
	private Map<String,Integer> accountTotals = new HashMap<>(); 	// change in type
	private int retirementFund; 
	public int getBalance(String accountName) { 
		Integer total = (Integer) accountTotals.get(accountName);
	 if (total == null) 
	 total = Integer.valueOf(0); 
	 return total.intValue();
	}
	public void setBalance(String accountName, int amount) { 
			accountTotals.put(accountName, Integer.valueOf(amount));
	} 
	}  
