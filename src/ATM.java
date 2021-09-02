import java.util.*;
//Aaron's Code
public class ATM {
<<<<<<< Updated upstream
	
	private HashMap<String, Double> list;
	
	public ATM() {
		list = new HashMap<String, Double>();
	}
	
	public void deposit(String id, double amt) {
		Double originalAmt = 0.0;
		if (list.get(id) != null) {
			originalAmt = list.get(id);
		}
		list.put(id, amt+originalAmt);
	}
	
	public void withdraw(String id, double amt) {
		double accBalance = list.get(id);
		if (amt>accBalance) {
			System.out.println("Error! Not enough money in account!");
			return;
		}
		list.put(id, accBalance-amt);
	}
	
	public String checkBalance(String id) {
		if (list.get(id) != null) {
			String output = ("Account " + id + " has a remaining balance of " + list.get(id));
			return output;
		}
		return "Error! Account does not exist.";
	}

	public String toString() {
		String output = "";
		for (Map.Entry<String, Double> entry : list.entrySet()) {
			output += entry.getKey() + " " + entry.getValue() + "; ";
		}
		return output;
	}
	
=======
	HashMap<String, Double> map;
	
	public ATM() {
		map = new HashMap<String, Double>();
	}
	
	public void deposit(String id, Double amt) {
		map.put(id, amt);
	}
	
	public void withdraw(String id, Double amt) {
		Double balance = map.get(id);
		if(balance - amt <0) {
			System.out.println("You have an overwithdrawal of $" + (balance-amt));
		}
		else {
			map.put(id, balance-amt);
		}
	}
	
	public String checkBalance(String id) {
		String str = ""; 
		if(map.containsKey(id)) {
			Double balance = map.get(id);
			str = "The balance of bank ID "+ id + " is $" + balance;
		}
		else {
			str = "There is no account with the bank ID of "+id;
		}
		
		return str;
	}

>>>>>>> Stashed changes
}
