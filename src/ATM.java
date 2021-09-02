import java.util.*;

public class ATM {
<<<<<<< Updated upstream
	HashMap<String, Integer> map;
	
=======
	HashMap<String, Double> map;
>>>>>>> Stashed changes
	public ATM() {
		map = new HashMap<String, Integer>();
	}
	
	public void deposit(String id, int amt) {
		map.put(id, amt);
	}
	
<<<<<<< Updated upstream
=======
	public void withdraw(String id, Double amt) {
		
		Double balance = map.get(id);
		if(balance - amt <0) {
			System.out.println("You have an overwithdrawal of $" + (balance-amt));
		}
		else {
			map.put(id, balance-amt);
		}
	}
>>>>>>> Stashed changes
	
	@Override
	public String toString() {
		return "ATM [map=" + map + "]";
	}
<<<<<<< Updated upstream

	public static void main (String [] args) {
		ATM chase = new ATM();
		chase.deposit("COLINYUAN01", 1000000);
		System.out.println(chase.toString());
	}
=======
>>>>>>> Stashed changes
}
